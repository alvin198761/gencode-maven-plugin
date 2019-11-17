<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.userId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.userId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">姓名</span>
            	<span class="expand-value">{{ row.name }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">姓名</span>
            	<span class="expand-value">{{ row.name }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">会员编号</span>
            	<span class="expand-value">{{ row.password }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">会员编号</span>
            	<span class="expand-value">{{ row.password }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">手机号</span>
            	<span class="expand-value">{{ row.phone }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">手机号</span>
            	<span class="expand-value">{{ row.phone }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">性别</span>
            	<span class="expand-value">{{ row.gender }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">性别</span>
            	<span class="expand-value">{{ row.gender }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">状态</span>
            	<span class="expand-value">{{ row.status }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">状态</span>
            	<span class="expand-value">{{ row.status }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">部门ID</span>
            	<span class="expand-value">{{ row.departmentId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">部门ID</span>
            	<span class="expand-value">{{ row.departmentId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">微信号</span>
            	<span class="expand-value">{{ row.wechat }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">微信号</span>
            	<span class="expand-value">{{ row.wechat }}</span>
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
 