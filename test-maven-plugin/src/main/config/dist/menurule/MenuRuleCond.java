package org.alvin.test.menurule ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: admin_menu_rule--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "MenuRuleCond", description = "admin_menu_rule查询条件实体")
public class MenuRuleCond  {

    //feilds
        @ApiModelProperty(value = "id", dataType = "Long")
    private  Long  id ;//  id
        @ApiModelProperty(value = "id", dataType = "Long")
    private  Long  id ;//  id
        @ApiModelProperty(value = "did", dataType = "Long")
    private  Long  did ;//  did
        @ApiModelProperty(value = "did", dataType = "Long")
    private  Long  did ;//  did
        @ApiModelProperty(value = "mid", dataType = "Long")
    private  Long  mid ;//  mid
        @ApiModelProperty(value = "mid", dataType = "Long")
    private  Long  mid ;//  mid
        //  通用变量
    private List<Long> ids;// 主键列表
    private Integer pageSize = 10; //每页条数
    private Integer total; //总条数
    private Integer pageNum; //当前页码


    //getters and setters
            /**
        * @return id
        */
        public Long getId(){
            return this.id ;
        }

        /**
        * @param id
        */
        public void setId(Long id){
            this.id = id;
        }

            /**
        * @return id
        */
        public Long getId(){
            return this.id ;
        }

        /**
        * @param id
        */
        public void setId(Long id){
            this.id = id;
        }

            /**
        * @return did
        */
        public Long getDid(){
            return this.did ;
        }

        /**
        * @param did
        */
        public void setDid(Long did){
            this.did = did;
        }

            /**
        * @return did
        */
        public Long getDid(){
            return this.did ;
        }

        /**
        * @param did
        */
        public void setDid(Long did){
            this.did = did;
        }

            /**
        * @return mid
        */
        public Long getMid(){
            return this.mid ;
        }

        /**
        * @param mid
        */
        public void setMid(Long mid){
            this.mid = mid;
        }

            /**
        * @return mid
        */
        public Long getMid(){
            return this.mid ;
        }

        /**
        * @param mid
        */
        public void setMid(Long mid){
            this.mid = mid;
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