package org.alvin.test.rolefunc ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: admin_role_func--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "RoleFuncCond", description = "admin_role_func查询条件实体")
public class RoleFuncCond  {

    //feilds
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "主键", dataType = "Long")
    private  Long  id ;//  主键
        @ApiModelProperty(value = "角色主键", dataType = "Integer")
    private  Integer  roleId ;//  角色主键
        @ApiModelProperty(value = "角色主键", dataType = "Integer")
    private  Integer  roleId ;//  角色主键
        @ApiModelProperty(value = "菜单主键", dataType = "Integer")
    private  Integer  userId ;//  菜单主键
        @ApiModelProperty(value = "菜单主键", dataType = "Integer")
    private  Integer  userId ;//  菜单主键
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