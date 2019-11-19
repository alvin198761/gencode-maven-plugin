package org.alvin.gencode.run.code;

import lombok.Data;

@Data
public class Table {
	private String t_name;// 表名
	private String comment;// 表名注释
	private String cls_upp;// 类名(首字母大写)
	private String c_name;// 类中文名
}
