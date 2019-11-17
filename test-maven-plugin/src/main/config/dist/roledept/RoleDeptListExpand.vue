<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">角色主键</span>
            	<span class="expand-value">{{ row.roleId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">角色主键</span>
            	<span class="expand-value">{{ row.roleId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">菜单主键</span>
            	<span class="expand-value">{{ row.deptId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">菜单主键</span>
            	<span class="expand-value">{{ row.deptId }}</span>
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
 