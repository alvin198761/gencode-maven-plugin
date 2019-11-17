package org.alvin.test.sysuser ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: admin_sys_user--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "SysUser", description = "admin_sys_user实体")
public class SysUser {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Integer")
    private Integer userId ;//  主键
                @ApiModelProperty(value = "主键", dataType = "Integer")
    private Integer userId ;//  主键
                @ApiModelProperty(value = "姓名", dataType = "String")
    private String name ;//  姓名
                @ApiModelProperty(value = "姓名", dataType = "String")
    private String name ;//  姓名
                @ApiModelProperty(value = "会员编号", dataType = "String")
    private String password ;//  会员编号
                @ApiModelProperty(value = "会员编号", dataType = "String")
    private String password ;//  会员编号
                @ApiModelProperty(value = "手机号", dataType = "String")
    private String phone ;//  手机号
                @ApiModelProperty(value = "手机号", dataType = "String")
    private String phone ;//  手机号
                @ApiModelProperty(value = "性别", dataType = "Byte")
    private Byte gender ;//  性别
                @ApiModelProperty(value = "性别", dataType = "Byte")
    private Byte gender ;//  性别
                @ApiModelProperty(value = "状态", dataType = "Byte")
    private Byte status ;//  状态
                @ApiModelProperty(value = "状态", dataType = "Byte")
    private Byte status ;//  状态
                @ApiModelProperty(value = "部门ID", dataType = "Integer")
    private Integer departmentId ;//  部门ID
                @ApiModelProperty(value = "部门ID", dataType = "Integer")
    private Integer departmentId ;//  部门ID
                @ApiModelProperty(value = "微信号", dataType = "String")
    private String wechat ;//  微信号
                @ApiModelProperty(value = "微信号", dataType = "String")
    private String wechat ;//  微信号
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
    
    //此处可添加查询显示辅助字段

    //getters and setters
            /**
        * @return 主键
        */
        public Integer getUserId(){
            return this.userId ;
        }

        /**
        * @param 主键
        */
        public void setUserId(Integer userId){
            this.userId = userId;
        }

            /**
        * @return 主键
        */
        public Integer getUserId(){
            return this.userId ;
        }

        /**
        * @param 主键
        */
        public void setUserId(Integer userId){
            this.userId = userId;
        }

            /**
        * @return 姓名
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param 姓名
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return 姓名
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param 姓名
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return 会员编号
        */
        public String getPassword(){
            return this.password ;
        }

        /**
        * @param 会员编号
        */
        public void setPassword(String password){
            this.password = password;
        }

            /**
        * @return 会员编号
        */
        public String getPassword(){
            return this.password ;
        }

        /**
        * @param 会员编号
        */
        public void setPassword(String password){
            this.password = password;
        }

            /**
        * @return 手机号
        */
        public String getPhone(){
            return this.phone ;
        }

        /**
        * @param 手机号
        */
        public void setPhone(String phone){
            this.phone = phone;
        }

            /**
        * @return 手机号
        */
        public String getPhone(){
            return this.phone ;
        }

        /**
        * @param 手机号
        */
        public void setPhone(String phone){
            this.phone = phone;
        }

            /**
        * @return 性别
        */
        public Byte getGender(){
            return this.gender ;
        }

        /**
        * @param 性别
        */
        public void setGender(Byte gender){
            this.gender = gender;
        }

            /**
        * @return 性别
        */
        public Byte getGender(){
            return this.gender ;
        }

        /**
        * @param 性别
        */
        public void setGender(Byte gender){
            this.gender = gender;
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
        * @return 部门ID
        */
        public Integer getDepartmentId(){
            return this.departmentId ;
        }

        /**
        * @param 部门ID
        */
        public void setDepartmentId(Integer departmentId){
            this.departmentId = departmentId;
        }

            /**
        * @return 部门ID
        */
        public Integer getDepartmentId(){
            return this.departmentId ;
        }

        /**
        * @param 部门ID
        */
        public void setDepartmentId(Integer departmentId){
            this.departmentId = departmentId;
        }

            /**
        * @return 微信号
        */
        public String getWechat(){
            return this.wechat ;
        }

        /**
        * @param 微信号
        */
        public void setWechat(String wechat){
            this.wechat = wechat;
        }

            /**
        * @return 微信号
        */
        public String getWechat(){
            return this.wechat ;
        }

        /**
        * @param 微信号
        */
        public void setWechat(String wechat){
            this.wechat = wechat;
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

    }