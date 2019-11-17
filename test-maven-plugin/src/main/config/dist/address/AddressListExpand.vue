<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">类型</span>
            	<span class="expand-value">{{ row.type }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">电话</span>
            	<span class="expand-value">{{ row.targetPhone }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">地址</span>
            	<span class="expand-value">{{ row.targetAddr }}</span>
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
 