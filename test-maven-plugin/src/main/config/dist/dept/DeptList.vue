/*admin_dept管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                                                                    <FormItem label="上级ID" prop="parentId">
                                                        <InputNumber placeholder="请输入上级ID" v-model="form.parentId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="上级ID" prop="parentId">
                                                        <InputNumber placeholder="请输入上级ID" v-model="form.parentId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="部门名称" prop="name">
                                                        <Input placeholder="请输入部门名称" v-model="form.name"/>
                                                        </FormItem>
                                                                                                    <FormItem label="部门名称" prop="name">
                                                        <Input placeholder="请输入部门名称" v-model="form.name"/>
                                                        </FormItem>
                                                                                                    <FormItem label="可用标志" prop="enable">
                                                        <Select placeholder="请选择可用标志" v-model="form.enable" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="可用标志" prop="enable">
                                                        <Select placeholder="请选择可用标志" v-model="form.enable" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="备注" prop="remark">
                                                        <Input placeholder="请输入备注" v-model="form.remark"/>
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
                          <template slot-scope="{ row,index }" slot="col_deptId">
                <div>{{ row.deptId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_deptId">
                <div>{{ row.deptId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_parentId">
                <div>{{ row.parentId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_parentId">
                <div>{{ row.parentId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_name">
                <div>{{ row.name }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_name">
                <div>{{ row.name }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_enable">
                <div>{{ row.enable }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_enable">
                <div>{{ row.enable }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_remark">
                <div>{{ row.remark }}</div>
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
        <DeptDialog ref="dialog" :refresh="refresh"></DeptDialog>
  </div>
</template>
<script>
import DeptDialog from './DeptDialog.vue';
import DeptListExpand from './DeptListExpand.vue';
  export default {
    components: {
     DeptDialog,
     DeptListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(DeptListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'deptId', slot:'col_deptId' },
                            {title: '主键', key: 'deptId', slot:'col_deptId' },
                            {title: '上级ID', key: 'parentId', slot:'col_parentId' },
                            {title: '上级ID', key: 'parentId', slot:'col_parentId' },
                            {title: '部门名称', key: 'name', slot:'col_name' },
                            {title: '部门名称', key: 'name', slot:'col_name' },
                            {title: '可用标志', key: 'enable', slot:'col_enable' },
                            {title: '可用标志', key: 'enable', slot:'col_enable' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            deptId : null,// 主键
                            deptId : null,// 主键
                            parentId : null,// 上级ID
                            parentId : null,// 上级ID
                            name : null,// 部门名称
                            name : null,// 部门名称
                            enable : null,// 可用标志
                            enable : null,// 可用标志
                            remark : null,// 备注
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
        that.$postBody("/api/dept/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取admin_dept列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取admin_dept列表失败：' + res });
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
            this.$post('/api/dept/delete', {id: row.dept_id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取admin_dept列表失败'});
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