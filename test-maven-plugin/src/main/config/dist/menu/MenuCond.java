package org.alvin.test.menu ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;


/**
* @类说明: admin_menu--查询条件实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "MenuCond", description = "admin_menu查询条件实体")
public class MenuCond  {

    //feilds
        @ApiModelProperty(value = "id", dataType = "Long")
    private  Long  id ;//  id
        @ApiModelProperty(value = "id", dataType = "Long")
    private  Long  id ;//  id
        @ApiModelProperty(value = "icon", dataType = "String")
    private  String  icon ;//  icon
        @ApiModelProperty(value = "icon", dataType = "String")
    private  String  icon ;//  icon
        @ApiModelProperty(value = "parent_id", dataType = "Long")
    private  Long  parentId ;//  parent_id
        @ApiModelProperty(value = "parent_id", dataType = "Long")
    private  Long  parentId ;//  parent_id
        @ApiModelProperty(value = "tip", dataType = "String")
    private  String  tip ;//  tip
        @ApiModelProperty(value = "tip", dataType = "String")
    private  String  tip ;//  tip
        @ApiModelProperty(value = "title", dataType = "String")
    private  String  title ;//  title
        @ApiModelProperty(value = "title", dataType = "String")
    private  String  title ;//  title
        @ApiModelProperty(value = "url", dataType = "String")
    private  String  url ;//  url
        @ApiModelProperty(value = "url", dataType = "String")
    private  String  url ;//  url
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
        * @return icon
        */
        public String getIcon(){
            return this.icon ;
        }

        /**
        * @param icon
        */
        public void setIcon(String icon){
            this.icon = icon;
        }

            /**
        * @return icon
        */
        public String getIcon(){
            return this.icon ;
        }

        /**
        * @param icon
        */
        public void setIcon(String icon){
            this.icon = icon;
        }

            /**
        * @return parent_id
        */
        public Long getParentId(){
            return this.parentId ;
        }

        /**
        * @param parent_id
        */
        public void setParentId(Long parentId){
            this.parentId = parentId;
        }

            /**
        * @return parent_id
        */
        public Long getParentId(){
            return this.parentId ;
        }

        /**
        * @param parent_id
        */
        public void setParentId(Long parentId){
            this.parentId = parentId;
        }

            /**
        * @return tip
        */
        public String getTip(){
            return this.tip ;
        }

        /**
        * @param tip
        */
        public void setTip(String tip){
            this.tip = tip;
        }

            /**
        * @return tip
        */
        public String getTip(){
            return this.tip ;
        }

        /**
        * @param tip
        */
        public void setTip(String tip){
            this.tip = tip;
        }

            /**
        * @return title
        */
        public String getTitle(){
            return this.title ;
        }

        /**
        * @param title
        */
        public void setTitle(String title){
            this.title = title;
        }

            /**
        * @return title
        */
        public String getTitle(){
            return this.title ;
        }

        /**
        * @param title
        */
        public void setTitle(String title){
            this.title = title;
        }

            /**
        * @return url
        */
        public String getUrl(){
            return this.url ;
        }

        /**
        * @param url
        */
        public void setUrl(String url){
            this.url = url;
        }

            /**
        * @return url
        */
        public String getUrl(){
            return this.url ;
        }

        /**
        * @param url
        */
        public void setUrl(String url){
            this.url = url;
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