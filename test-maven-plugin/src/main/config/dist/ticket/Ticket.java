package org.alvin.test.ticket ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 进销项发票录入--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Ticket", description = "进销项发票录入实体")
public class Ticket {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "供应商id", dataType = "Long")
    private Long vendorId ;//  供应商id
                @ApiModelProperty(value = "税收类型", dataType = "String")
    private String taxType ;//  税收类型
                @ApiModelProperty(value = "姓名", dataType = "String")
    private String targetName ;//  姓名
                @ApiModelProperty(value = "收寄方id", dataType = "Long")
    private Long targetId ;//  收寄方id
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
                @ApiModelProperty(value = "发票类型", dataType = "String")
    private String ticketType ;//  发票类型
                @ApiModelProperty(value = "税率", dataType = "Double")
    private Double rate ;//  税率
                @ApiModelProperty(value = "进出类型", dataType = "String")
    private String type ;//  进出类型
                @ApiModelProperty(value = "客户Id", dataType = "Long")
    private Long cusId ;//  客户Id
    
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
        * @return 供应商id
        */
        public Long getVendorId(){
            return this.vendorId ;
        }

        /**
        * @param 供应商id
        */
        public void setVendorId(Long vendorId){
            this.vendorId = vendorId;
        }

            /**
        * @return 税收类型
        */
        public String getTaxType(){
            return this.taxType ;
        }

        /**
        * @param 税收类型
        */
        public void setTaxType(String taxType){
            this.taxType = taxType;
        }

            /**
        * @return 姓名
        */
        public String getTargetName(){
            return this.targetName ;
        }

        /**
        * @param 姓名
        */
        public void setTargetName(String targetName){
            this.targetName = targetName;
        }

            /**
        * @return 收寄方id
        */
        public Long getTargetId(){
            return this.targetId ;
        }

        /**
        * @param 收寄方id
        */
        public void setTargetId(Long targetId){
            this.targetId = targetId;
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
        * @return 发票类型
        */
        public String getTicketType(){
            return this.ticketType ;
        }

        /**
        * @param 发票类型
        */
        public void setTicketType(String ticketType){
            this.ticketType = ticketType;
        }

            /**
        * @return 税率
        */
        public Double getRate(){
            return this.rate ;
        }

        /**
        * @param 税率
        */
        public void setRate(Double rate){
            this.rate = rate;
        }

            /**
        * @return 进出类型
        */
        public String getType(){
            return this.type ;
        }

        /**
        * @param 进出类型
        */
        public void setType(String type){
            this.type = type;
        }

            /**
        * @return 客户Id
        */
        public Long getCusId(){
            return this.cusId ;
        }

        /**
        * @param 客户Id
        */
        public void setCusId(Long cusId){
            this.cusId = cusId;
        }

    }