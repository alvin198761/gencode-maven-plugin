package org.alvin.gencode.service;

import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.alvin.mini_inject.annotations.MiniComponent;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;


@Slf4j
/**
 * 文件操作
 */
@MiniComponent
public class VmFileService {

	/**
	 * 扫描文件并执行
	 */
	public List<String> scanTemplate(String dirName, String suffix, List<String> templateDirs) throws IOException {
		File dir = new File(dirName).getCanonicalFile();
		List<String> classList = Lists.newArrayList();

		if (!dir.exists() || !dir.isDirectory()) {
			log.error("没有找到对应的目录");
			return Lists.newArrayList();
		}
		LinkedList<File> files = Lists.newLinkedList();
		if (templateDirs == null || templateDirs.isEmpty()) {
			files.add(dir);
		} else {
			files.addAll(Lists.newArrayList(dir.listFiles((fdir, name) -> templateDirs.contains(name))));
		}
		// 循环读取目录以及子目录下的所有类文件
		while (!files.isEmpty()) {
			File f = files.removeFirst();
			if (f.isDirectory()) {
				//根目录过滤
				if (templateDirs != null && templateDirs.isEmpty()) {
					//之过滤第一层
					if (f.getParentFile().getAbsolutePath().equals(dir.getAbsolutePath())) {
						if (!templateDirs.contains(f.getName())) {
							continue;
						}
					}
				}

				File[] fs = f.listFiles();
				int i = 0;
				for (File childFile : fs) {
					files.add(i++, childFile);
				}
				continue;
			}
			if (!f.getName().toLowerCase().endsWith(suffix)) {
				continue;
			}
			String subPath = f.getAbsolutePath().substring(dir.getAbsolutePath().length());
			classList.add(subPath);
		}

		return classList;
	}
}
