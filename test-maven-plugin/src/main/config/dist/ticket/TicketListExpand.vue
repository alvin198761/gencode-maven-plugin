<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">供应商id</span>
            	<span class="expand-value">{{ row.vendorId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">税收类型</span>
            	<span class="expand-value">{{ row.taxType }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">姓名</span>
            	<span class="expand-value">{{ row.targetName }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">收寄方id</span>
            	<span class="expand-value">{{ row.targetId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">备注</span>
            	<span class="expand-value">{{ row.remark }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">发票类型</span>
            	<span class="expand-value">{{ row.ticketType }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">税率</span>
            	<span class="expand-value">{{ row.rate }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">进出类型</span>
            	<span class="expand-value">{{ row.type }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">客户Id</span>
            	<span class="expand-value">{{ row.cusId }}</span>
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
 