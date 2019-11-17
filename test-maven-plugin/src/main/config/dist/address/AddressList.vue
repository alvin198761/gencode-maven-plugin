/*收寄信息管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                        <FormItem label="类型" prop="type">
                                                        <Select placeholder="请选择类型" v-model="form.type" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="电话" prop="targetPhone">
                                                        <Input placeholder="请输入电话" v-model="form.targetPhone"/>
                                                        </FormItem>
                                                                                                    <FormItem label="地址" prop="targetAddr">
                                                        <Input placeholder="请输入地址" v-model="form.targetAddr"/>
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
                                                                          <FormItem  :label-width="0">
                        <Button icon="search" @click="refresh" style="margin-right: 5px" title="根据输入的条件查询" type="primary">查询</Button>

                        <Button type="primary" icon="plus" style="margin-right: 5px" @click="doAdd()" title="添加" >添加</Button>
                      </FormItem>
                </Form>
            <Table :loading="loading" :columns="tableHeader" :data="dataList" style="width: 100%">
                          <template slot-scope="{ row,index }" slot="col_id">
                <div>{{ row.id }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_type">
                <div>{{ row.type }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_targetPhone">
                <div>{{ row.targetPhone }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_targetAddr">
                <div>{{ row.targetAddr }}</div>
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
        <AddressDialog ref="dialog" :refresh="refresh"></AddressDialog>
  </div>
</template>
<script>
import AddressDialog from './AddressDialog.vue';
import AddressListExpand from './AddressListExpand.vue';
  export default {
    components: {
     AddressDialog,
     AddressListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(AddressListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '类型', key: 'type', slot:'col_type' },
                            {title: '电话', key: 'targetPhone', slot:'col_targetPhone' },
                            {title: '地址', key: 'targetAddr', slot:'col_targetAddr' },
                            {title: '姓名', key: 'targetName', slot:'col_targetName' },
                            {title: '收寄方id', key: 'targetId', slot:'col_targetId' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// 主键
                            type : null,// 类型
                            targetPhone : null,// 电话
                            targetAddr : null,// 地址
                            targetName : null,// 姓名
                            targetId : null,// 收寄方id
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
        that.$postBody("/api/address/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取收寄信息列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取收寄信息列表失败：' + res });
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
            this.$post('/api/address/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取收寄信息列表失败'});
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