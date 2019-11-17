package org.alvin.test.menurule ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: admin_menu_rule--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "MenuRule", description = "admin_menu_rule实体")
public class MenuRule {

    //数据库中的字段
                @ApiModelProperty(value = "id", dataType = "Long")
    private Long id ;//  id
                @ApiModelProperty(value = "id", dataType = "Long")
    private Long id ;//  id
                @ApiModelProperty(value = "did", dataType = "Long")
    private Long did ;//  did
                @ApiModelProperty(value = "did", dataType = "Long")
    private Long did ;//  did
                @ApiModelProperty(value = "mid", dataType = "Long")
    private Long mid ;//  mid
                @ApiModelProperty(value = "mid", dataType = "Long")
    private Long mid ;//  mid
    
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
        * @return did
        */
        public Long getDid(){
            return this.did ;
        }

        /**
        * @param did
        */
        public void setDid(Long did){
            this.did = did;
        }

            /**
        * @return did
        */
        public Long getDid(){
            return this.did ;
        }

        /**
        * @param did
        */
        public void setDid(Long did){
            this.did = did;
        }

            /**
        * @return mid
        */
        public Long getMid(){
            return this.mid ;
        }

        /**
        * @param mid
        */
        public void setMid(Long mid){
            this.mid = mid;
        }

            /**
        * @return mid
        */
        public Long getMid(){
            return this.mid ;
        }

        /**
        * @param mid
        */
        public void setMid(Long mid){
            this.mid = mid;
        }

    }