package org.alvin.gencode.swagger.bean;

import lombok.Data;

@Data
public class SwgClientMethodBean {

	private String name;
	private String url;
	private String method;
	private boolean hasToken;
	private String comment;
	private String data;
	private String contentType;
}
