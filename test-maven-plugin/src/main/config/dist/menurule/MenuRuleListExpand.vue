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
            	<span class="expand-key">did</span>
            	<span class="expand-value">{{ row.did }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">did</span>
            	<span class="expand-value">{{ row.did }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">mid</span>
            	<span class="expand-value">{{ row.mid }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">mid</span>
            	<span class="expand-value">{{ row.mid }}</span>
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
 