<template>
  <div>
    <Row class="expand-row">
 		            <i-col span="6">
            	<span class="expand-key">主键</span>
            	<span class="expand-value">{{ row.id }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">货号</span>
            	<span class="expand-value">{{ row.prodNo }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">税收类型</span>
            	<span class="expand-value">{{ row.taxType }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">产品名称</span>
            	<span class="expand-value">{{ row.prodName }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">规格型号</span>
            	<span class="expand-value">{{ row.specNo }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">产品说明</span>
            	<span class="expand-value">{{ row.note }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">单位</span>
            	<span class="expand-value">{{ row.unit }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">底价</span>
            	<span class="expand-value">{{ row.price }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">售卖价(含税)</span>
            	<span class="expand-value">{{ row.sellPrice }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">市场价(不含税)</span>
            	<span class="expand-value">{{ row.markPrice }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">市场价(含税)</span>
            	<span class="expand-value">{{ row.hasTax }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">价格类型</span>
            	<span class="expand-value">{{ row.priceMode }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">货物来源</span>
            	<span class="expand-value">{{ row.vendorId }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">产品图片1</span>
            	<span class="expand-value">{{ row.pic1 }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">产品图片2</span>
            	<span class="expand-value">{{ row.pic2 }}</span>
            </i-col>
                    <i-col span="6">
            	<span class="expand-key">产品图片3</span>
            	<span class="expand-value">{{ row.pic3 }}</span>
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
 