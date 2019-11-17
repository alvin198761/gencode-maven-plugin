package org.alvin.test.role ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: admin_role--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Role", description = "admin_role实体")
public class Role {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Integer")
    private Integer id ;//  主键
                @ApiModelProperty(value = "主键", dataType = "Integer")
    private Integer id ;//  主键
                @ApiModelProperty(value = "名称", dataType = "String")
    private String name ;//  名称
                @ApiModelProperty(value = "名称", dataType = "String")
    private String name ;//  名称
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
    
    //此处可添加查询显示辅助字段

    //getters and setters
            /**
        * @return 主键
        */
        public Integer getId(){
            return this.id ;
        }

        /**
        * @param 主键
        */
        public void setId(Integer id){
            this.id = id;
        }

            /**
        * @return 主键
        */
        public Integer getId(){
            return this.id ;
        }

        /**
        * @param 主键
        */
        public void setId(Integer id){
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
        * @return 备注
        */
        public String getRemark(){
            return this.remark ;
        }

        /**
        * @param 备注
        */
        public void setRemark(String remark){
            this.remark = remark;
        }

            /**
        * @return 备注
        */
        public String getRemark(){
            return this.remark ;
        }

        /**
        * @param 备注
        */
        public void setRemark(String remark){
            this.remark = remark;
        }

    }