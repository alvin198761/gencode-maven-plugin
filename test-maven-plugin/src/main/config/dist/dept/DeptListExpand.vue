<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.deptId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.deptId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">上级ID</span>
            	<span class="expand-value">{{ row.parentId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">上级ID</span>
            	<span class="expand-value">{{ row.parentId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">部门名称</span>
            	<span class="expand-value">{{ row.name }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">部门名称</span>
            	<span class="expand-value">{{ row.name }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">可用标志</span>
            	<span class="expand-value">{{ row.enable }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">可用标志</span>
            	<span class="expand-value">{{ row.enable }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">备注</span>
            	<span class="expand-value">{{ row.remark }}</span>
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
 