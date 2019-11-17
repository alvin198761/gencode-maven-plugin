/*产品信息记录管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                        <FormItem label="产品id" prop="prodId">
                                                        <Select placeholder="请选择产品id" v-model="form.prodId" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="总价" prop="total">
                                                        <Input placeholder="请输入总价" v-model="form.total"/>
                                                        </FormItem>
                                                                                                    <FormItem label="单价" prop="priice">
                                                        <Input placeholder="请输入单价" v-model="form.priice"/>
                                                        </FormItem>
                                                                                                    <FormItem label="数量" prop="num">
                                                        <Input placeholder="请输入数量" v-model="form.num"/>
                                                        </FormItem>
                                                                                                    <FormItem label="业务ID" prop="busId">
                                                        <Select placeholder="请选择业务ID" v-model="form.busId" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="业务类型" prop="busType">
                                                        <Select placeholder="请选择业务类型" v-model="form.busType" clearable>
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
                          <template slot-scope="{ row,index }" slot="col_prodId">
                <div>{{ row.prodId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_total">
                <div>{{ row.total }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_priice">
                <div>{{ row.priice }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_num">
                <div>{{ row.num }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_busId">
                <div>{{ row.busId }}</div>
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
        <RecordDialog ref="dialog" :refresh="refresh"></RecordDialog>
  </div>
</template>
<script>
import RecordDialog from './RecordDialog.vue';
import RecordListExpand from './RecordListExpand.vue';
  export default {
    components: {
     RecordDialog,
     RecordListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(RecordListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '产品id', key: 'prodId', slot:'col_prodId' },
                            {title: '总价', key: 'total', slot:'col_total' },
                            {title: '单价', key: 'priice', slot:'col_priice' },
                            {title: '数量', key: 'num', slot:'col_num' },
                            {title: '业务ID', key: 'busId', slot:'col_busId' },
                            {title: '业务类型', key: 'busType', slot:'col_busType' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// 主键
                            prodId : null,// 产品id
                            total : null,// 总价
                            priice : null,// 单价
                            num : null,// 数量
                            busId : null,// 业务ID
                            busType : null,// 业务类型
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
        that.$postBody("/api/record/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取产品信息记录列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取产品信息记录列表失败：' + res });
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
            this.$post('/api/record/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取产品信息记录列表失败'});
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