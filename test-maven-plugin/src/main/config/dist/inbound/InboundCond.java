package org.alvin.test.inbound ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 入库记录--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "InboundCond", description = "入库记录查询条件实体")
public class InboundCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "产品id", dataType = "String")
    private  String  prodId ;//  产品id
        @ApiModelProperty(value = "入库日期", dataType = "Date")
    private  Date  date ;//  入库日期
        @ApiModelProperty(value = "发票类型", dataType = "String")
    private  String  ticketType ;//  发票类型
        @ApiModelProperty(value = "发票状态", dataType = "String")
    private  String  ticketStatus ;//  发票状态
        @ApiModelProperty(value = "备注", dataType = "String")
    private  String  remark ;//  备注
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
        * @return 产品id
        */
        public String getProdId(){
            return this.prodId ;
        }

        /**
        * @param 产品id
        */
        public void setProdId(String prodId){
            this.prodId = prodId;
        }

            /**
        * @return 入库日期
        */
        public Date getDate(){
            return this.date ;
        }

        /**
        * @param 入库日期
        */
        public void setDate(Date date){
            this.date = date;
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
        * @return 发票状态
        */
        public String getTicketStatus(){
            return this.ticketStatus ;
        }

        /**
        * @param 发票状态
        */
        public void setTicketStatus(String ticketStatus){
            this.ticketStatus = ticketStatus;
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