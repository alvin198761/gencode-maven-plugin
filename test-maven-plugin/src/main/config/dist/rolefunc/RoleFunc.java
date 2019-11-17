package org.alvin.test.rolefunc ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: admin_role_func--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "RoleFunc", description = "admin_role_func实体")
public class RoleFunc {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "角色主键", dataType = "Integer")
    private Integer roleId ;//  角色主键
                @ApiModelProperty(value = "角色主键", dataType = "Integer")
    private Integer roleId ;//  角色主键
                @ApiModelProperty(value = "菜单主键", dataType = "Integer")
    private Integer userId ;//  菜单主键
                @ApiModelProperty(value = "菜单主键", dataType = "Integer")
    private Integer userId ;//  菜单主键
    
    //此处可添加查询显示辅助字段

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
        * @return 角色主键
        */
        public Integer getRoleId(){
            return this.roleId ;
        }

        /**
        * @param 角色主键
        */
        public void setRoleId(Integer roleId){
            this.roleId = roleId;
        }

            /**
        * @return 角色主键
        */
        public Integer getRoleId(){
            return this.roleId ;
        }

        /**
        * @param 角色主键
        */
        public void setRoleId(Integer roleId){
            this.roleId = roleId;
        }

            /**
        * @return 菜单主键
        */
        public Integer getUserId(){
            return this.userId ;
        }

        /**
        * @param 菜单主键
        */
        public void setUserId(Integer userId){
            this.userId = userId;
        }

            /**
        * @return 菜单主键
        */
        public Integer getUserId(){
            return this.userId ;
        }

        /**
        * @param 菜单主键
        */
        public void setUserId(Integer userId){
            this.userId = userId;
        }

    }