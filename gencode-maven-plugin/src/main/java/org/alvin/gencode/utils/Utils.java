package org.alvin.gencode.utils;

import com.alibaba.fastjson.JSONObject;
import com.google.common.base.CaseFormat;
import com.google.common.base.Joiner;
import lombok.extern.slf4j.Slf4j;
import org.alvin.gencode.run.code.Field;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author gzz_gzz@163.com
 * @功能描述:代码生成辅助类
 * @date 2018-02-15
 */
@Slf4j
public class Utils {

	public static void setTime() {
	}

	/**
	 * @param list   字段列表
	 * @param prefix 前缀
	 * @param suffix 后缀
	 * @param noId   不包括主键
	 */
	public static StringBuilder add(List<Field> list, String prefix, String suffix, boolean noId, String wrap) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			Field field = list.get(i);
			//TODO 这个代码是坑
			sb.append((i != 0 && i % 10 == 0) ? "\"); \r\n\t\t".concat(wrap).concat(".append(\"") : "");
			sb.append(prefix.concat(field.getName()).concat(suffix));
		}
		return noId ? sb.delete(0, sb.indexOf(",") + 1).delete(sb.length() - 1, sb.length()) : sb.delete(sb.length() - 1, sb.length());
	}

//	public static StringBuilder addV1(List<Field> list, String prefix, String suffix, boolean noId) {
//		StringBuilder sb = new StringBuilder();
//		list.forEach(item -> sb.append(prefix.concat(Utils.firstUpper(item.getName())).concat(suffix)));
//		list.forEach(item -> sb.append(prefix.concat(item.getName()).concat(suffix)));
//		return noId ? sb.delete(0, sb.indexOf(",") + 1).delete(sb.length() - 1, sb.length()) : sb.delete(sb.length() - 1, sb.length());
//	}

	public static StringBuilder addV2(List<Field> list, String prefix, String suffix, boolean noId) {
		StringBuilder sb = new StringBuilder();
		list.forEach(item -> sb.append(prefix.concat(item.getUpper_camel()).concat(suffix)));
		return noId ? sb.delete(0, sb.indexOf(",") + 1).delete(sb.length() - 1, sb.length()) : sb.delete(sb.length() - 1, sb.length());
	}

	public static String add(List<Field> list, String prefix, String join) {
		return Joiner.on(join).join(list.stream().map(item -> prefix.concat(item.getName())).collect(Collectors.toList()));
	}

	/**
	 * @方法说明:生成指定个数问号两边加括号
	 */
	public static StringBuilder add(List<Field> list) {
		StringBuilder sb = new StringBuilder("(");
		list.forEach(item -> sb.append("?,"));
		return sb.delete(sb.length() - 1, sb.length()).append(")");
	}

//	/**
//	 * @方法说明: 首字母大写
//	 */
//	public static String firstUpper(String word) {
//		return word.substring(0, 1).toUpperCase() + word.substring(1, word.length());
//	}
//
//	/**
//	 * @方法说明: 首字母小写
//	 */
//	public static String firstLower(String word) {
//		return word.substring(0, 1).toLowerCase() + word.substring(1, word.length());
//	}

	/**
	 * @方法说明: 写文件
	 */
	public static void write(String path, StringBuilder sb) {
		try {
			Files.createDirectories(Paths.get(path).getParent());
			Files.write(Paths.get(path), sb.toString().getBytes("UTF-8"));
		} catch (IOException e) {
			log.info("写入文件时出现异常 " + path);
			e.printStackTrace();
		}
	}

	/**
	 * @方法说明: 实体类文件中是否增加java.util.Date的导入
	 */
	public static String dateImport(List<Field> list) {
		return list.parallelStream().filter(i -> i.getType().equals("Date")).count() > 0 ? "\r\nimport java.util.Date;" : "";
	}

	/**
	 * @方法说明: 去掉第一个单词
	 */
	public static String delFirWord(String tName) {
		return tName.substring(tName.indexOf("_") + 1);
	}

	/**
	 * @方法说明: 实体类文件中是否增加java.math.BigDecimal的导入
	 */
	public static String bigImport(List<Field> list) {
		return list.parallelStream().filter(i -> i.getType().equals("BigDecimal")).count() > 0 ? "\r\nimport java.math.BigDecimal;" : "";
	}

	/**
	 * @方法说明: 主键数据类型
	 */
	public static String keyType(List<Field> list) {
		return list.get(0).getType();
	}

	public static boolean isLinux() {
		return !System.getProperty("os.name").toLowerCase().startsWith("windows");
	}

	public static String path() {
		return isLinux() ? "/data/samba_root/code/" : "d:/";
	}

	public static void chmod() {
		try {
			if (isLinux())
				Runtime.getRuntime().exec("chmod 777 -R " + path());
		} catch (IOException e) {
			log.info("设置权限时出现异常 !");
			e.printStackTrace();
		}
	}

	/////////////////////////////////
	public static void createZip(String sourcePath, String zipPath, boolean delete) {
		try {
			FileOutputStream fos = new FileOutputStream(zipPath);
			ZipOutputStream zos = new ZipOutputStream(fos);
			writeZip(new File(sourcePath), "", zos, delete);
			zos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void delDir(File file) {
		if (file.isDirectory()) {
			for (File subFile : file.listFiles()) {
				delDir(subFile);
			}
		}
		file.delete();
	}

	private static void writeZip(File file, String parentPath, ZipOutputStream zos, boolean delete) {
		try {
			if (file.exists()) {
				if (file.isDirectory()) {
					parentPath = parentPath + file.getName() + File.separator;
					File[] files = file.listFiles();
					if (files.length != 0) {
						for (File f : files) {
							writeZip(f, parentPath, zos, delete);
						}
					} else {
						zos.putNextEntry(new ZipEntry(parentPath));
					}
				} else {
					FileInputStream fis = null;
					fis = new FileInputStream(file);
					ZipEntry ze = new ZipEntry(parentPath + file.getName());
					zos.putNextEntry(ze);
					byte[] content = new byte[1024];
					int len;
					while ((len = fis.read(content)) != -1) {
						zos.write(content, 0, len);
						zos.flush();
					}
					fis.close();
				}
				//删除选项
				if (delete) {
					System.gc();
					if (!file.delete()) {
						file.deleteOnExit();
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 各种书写转化
	 *
	 * @param fList
	 * @return
	 */
	public static JSONObject caseMapper(List<Field> fList) {
		JSONObject mappper = new JSONObject();
		fList.forEach(item -> {
			JSONObject fitem = new JSONObject();
			fitem.put("lower_underscore", CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, item.getName()));
			fitem.put("lower_camel", CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, item.getName()));
			mappper.put(item.getName(), fitem);
		});
		return mappper;
	}

	public static StringBuilder addV1(List<Field> list, String prefix, String suffix, boolean noId) {
		StringBuilder sb = new StringBuilder();
		list.forEach(item -> sb.append(prefix.concat(Utils.delFirWord(item.getName())).concat(suffix)));
		return noId ? sb.delete(0, sb.indexOf(",") + 1).delete(sb.length() - 1, sb.length()) : sb.delete(sb.length() - 1, sb.length());
	}
}
