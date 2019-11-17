package org.alvin.test.category ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 税收分类--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Category", description = "税收分类实体")
public class Category {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "名称", dataType = "String")
    private String name ;//  名称
                @ApiModelProperty(value = "税收编码", dataType = "String")
    private String taxCode ;//  税收编码
    
    //此处可添加查询显示辅助字段

    //getters and setters
            /**
        * @return 主键
        */
        public Long getId(){
            return this.id ;
        }

        /**
        * @param 主键
        */
        public void setId(Long id){
            this.id = id;
        }

            /**
        * @return 名称
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param 名称
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return 税收编码
        */
        public String getTaxCode(){
            return this.taxCode ;
        }

        /**
        * @param 税收编码
        */
        public void setTaxCode(String taxCode){
            this.taxCode = taxCode;
        }

    }