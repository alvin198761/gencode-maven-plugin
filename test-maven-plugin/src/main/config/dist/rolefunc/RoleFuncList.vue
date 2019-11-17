/*admin_role_func管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                                                                    <FormItem label="角色主键" prop="roleId">
                                                        <InputNumber placeholder="请输入角色主键" v-model="form.roleId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="角色主键" prop="roleId">
                                                        <InputNumber placeholder="请输入角色主键" v-model="form.roleId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="菜单主键" prop="userId">
                                                        <InputNumber placeholder="请输入菜单主键" v-model="form.userId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="菜单主键" prop="userId">
                                                        <InputNumber placeholder="请输入菜单主键" v-model="form.userId" clearable></InputNumber>
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
                          <template slot-scope="{ row,index }" slot="col_roleId">
                <div>{{ row.roleId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_roleId">
                <div>{{ row.roleId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_userId">
                <div>{{ row.userId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_userId">
                <div>{{ row.userId }}</div>
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
        <RoleFuncDialog ref="dialog" :refresh="refresh"></RoleFuncDialog>
  </div>
</template>
<script>
import RoleFuncDialog from './RoleFuncDialog.vue';
import RoleFuncListExpand from './RoleFuncListExpand.vue';
  export default {
    components: {
     RoleFuncDialog,
     RoleFuncListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(RoleFuncListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '主键', key: 'id', slot:'col_id' },
                            {title: '角色主键', key: 'roleId', slot:'col_roleId' },
                            {title: '角色主键', key: 'roleId', slot:'col_roleId' },
                            {title: '菜单主键', key: 'userId', slot:'col_userId' },
                            {title: '菜单主键', key: 'userId', slot:'col_userId' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// 主键
                            id : null,// 主键
                            roleId : null,// 角色主键
                            roleId : null,// 角色主键
                            userId : null,// 菜单主键
                            userId : null,// 菜单主键
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
        that.$postBody("/api/roleFunc/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取admin_role_func列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取admin_role_func列表失败：' + res });
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
            this.$post('/api/roleFunc/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取admin_role_func列表失败'});
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