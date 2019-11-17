package org.alvin.test.category ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 税收分类--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "CategoryCond", description = "税收分类查询条件实体")
public class CategoryCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "名称", dataType = "String")
    private  String  name ;//  名称
        @ApiModelProperty(value = "税收编码", dataType = "String")
    private  String  taxCode ;//  税收编码
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
        * @return 税收编码
        */
        public String getTaxCode(){
            return this.taxCode ;
        }

        /**
        * @param 税收编码
        */
        public void setTaxCode(String taxCode){
            this.taxCode = taxCode;
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