package org.alvin.test.bill ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 开票信息--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Bill", description = "开票信息实体")
public class Bill {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "供应商", dataType = "Long")
    private Long busId ;//  供应商
                @ApiModelProperty(value = "开户行", dataType = "String")
    private String bank ;//  开户行
                @ApiModelProperty(value = "账号", dataType = "String")
    private String account ;//  账号
                @ApiModelProperty(value = "纳税人识别号", dataType = "String")
    private String taxpayerNo ;//  纳税人识别号
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
                @ApiModelProperty(value = "bus_type", dataType = "Byte")
    private Byte busType ;//  bus_type
    
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
        * @return 供应商
        */
        public Long getBusId(){
            return this.busId ;
        }

        /**
        * @param 供应商
        */
        public void setBusId(Long busId){
            this.busId = busId;
        }

            /**
        * @return 开户行
        */
        public String getBank(){
            return this.bank ;
        }

        /**
        * @param 开户行
        */
        public void setBank(String bank){
            this.bank = bank;
        }

            /**
        * @return 账号
        */
        public String getAccount(){
            return this.account ;
        }

        /**
        * @param 账号
        */
        public void setAccount(String account){
            this.account = account;
        }

            /**
        * @return 纳税人识别号
        */
        public String getTaxpayerNo(){
            return this.taxpayerNo ;
        }

        /**
        * @param 纳税人识别号
        */
        public void setTaxpayerNo(String taxpayerNo){
            this.taxpayerNo = taxpayerNo;
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
        * @return bus_type
        */
        public Byte getBusType(){
            return this.busType ;
        }

        /**
        * @param bus_type
        */
        public void setBusType(Byte busType){
            this.busType = busType;
        }

    }