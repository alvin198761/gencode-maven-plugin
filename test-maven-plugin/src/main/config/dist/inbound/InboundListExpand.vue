<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">产品id</span>
            	<span class="expand-value">{{ row.prodId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">入库日期</span>
            	<span class="expand-value">{{ row.date }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">发票类型</span>
            	<span class="expand-value">{{ row.ticketType }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">发票状态</span>
            	<span class="expand-value">{{ row.ticketStatus }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">备注</span>
            	<span class="expand-value">{{ row.remark }}</span>
            </i-col>
            </Row>
  </div>
</template>
<script>
  export default {
    props: {row: Object}
  };
</script>
<style scoped>
  .expand-row {
    margin-bottom: 6px;
  }
  .expand-key {
    font-weight: bold;
    line-height: 25px;
  }
  .expand-value {}
</style>
 