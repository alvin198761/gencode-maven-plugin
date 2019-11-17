/*开票信息管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                        <FormItem label="供应商" prop="busId">
                                                        <Select placeholder="请选择供应商" v-model="form.busId" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="开户行" prop="bank">
                                                        <Input placeholder="请输入开户行" v-model="form.bank"/>
                                                        </FormItem>
                                                                                                    <FormItem label="账号" prop="account">
                                                        <Input placeholder="请输入账号" v-model="form.account"/>
                                                        </FormItem>
                                                                                                    <FormItem label="纳税人识别号" prop="taxpayerNo">
                                                        <Input placeholder="请输入纳税人识别号" v-model="form.taxpayerNo"/>
                                                        </FormItem>
                                                                                                    <FormItem label="备注" prop="remark">
                                                        <Input placeholder="请输入备注" v-model="form.remark"/>
                                                        </FormItem>
                                                                                                    <FormItem label="bus_type" prop="busType">
                                                        <Select placeholder="请选择bus_type" v-model="form.busType" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
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
                          <template slot-scope="{ row,index }" slot="col_busId">
                <div>{{ row.busId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_bank">
                <div>{{ row.bank }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_account">
                <div>{{ row.account }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_taxpayerNo">
                <div>{{ row.taxpayerNo }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_remark">
                <div>{{ row.remark }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_busType">
                <div>{{ row.busType }}</div>
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
        <BillDialog ref="dialog" :refresh="refresh"></BillDialog>
  </div>
</template>
<script>
import BillDialog from './BillDialog.vue';
import BillListExpand from './BillListExpand.vue';
  export default {
    components: {
     BillDialog,
     BillListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(BillListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '供应商', key: 'busId', slot:'col_busId' },
                            {title: '开户行', key: 'bank', slot:'col_bank' },
                            {title: '账号', key: 'account', slot:'col_account' },
                            {title: '纳税人识别号', key: 'taxpayerNo', slot:'col_taxpayerNo' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                            {title: 'bus_type', key: 'busType', slot:'col_busType' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// 主键
                            busId : null,// 供应商
                            bank : null,// 开户行
                            account : null,// 账号
                            taxpayerNo : null,// 纳税人识别号
                            remark : null,// 备注
                            busType : null,// bus_type
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
        that.$postBody("/api/bill/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取开票信息列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取开票信息列表失败：' + res });
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
            this.$post('/api/bill/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取开票信息列表失败'});
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