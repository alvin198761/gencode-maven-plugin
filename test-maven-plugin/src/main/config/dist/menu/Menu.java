package org.alvin.test.menu ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: admin_menu--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Menu", description = "admin_menu实体")
public class Menu {

    //数据库中的字段
                @ApiModelProperty(value = "id", dataType = "Long")
    private Long id ;//  id
                @ApiModelProperty(value = "id", dataType = "Long")
    private Long id ;//  id
                @ApiModelProperty(value = "icon", dataType = "String")
    private String icon ;//  icon
                @ApiModelProperty(value = "icon", dataType = "String")
    private String icon ;//  icon
                @ApiModelProperty(value = "parent_id", dataType = "Long")
    private Long parentId ;//  parent_id
                @ApiModelProperty(value = "parent_id", dataType = "Long")
    private Long parentId ;//  parent_id
                @ApiModelProperty(value = "tip", dataType = "String")
    private String tip ;//  tip
                @ApiModelProperty(value = "tip", dataType = "String")
    private String tip ;//  tip
                @ApiModelProperty(value = "title", dataType = "String")
    private String title ;//  title
                @ApiModelProperty(value = "title", dataType = "String")
    private String title ;//  title
                @ApiModelProperty(value = "url", dataType = "String")
    private String url ;//  url
                @ApiModelProperty(value = "url", dataType = "String")
    private String url ;//  url
    
    //此处可添加查询显示辅助字段

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

    }