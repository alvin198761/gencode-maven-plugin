package org.alvin.test.vendor ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 供应商--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Vendor", description = "供应商实体")
public class Vendor {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "供应商编号", dataType = "String")
    private String vendorNo ;//  供应商编号
                @ApiModelProperty(value = "供应商名称", dataType = "String")
    private String vendorName ;//  供应商名称
                @ApiModelProperty(value = "供应商地址", dataType = "String")
    private String address ;//  供应商地址
                @ApiModelProperty(value = "供应商级别", dataType = "Byte")
    private Byte level ;//  供应商级别
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
    
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
        * @return 供应商编号
        */
        public String getVendorNo(){
            return this.vendorNo ;
        }

        /**
        * @param 供应商编号
        */
        public void setVendorNo(String vendorNo){
            this.vendorNo = vendorNo;
        }

            /**
        * @return 供应商名称
        */
        public String getVendorName(){
            return this.vendorName ;
        }

        /**
        * @param 供应商名称
        */
        public void setVendorName(String vendorName){
            this.vendorName = vendorName;
        }

            /**
        * @return 供应商地址
        */
        public String getAddress(){
            return this.address ;
        }

        /**
        * @param 供应商地址
        */
        public void setAddress(String address){
            this.address = address;
        }

            /**
        * @return 供应商级别
        */
        public Byte getLevel(){
            return this.level ;
        }

        /**
        * @param 供应商级别
        */
        public void setLevel(Byte level){
            this.level = level;
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