package org.alvin.gencode.swagger.bean;

import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

@Data
public class JSMockApiConfig {

    private String url;
    private String ctype; //客户端类型
    private List<JSONObject> tags;
}
