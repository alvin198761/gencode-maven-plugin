package org.alvin.test.quote ;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
* @类说明: 报价--实体类
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@ApiModel(value = "Quote", description = "报价实体")
public class Quote {

    //数据库中的字段
                @ApiModelProperty(value = "主键", dataType = "Long")
    private Long id ;//  主键
                @ApiModelProperty(value = "客户id", dataType = "Long")
    private Long cusId ;//  客户id
                @ApiModelProperty(value = "报价日期", dataType = "Date")
    private Date date ;//  报价日期
                @ApiModelProperty(value = "备注", dataType = "String")
    private String remark ;//  备注
                @ApiModelProperty(value = "单据状态", dataType = "String")
    private String status ;//  单据状态
    
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
        * @return 客户id
        */
        public Long getCusId(){
            return this.cusId ;
        }

        /**
        * @param 客户id
        */
        public void setCusId(Long cusId){
            this.cusId = cusId;
        }

            /**
        * @return 报价日期
        */
        public Date getDate(){
            return this.date ;
        }

        /**
        * @param 报价日期
        */
        public void setDate(Date date){
            this.date = date;
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
        * @return 单据状态
        */
        public String getStatus(){
            return this.status ;
        }

        /**
        * @param 单据状态
        */
        public void setStatus(String status){
            this.status = status;
        }

    }