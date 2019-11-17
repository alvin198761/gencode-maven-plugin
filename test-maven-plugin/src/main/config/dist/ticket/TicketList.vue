/*进销项发票录入管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                        <FormItem label="供应商id" prop="vendorId">
                                                        <Select placeholder="请选择供应商id" v-model="form.vendorId" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="税收类型" prop="taxType">
                                                        <Input placeholder="请输入税收类型" v-model="form.taxType"/>
                                                        </FormItem>
                                                                                                    <FormItem label="姓名" prop="targetName">
                                                        <Input placeholder="请输入姓名" v-model="form.targetName"/>
                                                        </FormItem>
                                                                                                    <FormItem label="收寄方id" prop="targetId">
                                                        <Select placeholder="请选择收寄方id" v-model="form.targetId" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="备注" prop="remark">
                                                        <Input placeholder="请输入备注" v-model="form.remark"/>
                                                        </FormItem>
                                                                                                    <FormItem label="发票类型" prop="ticketType">
                                                        <Input placeholder="请输入发票类型" v-model="form.ticketType"/>
                                                        </FormItem>
                                                                                                    <FormItem label="税率" prop="rate">
                                                        <InputNumber placeholder="请输入税率" v-model="form.rate" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="进出类型" prop="type">
                                                        <Input placeholder="请输入进出类型" v-model="form.type"/>
                                                        </FormItem>
                                                                                                    <FormItem label="客户Id" prop="cusId">
                                                        <Select placeholder="请选择客户Id" v-model="form.cusId" clearable>
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
                          <template slot-scope="{ row,index }" slot="col_vendorId">
                <div>{{ row.vendorId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_taxType">
                <div>{{ row.taxType }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_targetName">
                <div>{{ row.targetName }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_targetId">
                <div>{{ row.targetId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_remark">
                <div>{{ row.remark }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_ticketType">
                <div>{{ row.ticketType }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_rate">
                <div>{{ row.rate }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_type">
                <div>{{ row.type }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_cusId">
                <div>{{ row.cusId }}</div>
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
        <TicketDialog ref="dialog" :refresh="refresh"></TicketDialog>
  </div>
</template>
<script>
import TicketDialog from './TicketDialog.vue';
import TicketListExpand from './TicketListExpand.vue';
  export default {
    components: {
     TicketDialog,
     TicketListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(TicketListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '供应商id', key: 'vendorId', slot:'col_vendorId' },
                            {title: '税收类型', key: 'taxType', slot:'col_taxType' },
                            {title: '姓名', key: 'targetName', slot:'col_targetName' },
                            {title: '收寄方id', key: 'targetId', slot:'col_targetId' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                            {title: '发票类型', key: 'ticketType', slot:'col_ticketType' },
                            {title: '税率', key: 'rate', slot:'col_rate' },
                            {title: '进出类型', key: 'type', slot:'col_type' },
                            {title: '客户Id', key: 'cusId', slot:'col_cusId' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// 主键
                            vendorId : null,// 供应商id
                            taxType : null,// 税收类型
                            targetName : null,// 姓名
                            targetId : null,// 收寄方id
                            remark : null,// 备注
                            ticketType : null,// 发票类型
                            rate : null,// 税率
                            type : null,// 进出类型
                            cusId : null,// 客户Id
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
        that.$postBody("/api/ticket/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取进销项发票录入列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取进销项发票录入列表失败：' + res });
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
            this.$post('/api/ticket/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取进销项发票录入列表失败'});
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