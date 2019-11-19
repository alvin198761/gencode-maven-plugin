package org.alvin.gencode.swagger.bean;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import lombok.Data;

import java.util.List;

@Data
public class ActionMethodBean {

	private String method;//方法
	private String url;//地址
	private String note;//说明
	private String description;//注释

	private String name; //方法名称

	private JSONObject params; //参数

	private String reqParamType;//请求参数方式   body formdata
//	private List<Map<Integer, String>> responseMsg;//响应错误信息
//	private String paramsStr;//显示的参数拼装结果
	private String consumes;
	//是否有路径参数
	private boolean hasPath = false;
	//路径参数集合
	private String pathParams;

}
