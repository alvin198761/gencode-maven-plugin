/*产品管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                        <FormItem label="货号" prop="prodNo">
                                                        <Input placeholder="请输入货号" v-model="form.prodNo"/>
                                                        </FormItem>
                                                                                                    <FormItem label="税收类型" prop="taxType">
                                                        <Input placeholder="请输入税收类型" v-model="form.taxType"/>
                                                        </FormItem>
                                                                                                    <FormItem label="产品名称" prop="prodName">
                                                        <Input placeholder="请输入产品名称" v-model="form.prodName"/>
                                                        </FormItem>
                                                                                                    <FormItem label="规格型号" prop="specNo">
                                                        <Input placeholder="请输入规格型号" v-model="form.specNo"/>
                                                        </FormItem>
                                                                                                    <FormItem label="产品说明" prop="note">
                                                        <Input placeholder="请输入产品说明" v-model="form.note"/>
                                                        </FormItem>
                                                                                                    <FormItem label="单位" prop="unit">
                                                        <Input placeholder="请输入单位" v-model="form.unit"/>
                                                        </FormItem>
                                                                                                    <FormItem label="底价" prop="price">
                                                        <Input placeholder="请输入底价" v-model="form.price"/>
                                                        </FormItem>
                                                                                                    <FormItem label="售卖价(含税)" prop="sellPrice">
                                                        <Input placeholder="请输入售卖价(含税)" v-model="form.sellPrice"/>
                                                        </FormItem>
                                                                                                    <FormItem label="市场价(不含税)" prop="markPrice">
                                                        <Input placeholder="请输入市场价(不含税)" v-model="form.markPrice"/>
                                                        </FormItem>
                                                                                                    <FormItem label="市场价(含税)" prop="hasTax">
                                                        <Input placeholder="请输入市场价(含税)" v-model="form.hasTax"/>
                                                        </FormItem>
                                                                                                    <FormItem label="价格类型" prop="priceMode">
                                                        <Input placeholder="请输入价格类型" v-model="form.priceMode"/>
                                                        </FormItem>
                                                                                                    <FormItem label="货物来源" prop="vendorId">
                                                        <Select placeholder="请选择货物来源" v-model="form.vendorId" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="产品图片1" prop="pic1">
                                                        <Input placeholder="请输入产品图片1" v-model="form.pic1"/>
                                                        </FormItem>
                                                                                                    <FormItem label="产品图片2" prop="pic2">
                                                        <Input placeholder="请输入产品图片2" v-model="form.pic2"/>
                                                        </FormItem>
                                                                                                    <FormItem label="产品图片3" prop="pic3">
                                                        <Input placeholder="请输入产品图片3" v-model="form.pic3"/>
                                                        </FormItem>
                                                                                                    <FormItem label="备注" prop="remark">
                                                        <Input placeholder="请输入备注" v-model="form.remark"/>
                                                        </FormItem>
                                                                          <FormItem  :label-width="0">
                        <Button icon="search" @click="refresh" style="margin-right: 5px" title="根据输入的条件查询" type="primary">查询</Button>

                        <Button type="primary" icon="plus" style="margin-right: 5px" @click="doAdd()" title="添加" >添加</Button>
                      </FormItem>
                </Form>
            <Table :loading="loading" :columns="tableHeader" :data="dataList" style="width: 100%">
                          <template slot-scope="{ row,index }" slot="col_id">
                <div>{{ row.id }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_prodNo">
                <div>{{ row.prodNo }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_taxType">
                <div>{{ row.taxType }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_prodName">
                <div>{{ row.prodName }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_specNo">
                <div>{{ row.specNo }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_note">
                <div>{{ row.note }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_unit">
                <div>{{ row.unit }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_price">
                <div>{{ row.price }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_sellPrice">
                <div>{{ row.sellPrice }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_markPrice">
                <div>{{ row.markPrice }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_hasTax">
                <div>{{ row.hasTax }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_priceMode">
                <div>{{ row.priceMode }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_vendorId">
                <div>{{ row.vendorId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_pic1">
                <div>{{ row.pic1 }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_pic2">
                <div>{{ row.pic2 }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_pic3">
                <div>{{ row.pic3 }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_remark">
                <div>{{ row.remark }}</div>
              </template>
                        <template slot-scope="{ row,index }" slot="col_opt">
              <div>
              <Button type="primary" size="small" style="margin-right: 5px" @click="doEdit(row)">编辑</Button>
              <Button type="primary" size="small"   style="margin-right: 5px" @click="doDelete(row)">删除</Button>
              </div>
            </template>
            </Table>
            <br/>
            <div style="text-align: right" v-if="total > 0">
              <Page size="small" :current="page" :total="total" show-total  @on-change="(curr) => {this.page = curr ; this.refresh();}"
              show-sizer @on-page-size-change="(pageSize) => { this.pageSize = pageSize ; this.refresh();}" :page-size="pageSize"  ></Page>
            </div>
        <ProductDialog ref="dialog" :refresh="refresh"></ProductDialog>
  </div>
</template>
<script>
import ProductDialog from './ProductDialog.vue';
import ProductListExpand from './ProductListExpand.vue';
  export default {
    components: {
     ProductDialog,
     ProductListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(ProductListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '货号', key: 'prodNo', slot:'col_prodNo' },
                            {title: '税收类型', key: 'taxType', slot:'col_taxType' },
                            {title: '产品名称', key: 'prodName', slot:'col_prodName' },
                            {title: '规格型号', key: 'specNo', slot:'col_specNo' },
                            {title: '产品说明', key: 'note', slot:'col_note' },
                            {title: '单位', key: 'unit', slot:'col_unit' },
                            {title: '底价', key: 'price', slot:'col_price' },
                            {title: '售卖价(含税)', key: 'sellPrice', slot:'col_sellPrice' },
                            {title: '市场价(不含税)', key: 'markPrice', slot:'col_markPrice' },
                            {title: '市场价(含税)', key: 'hasTax', slot:'col_hasTax' },
                            {title: '价格类型', key: 'priceMode', slot:'col_priceMode' },
                            {title: '货物来源', key: 'vendorId', slot:'col_vendorId' },
                            {title: '产品图片1', key: 'pic1', slot:'col_pic1' },
                            {title: '产品图片2', key: 'pic2', slot:'col_pic2' },
                            {title: '产品图片3', key: 'pic3', slot:'col_pic3' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// 主键
                            prodNo : null,// 货号
                            taxType : null,// 税收类型
                            prodName : null,// 产品名称
                            specNo : null,// 规格型号
                            note : null,// 产品说明
                            unit : null,// 单位
                            price : null,// 底价
                            sellPrice : null,// 售卖价(含税)
                            markPrice : null,// 市场价(不含税)
                            hasTax : null,// 市场价(含税)
                            priceMode : null,// 价格类型
                            vendorId : null,// 货物来源
                            pic1 : null,// 产品图片1
                            pic2 : null,// 产品图片2
                            pic3 : null,// 产品图片3
                            remark : null,// 备注
                    },
        loading: false
      }
    },
    computed: {},
    created: function () {
      this.refresh();
    },
    methods: {
      refresh() {
        const that = this;
        that.loading = true;
        const requestData = {...that.form, page: that.page - 1,size:that.pageSize};
        that.$postBody("/api/product/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取产品列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取产品列表失败：' + res });
		        });
      },
      doAdd() {
        this.$refs["dialog"].addDialog();
      },
      doEdit(row) {
        this.$refs["dialog"].editDialog(row);
      },
      doDelete(row) {
        const that = this;
        that.$Modal.confirm({
          title: '提示',
          content: '您确定要删除吗?',
          closable:true,
          onOk: () => {
            this.$post('/api/product/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取产品列表失败'});
                    return ;
                  }
  		            that.$Message.success({ content: '删除成功' });
  		            that.refresh();
  		          }).catch(res => {
  		            that.$Message.error({ content: '删除失败：' + res });
  		          });
          },
          onCancel: () => {
          }
        });
      }
    }
  }
</script>
<style>
  .expand-row {
    margin-bottom: 6px;
  }
  .expand-key {
    font-weight: bold;
    line-height: 25px;
  }
  .expand-value {}
</style>