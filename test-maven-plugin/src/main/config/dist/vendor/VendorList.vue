/*供应商管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                        <FormItem label="供应商编号" prop="vendorNo">
                                                        <Input placeholder="请输入供应商编号" v-model="form.vendorNo"/>
                                                        </FormItem>
                                                                                                    <FormItem label="供应商名称" prop="vendorName">
                                                        <Input placeholder="请输入供应商名称" v-model="form.vendorName"/>
                                                        </FormItem>
                                                                                                    <FormItem label="供应商地址" prop="address">
                                                        <Input placeholder="请输入供应商地址" v-model="form.address"/>
                                                        </FormItem>
                                                                                                    <FormItem label="供应商级别" prop="level">
                                                        <Select placeholder="请选择供应商级别" v-model="form.level" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
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
                          <template slot-scope="{ row,index }" slot="col_vendorNo">
                <div>{{ row.vendorNo }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_vendorName">
                <div>{{ row.vendorName }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_address">
                <div>{{ row.address }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_level">
                <div>{{ row.level }}</div>
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
        <VendorDialog ref="dialog" :refresh="refresh"></VendorDialog>
  </div>
</template>
<script>
import VendorDialog from './VendorDialog.vue';
import VendorListExpand from './VendorListExpand.vue';
  export default {
    components: {
     VendorDialog,
     VendorListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(VendorListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '供应商编号', key: 'vendorNo', slot:'col_vendorNo' },
                            {title: '供应商名称', key: 'vendorName', slot:'col_vendorName' },
                            {title: '供应商地址', key: 'address', slot:'col_address' },
                            {title: '供应商级别', key: 'level', slot:'col_level' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// 主键
                            vendorNo : null,// 供应商编号
                            vendorName : null,// 供应商名称
                            address : null,// 供应商地址
                            level : null,// 供应商级别
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
        that.$postBody("/api/vendor/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取供应商列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取供应商列表失败：' + res });
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
            this.$post('/api/vendor/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取供应商列表失败'});
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