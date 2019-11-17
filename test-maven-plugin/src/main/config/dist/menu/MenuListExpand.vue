<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">id</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">id</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">icon</span>
            	<span class="expand-value">{{ row.icon }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">icon</span>
            	<span class="expand-value">{{ row.icon }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">parent_id</span>
            	<span class="expand-value">{{ row.parentId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">parent_id</span>
            	<span class="expand-value">{{ row.parentId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">tip</span>
            	<span class="expand-value">{{ row.tip }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">tip</span>
            	<span class="expand-value">{{ row.tip }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">title</span>
            	<span class="expand-value">{{ row.title }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">title</span>
            	<span class="expand-value">{{ row.title }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">url</span>
            	<span class="expand-value">{{ row.url }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">url</span>
            	<span class="expand-value">{{ row.url }}</span>
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
 