<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">供应商</span>
            	<span class="expand-value">{{ row.busId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">开户行</span>
            	<span class="expand-value">{{ row.bank }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">账号</span>
            	<span class="expand-value">{{ row.account }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">纳税人识别号</span>
            	<span class="expand-value">{{ row.taxpayerNo }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">备注</span>
            	<span class="expand-value">{{ row.remark }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">bus_type</span>
            	<span class="expand-value">{{ row.busType }}</span>
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
 