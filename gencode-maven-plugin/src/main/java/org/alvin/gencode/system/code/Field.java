package org.alvin.gencode.system.code;

import lombok.Data;

@Data
public class Field {
	private String name;// 字段名
	private String comment;// 注释
	private String type;// 数据类型

	private String bigName; //首字母大小

	private String lower_camel; //单峰驼
	private String upper_camel; //双峰驼


	private Integer length; //字符长度
	private String column_key;//键

	private String dbType; //数据库类型
	private String allTypeName;//类型全称

	private String mb_db_type ;//mybatis 数据库类型

}
