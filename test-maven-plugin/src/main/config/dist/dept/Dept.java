package org.alvin.test.dept ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: admin_dept--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Dept", description = "admin_dept实体")
public class Dept {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Integer")
    private Integer deptId ;//  主键
                @ApiModelProperty(value = "主键", dataType = "Integer")
    private Integer deptId ;//  主键
                @ApiModelProperty(value = "上级ID", dataType = "Integer")
    private Integer parentId ;//  上级ID
                @ApiModelProperty(value = "上级ID", dataType = "Integer")
    private Integer parentId ;//  上级ID
                @ApiModelProperty(value = "部门名称", dataType = "String")
    private String name ;//  部门名称
                @ApiModelProperty(value = "部门名称", dataType = "String")
    private String name ;//  部门名称
                @ApiModelProperty(value = "可用标志", dataType = "Byte")
    private Byte enable ;//  可用标志
                @ApiModelProperty(value = "可用标志", dataType = "Byte")
    private Byte enable ;//  可用标志
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
    
    //此处可添加查询显示辅助字段

    //getters and setters
            /**
        * @return 主键
        */
        public Integer getDeptId(){
            return this.deptId ;
        }

        /**
        * @param 主键
        */
        public void setDeptId(Integer deptId){
            this.deptId = deptId;
        }

            /**
        * @return 主键
        */
        public Integer getDeptId(){
            return this.deptId ;
        }

        /**
        * @param 主键
        */
        public void setDeptId(Integer deptId){
            this.deptId = deptId;
        }

            /**
        * @return 上级ID
        */
        public Integer getParentId(){
            return this.parentId ;
        }

        /**
        * @param 上级ID
        */
        public void setParentId(Integer parentId){
            this.parentId = parentId;
        }

            /**
        * @return 上级ID
        */
        public Integer getParentId(){
            return this.parentId ;
        }

        /**
        * @param 上级ID
        */
        public void setParentId(Integer parentId){
            this.parentId = parentId;
        }

            /**
        * @return 部门名称
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param 部门名称
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return 部门名称
        */
        public String getName(){
            return this.name ;
        }

        /**
        * @param 部门名称
        */
        public void setName(String name){
            this.name = name;
        }

            /**
        * @return 可用标志
        */
        public Byte getEnable(){
            return this.enable ;
        }

        /**
        * @param 可用标志
        */
        public void setEnable(Byte enable){
            this.enable = enable;
        }

            /**
        * @return 可用标志
        */
        public Byte getEnable(){
            return this.enable ;
        }

        /**
        * @param 可用标志
        */
        public void setEnable(Byte enable){
            this.enable = enable;
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