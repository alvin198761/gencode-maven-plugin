package org.alvin.test.record ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 产品信息记录--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "RecordCond", description = "产品信息记录查询条件实体")
public class RecordCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "产品id", dataType = "Byte")
    private  Byte  prodId ;//  产品id
        @ApiModelProperty(value = "总价", dataType = "Float")
    private  Float  total ;//  总价
        @ApiModelProperty(value = "单价", dataType = "Float")
    private  Float  priice ;//  单价
        @ApiModelProperty(value = "数量", dataType = "Float")
    private  Float  num ;//  数量
        @ApiModelProperty(value = "业务ID", dataType = "Long")
    private  Long  busId ;//  业务ID
        @ApiModelProperty(value = "业务类型", dataType = "Byte")
    private  Byte  busType ;//  业务类型
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
        public Byte getProdId(){
            return this.prodId ;
        }

        /**
        * @param 产品id
        */
        public void setProdId(Byte prodId){
            this.prodId = prodId;
        }

            /**
        * @return 总价
        */
        public Float getTotal(){
            return this.total ;
        }

        /**
        * @param 总价
        */
        public void setTotal(Float total){
            this.total = total;
        }

            /**
        * @return 单价
        */
        public Float getPriice(){
            return this.priice ;
        }

        /**
        * @param 单价
        */
        public void setPriice(Float priice){
            this.priice = priice;
        }

            /**
        * @return 数量
        */
        public Float getNum(){
            return this.num ;
        }

        /**
        * @param 数量
        */
        public void setNum(Float num){
            this.num = num;
        }

            /**
        * @return 业务ID
        */
        public Long getBusId(){
            return this.busId ;
        }

        /**
        * @param 业务ID
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