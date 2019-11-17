package org.alvin.test.func ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: 菜单--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "FuncCond", description = "菜单查询条件实体")
public class FuncCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Integer")
    private  Integer  funcId ;//  主键
        @ApiModelProperty(value = "主键", dataType = "Integer")
    private  Integer  funcId ;//  主键
        @ApiModelProperty(value = "类型", dataType = "Byte")
    private  Byte  type ;//  类型
        @ApiModelProperty(value = "类型", dataType = "Byte")
    private  Byte  type ;//  类型
        @ApiModelProperty(value = "颜色", dataType = "String")
    private  String  color ;//  颜色
        @ApiModelProperty(value = "颜色", dataType = "String")
    private  String  color ;//  颜色
        @ApiModelProperty(value = "图标", dataType = "String")
    private  String  icon ;//  图标
        @ApiModelProperty(value = "图标", dataType = "String")
    private  String  icon ;//  图标
        @ApiModelProperty(value = "名称", dataType = "String")
    private  String  name ;//  名称
        @ApiModelProperty(value = "名称", dataType = "String")
    private  String  name ;//  名称
        @ApiModelProperty(value = "父结点ID", dataType = "Integer")
    private  Integer  parentId ;//  父结点ID
        @ApiModelProperty(value = "父结点ID", dataType = "Integer")
    private  Integer  parentId ;//  父结点ID
        @ApiModelProperty(value = "提示信息", dataType = "String")
    private  String  tip ;//  提示信息
        @ApiModelProperty(value = "提示信息", dataType = "String")
    private  String  tip ;//  提示信息
        @ApiModelProperty(value = "备注", dataType = "String")
    private  String  remark ;//  备注
        @ApiModelProperty(value = "备注", dataType = "String")
    private  String  remark ;//  备注
        @ApiModelProperty(value = "状态", dataType = "Byte")
    private  Byte  status ;//  状态
        @ApiModelProperty(value = "状态", dataType = "Byte")
    private  Byte  status ;//  状态
        @ApiModelProperty(value = "地址", dataType = "String")
    private  String  url ;//  地址
        @ApiModelProperty(value = "地址", dataType = "String")
    private  String  url ;//  地址
        @ApiModelProperty(value = "排序编号", dataType = "Short")
    private  Short  orderNum ;//  排序编号
        @ApiModelProperty(value = "排序编号", dataType = "Short")
    private  Short  orderNum ;//  排序编号
        //  通用变量
    private List<Integer> ids;// 主键列表
    private Integer pageSize = 10; //每页条数
    private Integer total; //总条数
    private Integer pageNum; //当前页码


    //getters and setters
            /**
        * @return 主键
        */
        public Integer getFuncId(){
            return this.funcId ;
        }

        /**
        * @param 主键
        */
        public void setFuncId(Integer funcId){
            this.funcId = funcId;
        }

            /**
        * @return 主键
        */
        public Integer getFuncId(){
            return this.funcId ;
        }

        /**
        * @param 主键
        */
        public void setFuncId(Integer funcId){
            this.funcId = funcId;
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
        * @return 颜色
        */
        public String getColor(){
            return this.color ;
        }

        /**
        * @param 颜色
        */
        public void setColor(String color){
            this.color = color;
        }

            /**
        * @return 颜色
        */
        public String getColor(){
            return this.color ;
        }

        /**
        * @param 颜色
        */
        public void setColor(String color){
            this.color = color;
        }

            /**
        * @return 图标
        */
        public String getIcon(){
            return this.icon ;
        }

        /**
        * @param 图标
        */
        public void setIcon(String icon){
            this.icon = icon;
        }

            /**
        * @return 图标
        */
        public String getIcon(){
            return this.icon ;
        }

        /**
        * @param 图标
        */
        public void setIcon(String icon){
            this.icon = icon;
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
        * @return 父结点ID
        */
        public Integer getParentId(){
            return this.parentId ;
        }

        /**
        * @param 父结点ID
        */
        public void setParentId(Integer parentId){
            this.parentId = parentId;
        }

            /**
        * @return 父结点ID
        */
        public Integer getParentId(){
            return this.parentId ;
        }

        /**
        * @param 父结点ID
        */
        public void setParentId(Integer parentId){
            this.parentId = parentId;
        }

            /**
        * @return 提示信息
        */
        public String getTip(){
            return this.tip ;
        }

        /**
        * @param 提示信息
        */
        public void setTip(String tip){
            this.tip = tip;
        }

            /**
        * @return 提示信息
        */
        public String getTip(){
            return this.tip ;
        }

        /**
        * @param 提示信息
        */
        public void setTip(String tip){
            this.tip = tip;
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
        * @return 状态
        */
        public Byte getStatus(){
            return this.status ;
        }

        /**
        * @param 状态
        */
        public void setStatus(Byte status){
            this.status = status;
        }

            /**
        * @return 状态
        */
        public Byte getStatus(){
            return this.status ;
        }

        /**
        * @param 状态
        */
        public void setStatus(Byte status){
            this.status = status;
        }

            /**
        * @return 地址
        */
        public String getUrl(){
            return this.url ;
        }

        /**
        * @param 地址
        */
        public void setUrl(String url){
            this.url = url;
        }

            /**
        * @return 地址
        */
        public String getUrl(){
            return this.url ;
        }

        /**
        * @param 地址
        */
        public void setUrl(String url){
            this.url = url;
        }

            /**
        * @return 排序编号
        */
        public Short getOrderNum(){
            return this.orderNum ;
        }

        /**
        * @param 排序编号
        */
        public void setOrderNum(Short orderNum){
            this.orderNum = orderNum;
        }

            /**
        * @return 排序编号
        */
        public Short getOrderNum(){
            return this.orderNum ;
        }

        /**
        * @param 排序编号
        */
        public void setOrderNum(Short orderNum){
            this.orderNum = orderNum;
        }

        /**
    * @return 主键列表
    */
    public List<Integer> getIds(){
        return this.ids;
    }

    /**
    *@param 主键列表
    */
    public void setIds(Integer ids){
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