<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.funcId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.funcId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">类型</span>
            	<span class="expand-value">{{ row.type }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">类型</span>
            	<span class="expand-value">{{ row.type }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">颜色</span>
            	<span class="expand-value">{{ row.color }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">颜色</span>
            	<span class="expand-value">{{ row.color }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">图标</span>
            	<span class="expand-value">{{ row.icon }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">图标</span>
            	<span class="expand-value">{{ row.icon }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">名称</span>
            	<span class="expand-value">{{ row.name }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">名称</span>
            	<span class="expand-value">{{ row.name }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">父结点ID</span>
            	<span class="expand-value">{{ row.parentId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">父结点ID</span>
            	<span class="expand-value">{{ row.parentId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">提示信息</span>
            	<span class="expand-value">{{ row.tip }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">提示信息</span>
            	<span class="expand-value">{{ row.tip }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">备注</span>
            	<span class="expand-value">{{ row.remark }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">备注</span>
            	<span class="expand-value">{{ row.remark }}</span>
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
            	<span class="expand-key">地址</span>
            	<span class="expand-value">{{ row.url }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">地址</span>
            	<span class="expand-value">{{ row.url }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">排序编号</span>
            	<span class="expand-value">{{ row.orderNum }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">排序编号</span>
            	<span class="expand-value">{{ row.orderNum }}</span>
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
 