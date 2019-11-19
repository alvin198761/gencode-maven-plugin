package org.alvin.gencode.swagger.bean;

import lombok.Data;

import java.util.List;

@Data
public class ActionBean {

	private String date; //生成时间
	private String author;//作者
	private String note;//说明
	private String actionName; //action 说明
	private List<ActionMethodBean> methods; //方法列表
}
