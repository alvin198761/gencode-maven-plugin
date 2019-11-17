package org.alvin.test.dict ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 类型字典--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "DictCond", description = "类型字典查询条件实体")
public class DictCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "type", dataType = "Integer")
    private  Integer  type ;//  type
        @ApiModelProperty(value = "type", dataType = "Integer")
    private  Integer  type ;//  type
        @ApiModelProperty(value = "name", dataType = "String")
    private  String  name ;//  name
        @ApiModelProperty(value = "name", dataType = "String")
    private  String  name ;//  name
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
        * @return type
        */
        public Integer getType(){
            return this.type ;
        }

        /**
        * @param type
        */
        public void setType(Integer type){
            this.type = type;
        }

            /**
        * @return type
        */
        public Integer getType(){
            return this.type ;
        }

        /**
        * @param type
        */
        public void setType(Integer type){
            this.type = type;
        }

            /**
        * @return name
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param name
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return name
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param name
        */
        public void setName(String name){
            this.name = name;
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