package org.alvin.test.person ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 联系人--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Person", description = "联系人实体")
public class Person {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "联系人姓名", dataType = "String")
    private String name ;//  联系人姓名
                @ApiModelProperty(value = "联系人电话", dataType = "String")
    private String phoneNo ;//  联系人电话
                @ApiModelProperty(value = "业务id", dataType = "Long")
    private Long busId ;//  业务id
                @ApiModelProperty(value = "业务类型", dataType = "Byte")
    private Byte busType ;//  业务类型
    
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
        * @return 联系人姓名
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param 联系人姓名
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return 联系人电话
        */
        public String getPhoneNo(){
            return this.phoneNo ;
        }

        /**
        * @param 联系人电话
        */
        public void setPhoneNo(String phoneNo){
            this.phoneNo = phoneNo;
        }

            /**
        * @return 业务id
        */
        public Long getBusId(){
            return this.busId ;
        }

        /**
        * @param 业务id
        */
        public void setBusId(Long busId){
            this.busId = busId;
        }

            /**
        * @return 业务类型
        */
        public Byte getBusType(){
            return this.busType ;
        }

        /**
        * @param 业务类型
        */
        public void setBusType(Byte busType){
            this.busType = busType;
        }

    }