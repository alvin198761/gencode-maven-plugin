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
            	<span class="expand-key">总价</span>
            	<span class="expand-value">{{ row.total }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">单价</span>
            	<span class="expand-value">{{ row.priice }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">数量</span>
            	<span class="expand-value">{{ row.num }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">业务ID</span>
            	<span class="expand-value">{{ row.busId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">业务类型</span>
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
 