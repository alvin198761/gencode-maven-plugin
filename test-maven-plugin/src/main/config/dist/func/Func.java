package org.alvin.test.func ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 菜单--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Func", description = "菜单实体")
public class Func {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Integer")
    private Integer funcId ;//  主键
                @ApiModelProperty(value = "主键", dataType = "Integer")
    private Integer funcId ;//  主键
                @ApiModelProperty(value = "类型", dataType = "Byte")
    private Byte type ;//  类型
                @ApiModelProperty(value = "类型", dataType = "Byte")
    private Byte type ;//  类型
                @ApiModelProperty(value = "颜色", dataType = "String")
    private String color ;//  颜色
                @ApiModelProperty(value = "颜色", dataType = "String")
    private String color ;//  颜色
                @ApiModelProperty(value = "图标", dataType = "String")
    private String icon ;//  图标
                @ApiModelProperty(value = "图标", dataType = "String")
    private String icon ;//  图标
                @ApiModelProperty(value = "名称", dataType = "String")
    private String name ;//  名称
                @ApiModelProperty(value = "名称", dataType = "String")
    private String name ;//  名称
                @ApiModelProperty(value = "父结点ID", dataType = "Integer")
    private Integer parentId ;//  父结点ID
                @ApiModelProperty(value = "父结点ID", dataType = "Integer")
    private Integer parentId ;//  父结点ID
                @ApiModelProperty(value = "提示信息", dataType = "String")
    private String tip ;//  提示信息
                @ApiModelProperty(value = "提示信息", dataType = "String")
    private String tip ;//  提示信息
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
                @ApiModelProperty(value = "状态", dataType = "Byte")
    private Byte status ;//  状态
                @ApiModelProperty(value = "状态", dataType = "Byte")
    private Byte status ;//  状态
                @ApiModelProperty(value = "地址", dataType = "String")
    private String url ;//  地址
                @ApiModelProperty(value = "地址", dataType = "String")
    private String url ;//  地址
                @ApiModelProperty(value = "排序编号", dataType = "Short")
    private Short orderNum ;//  排序编号
                @ApiModelProperty(value = "排序编号", dataType = "Short")
    private Short orderNum ;//  排序编号
    
    //此处可添加查询显示辅助字段

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

    }