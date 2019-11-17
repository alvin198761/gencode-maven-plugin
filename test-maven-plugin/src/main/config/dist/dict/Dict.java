package org.alvin.test.dict ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 类型字典--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Dict", description = "类型字典实体")
public class Dict {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "type", dataType = "Integer")
    private Integer type ;//  type
                @ApiModelProperty(value = "type", dataType = "Integer")
    private Integer type ;//  type
                @ApiModelProperty(value = "name", dataType = "String")
    private String name ;//  name
                @ApiModelProperty(value = "name", dataType = "String")
    private String name ;//  name
    
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
        * @return type
        */
        public Integer getType(){
            return this.type ;
        }

        /**
        * @param type
        */
        public void setType(Integer type){
            this.type = type;
        }

            /**
        * @return type
        */
        public Integer getType(){
            return this.type ;
        }

        /**
        * @param type
        */
        public void setType(Integer type){
            this.type = type;
        }

            /**
        * @return name
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param name
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return name
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param name
        */
        public void setName(String name){
            this.name = name;
        }

    }