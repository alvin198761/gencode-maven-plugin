package org.alvin.test.vendor ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 供应商--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "VendorCond", description = "供应商查询条件实体")
public class VendorCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "供应商编号", dataType = "String")
    private  String  vendorNo ;//  供应商编号
        @ApiModelProperty(value = "供应商名称", dataType = "String")
    private  String  vendorName ;//  供应商名称
        @ApiModelProperty(value = "供应商地址", dataType = "String")
    private  String  address ;//  供应商地址
        @ApiModelProperty(value = "供应商级别", dataType = "Byte")
    private  Byte  level ;//  供应商级别
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