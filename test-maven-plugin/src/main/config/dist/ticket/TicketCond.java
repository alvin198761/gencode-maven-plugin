package org.alvin.test.ticket ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 进销项发票录入--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "TicketCond", description = "进销项发票录入查询条件实体")
public class TicketCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "供应商id", dataType = "Long")
    private  Long  vendorId ;//  供应商id
        @ApiModelProperty(value = "税收类型", dataType = "String")
    private  String  taxType ;//  税收类型
        @ApiModelProperty(value = "姓名", dataType = "String")
    private  String  targetName ;//  姓名
        @ApiModelProperty(value = "收寄方id", dataType = "Long")
    private  Long  targetId ;//  收寄方id
        @ApiModelProperty(value = "备注", dataType = "String")
    private  String  remark ;//  备注
        @ApiModelProperty(value = "发票类型", dataType = "String")
    private  String  ticketType ;//  发票类型
        @ApiModelProperty(value = "税率", dataType = "Double")
    private  Double  rate ;//  税率
        @ApiModelProperty(value = "进出类型", dataType = "String")
    private  String  type ;//  进出类型
        @ApiModelProperty(value = "客户Id", dataType = "Long")
    private  Long  cusId ;//  客户Id
        //  通用变量
    private List<Long> ids;// 主键列表
    private Integer pageSize = 10; //每页条数
    private Integer total; //总条数
    private Integer pageNum; //当前页码


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

        /**
    * @return 主键列表
    */
    public List<Long> getIds(){
        return this.ids;
    }

    /**
    *@param 主键列表
    */
    public void setIds(Long ids){
        this.ids = ids;
    }

    /**
    * @return 每页条数
    */
    public Integer getPageSize(){
        return this.pageSize;
    }

    /**
    *@param 每页条数
    */
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
    }

    /**
    * @return 总条数
    */
    public Integer getTotal(){
        return this.total;
    }

    /**
    *@param 总条数
    */
    public void setTotal(Integer total){
        this.total = total;
    }

        /**
    * @return 当前页码
    */
    public Integer getPageNum(){
        return this.pageNum;
    }

    /**
    *@param 当前页码
    */
    public void setPageNum(Integer pageNum){
        this.pageNum = pageNum;
    }
 
}