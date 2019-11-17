/*类型字典管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                                                                    <FormItem label="type" prop="type">
                                                        <InputNumber placeholder="请输入type" v-model="form.type" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="type" prop="type">
                                                        <InputNumber placeholder="请输入type" v-model="form.type" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="name" prop="name">
                                                        <Input placeholder="请输入name" v-model="form.name"/>
                                                        </FormItem>
                                                                                                    <FormItem label="name" prop="name">
                                                        <Input placeholder="请输入name" v-model="form.name"/>
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
                          <template slot-scope="{ row,index }" slot="col_id">
                <div>{{ row.id }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_type">
                <div>{{ row.type }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_type">
                <div>{{ row.type }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_name">
                <div>{{ row.name }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_name">
                <div>{{ row.name }}</div>
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
        <DictDialog ref="dialog" :refresh="refresh"></DictDialog>
  </div>
</template>
<script>
import DictDialog from './DictDialog.vue';
import DictListExpand from './DictListExpand.vue';
  export default {
    components: {
     DictDialog,
     DictListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(DictListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: 'type', key: 'type', slot:'col_type' },
                            {title: 'type', key: 'type', slot:'col_type' },
                            {title: 'name', key: 'name', slot:'col_name' },
                            {title: 'name', key: 'name', slot:'col_name' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// 主键
                            id : null,// 主键
                            type : null,// type
                            type : null,// type
                            name : null,// name
                            name : null,// name
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
        that.$postBody("/api/dict/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取类型字典列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取类型字典列表失败：' + res });
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
            this.$post('/api/dict/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取类型字典列表失败'});
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