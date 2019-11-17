package org.alvin.test.address ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 收寄信息--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "AddressCond", description = "收寄信息查询条件实体")
public class AddressCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "类型", dataType = "Byte")
    private  Byte  type ;//  类型
        @ApiModelProperty(value = "电话", dataType = "String")
    private  String  targetPhone ;//  电话
        @ApiModelProperty(value = "地址", dataType = "String")
    private  String  targetAddr ;//  地址
        @ApiModelProperty(value = "姓名", dataType = "String")
    private  String  targetName ;//  姓名
        @ApiModelProperty(value = "收寄方id", dataType = "Long")
    private  Long  targetId ;//  收寄方id
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
        * @return 类型
        */
        public Byte getType(){
            return this.type ;
        }

        /**
        * @param 类型
        */
        public void setType(Byte type){
            this.type = type;
        }

            /**
        * @return 电话
        */
        public String getTargetPhone(){
            return this.targetPhone ;
        }

        /**
        * @param 电话
        */
        public void setTargetPhone(String targetPhone){
            this.targetPhone = targetPhone;
        }

            /**
        * @return 地址
        */
        public String getTargetAddr(){
            return this.targetAddr ;
        }

        /**
        * @param 地址
        */
        public void setTargetAddr(String targetAddr){
            this.targetAddr = targetAddr;
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