/*admin_sys_user管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                                                                    <FormItem label="姓名" prop="name">
                                                        <Input placeholder="请输入姓名" v-model="form.name"/>
                                                        </FormItem>
                                                                                                    <FormItem label="姓名" prop="name">
                                                        <Input placeholder="请输入姓名" v-model="form.name"/>
                                                        </FormItem>
                                                                                                    <FormItem label="会员编号" prop="password">
                                                        <Input placeholder="请输入会员编号" v-model="form.password"/>
                                                        </FormItem>
                                                                                                    <FormItem label="会员编号" prop="password">
                                                        <Input placeholder="请输入会员编号" v-model="form.password"/>
                                                        </FormItem>
                                                                                                    <FormItem label="手机号" prop="phone">
                                                        <Input placeholder="请输入手机号" v-model="form.phone"/>
                                                        </FormItem>
                                                                                                    <FormItem label="手机号" prop="phone">
                                                        <Input placeholder="请输入手机号" v-model="form.phone"/>
                                                        </FormItem>
                                                                                                    <FormItem label="性别" prop="gender">
                                                        <Select placeholder="请选择性别" v-model="form.gender" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="性别" prop="gender">
                                                        <Select placeholder="请选择性别" v-model="form.gender" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="状态" prop="status">
                                                        <Select placeholder="请选择状态" v-model="form.status" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="状态" prop="status">
                                                        <Select placeholder="请选择状态" v-model="form.status" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="部门ID" prop="departmentId">
                                                        <InputNumber placeholder="请输入部门ID" v-model="form.departmentId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="部门ID" prop="departmentId">
                                                        <InputNumber placeholder="请输入部门ID" v-model="form.departmentId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="微信号" prop="wechat">
                                                        <Input placeholder="请输入微信号" v-model="form.wechat"/>
                                                        </FormItem>
                                                                                                    <FormItem label="微信号" prop="wechat">
                                                        <Input placeholder="请输入微信号" v-model="form.wechat"/>
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
                          <template slot-scope="{ row,index }" slot="col_userId">
                <div>{{ row.userId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_userId">
                <div>{{ row.userId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_name">
                <div>{{ row.name }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_name">
                <div>{{ row.name }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_password">
                <div>{{ row.password }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_password">
                <div>{{ row.password }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_phone">
                <div>{{ row.phone }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_phone">
                <div>{{ row.phone }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_gender">
                <div>{{ row.gender }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_gender">
                <div>{{ row.gender }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_status">
                <div>{{ row.status }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_status">
                <div>{{ row.status }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_departmentId">
                <div>{{ row.departmentId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_departmentId">
                <div>{{ row.departmentId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_wechat">
                <div>{{ row.wechat }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_wechat">
                <div>{{ row.wechat }}</div>
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
        <SysUserDialog ref="dialog" :refresh="refresh"></SysUserDialog>
  </div>
</template>
<script>
import SysUserDialog from './SysUserDialog.vue';
import SysUserListExpand from './SysUserListExpand.vue';
  export default {
    components: {
     SysUserDialog,
     SysUserListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(SysUserListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'userId', slot:'col_userId' },
                            {title: '主键', key: 'userId', slot:'col_userId' },
                            {title: '姓名', key: 'name', slot:'col_name' },
                            {title: '姓名', key: 'name', slot:'col_name' },
                            {title: '会员编号', key: 'password', slot:'col_password' },
                            {title: '会员编号', key: 'password', slot:'col_password' },
                            {title: '手机号', key: 'phone', slot:'col_phone' },
                            {title: '手机号', key: 'phone', slot:'col_phone' },
                            {title: '性别', key: 'gender', slot:'col_gender' },
                            {title: '性别', key: 'gender', slot:'col_gender' },
                            {title: '状态', key: 'status', slot:'col_status' },
                            {title: '状态', key: 'status', slot:'col_status' },
                            {title: '部门ID', key: 'departmentId', slot:'col_departmentId' },
                            {title: '部门ID', key: 'departmentId', slot:'col_departmentId' },
                            {title: '微信号', key: 'wechat', slot:'col_wechat' },
                            {title: '微信号', key: 'wechat', slot:'col_wechat' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            userId : null,// 主键
                            userId : null,// 主键
                            name : null,// 姓名
                            name : null,// 姓名
                            password : null,// 会员编号
                            password : null,// 会员编号
                            phone : null,// 手机号
                            phone : null,// 手机号
                            gender : null,// 性别
                            gender : null,// 性别
                            status : null,// 状态
                            status : null,// 状态
                            departmentId : null,// 部门ID
                            departmentId : null,// 部门ID
                            wechat : null,// 微信号
                            wechat : null,// 微信号
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
        that.$postBody("/api/sysUser/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取admin_sys_user列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取admin_sys_user列表失败：' + res });
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
            this.$post('/api/sysUser/delete', {id: row.user_id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取admin_sys_user列表失败'});
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