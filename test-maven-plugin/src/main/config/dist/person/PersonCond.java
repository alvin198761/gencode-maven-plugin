package org.alvin.test.person ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 联系人--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "PersonCond", description = "联系人查询条件实体")
public class PersonCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "联系人姓名", dataType = "String")
    private  String  name ;//  联系人姓名
        @ApiModelProperty(value = "联系人电话", dataType = "String")
    private  String  phoneNo ;//  联系人电话
        @ApiModelProperty(value = "业务id", dataType = "Long")
    private  Long  busId ;//  业务id
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
        * @return 联系人姓名
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param 联系人姓名
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return 联系人电话
        */
        public String getPhoneNo(){
            return this.phoneNo ;
        }

        /**
        * @param 联系人电话
        */
        public void setPhoneNo(String phoneNo){
            this.phoneNo = phoneNo;
        }

            /**
        * @return 业务id
        */
        public Long getBusId(){
            return this.busId ;
        }

        /**
        * @param 业务id
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