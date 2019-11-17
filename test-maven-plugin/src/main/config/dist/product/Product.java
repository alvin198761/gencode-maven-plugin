package org.alvin.test.product ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 产品--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Product", description = "产品实体")
public class Product {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "货号", dataType = "String")
    private String prodNo ;//  货号
                @ApiModelProperty(value = "税收类型", dataType = "String")
    private String taxType ;//  税收类型
                @ApiModelProperty(value = "产品名称", dataType = "String")
    private String prodName ;//  产品名称
                @ApiModelProperty(value = "规格型号", dataType = "String")
    private String specNo ;//  规格型号
                @ApiModelProperty(value = "产品说明", dataType = "String")
    private String note ;//  产品说明
                @ApiModelProperty(value = "单位", dataType = "String")
    private String unit ;//  单位
                @ApiModelProperty(value = "底价", dataType = "Float")
    private Float price ;//  底价
                @ApiModelProperty(value = "售卖价(含税)", dataType = "Float")
    private Float sellPrice ;//  售卖价(含税)
                @ApiModelProperty(value = "市场价(不含税)", dataType = "Float")
    private Float markPrice ;//  市场价(不含税)
                @ApiModelProperty(value = "市场价(含税)", dataType = "String")
    private String hasTax ;//  市场价(含税)
                @ApiModelProperty(value = "价格类型", dataType = "String")
    private String priceMode ;//  价格类型
                @ApiModelProperty(value = "货物来源", dataType = "Long")
    private Long vendorId ;//  货物来源
                @ApiModelProperty(value = "产品图片1", dataType = "String")
    private String pic1 ;//  产品图片1
                @ApiModelProperty(value = "产品图片2", dataType = "String")
    private String pic2 ;//  产品图片2
                @ApiModelProperty(value = "产品图片3", dataType = "String")
    private String pic3 ;//  产品图片3
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
        * @return 货号
        */
        public String getProdNo(){
            return this.prodNo ;
        }

        /**
        * @param 货号
        */
        public void setProdNo(String prodNo){
            this.prodNo = prodNo;
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
        * @return 产品名称
        */
        public String getProdName(){
            return this.prodName ;
        }

        /**
        * @param 产品名称
        */
        public void setProdName(String prodName){
            this.prodName = prodName;
        }

            /**
        * @return 规格型号
        */
        public String getSpecNo(){
            return this.specNo ;
        }

        /**
        * @param 规格型号
        */
        public void setSpecNo(String specNo){
            this.specNo = specNo;
        }

            /**
        * @return 产品说明
        */
        public String getNote(){
            return this.note ;
        }

        /**
        * @param 产品说明
        */
        public void setNote(String note){
            this.note = note;
        }

            /**
        * @return 单位
        */
        public String getUnit(){
            return this.unit ;
        }

        /**
        * @param 单位
        */
        public void setUnit(String unit){
            this.unit = unit;
        }

            /**
        * @return 底价
        */
        public Float getPrice(){
            return this.price ;
        }

        /**
        * @param 底价
        */
        public void setPrice(Float price){
            this.price = price;
        }

            /**
        * @return 售卖价(含税)
        */
        public Float getSellPrice(){
            return this.sellPrice ;
        }

        /**
        * @param 售卖价(含税)
        */
        public void setSellPrice(Float sellPrice){
            this.sellPrice = sellPrice;
        }

            /**
        * @return 市场价(不含税)
        */
        public Float getMarkPrice(){
            return this.markPrice ;
        }

        /**
        * @param 市场价(不含税)
        */
        public void setMarkPrice(Float markPrice){
            this.markPrice = markPrice;
        }

            /**
        * @return 市场价(含税)
        */
        public String getHasTax(){
            return this.hasTax ;
        }

        /**
        * @param 市场价(含税)
        */
        public void setHasTax(String hasTax){
            this.hasTax = hasTax;
        }

            /**
        * @return 价格类型
        */
        public String getPriceMode(){
            return this.priceMode ;
        }

        /**
        * @param 价格类型
        */
        public void setPriceMode(String priceMode){
            this.priceMode = priceMode;
        }

            /**
        * @return 货物来源
        */
        public Long getVendorId(){
            return this.vendorId ;
        }

        /**
        * @param 货物来源
        */
        public void setVendorId(Long vendorId){
            this.vendorId = vendorId;
        }

            /**
        * @return 产品图片1
        */
        public String getPic1(){
            return this.pic1 ;
        }

        /**
        * @param 产品图片1
        */
        public void setPic1(String pic1){
            this.pic1 = pic1;
        }

            /**
        * @return 产品图片2
        */
        public String getPic2(){
            return this.pic2 ;
        }

        /**
        * @param 产品图片2
        */
        public void setPic2(String pic2){
            this.pic2 = pic2;
        }

            /**
        * @return 产品图片3
        */
        public String getPic3(){
            return this.pic3 ;
        }

        /**
        * @param 产品图片3
        */
        public void setPic3(String pic3){
            this.pic3 = pic3;
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