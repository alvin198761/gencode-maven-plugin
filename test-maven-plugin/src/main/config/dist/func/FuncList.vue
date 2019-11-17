/*菜单管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                                                                    <FormItem label="类型" prop="type">
                                                        <Select placeholder="请选择类型" v-model="form.type" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="类型" prop="type">
                                                        <Select placeholder="请选择类型" v-model="form.type" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="颜色" prop="color">
                                                        <Input placeholder="请输入颜色" v-model="form.color"/>
                                                        </FormItem>
                                                                                                    <FormItem label="颜色" prop="color">
                                                        <Input placeholder="请输入颜色" v-model="form.color"/>
                                                        </FormItem>
                                                                                                    <FormItem label="图标" prop="icon">
                                                        <Input placeholder="请输入图标" v-model="form.icon"/>
                                                        </FormItem>
                                                                                                    <FormItem label="图标" prop="icon">
                                                        <Input placeholder="请输入图标" v-model="form.icon"/>
                                                        </FormItem>
                                                                                                    <FormItem label="名称" prop="name">
                                                        <Input placeholder="请输入名称" v-model="form.name"/>
                                                        </FormItem>
                                                                                                    <FormItem label="名称" prop="name">
                                                        <Input placeholder="请输入名称" v-model="form.name"/>
                                                        </FormItem>
                                                                                                    <FormItem label="父结点ID" prop="parentId">
                                                        <InputNumber placeholder="请输入父结点ID" v-model="form.parentId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="父结点ID" prop="parentId">
                                                        <InputNumber placeholder="请输入父结点ID" v-model="form.parentId" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="提示信息" prop="tip">
                                                        <Input placeholder="请输入提示信息" v-model="form.tip"/>
                                                        </FormItem>
                                                                                                    <FormItem label="提示信息" prop="tip">
                                                        <Input placeholder="请输入提示信息" v-model="form.tip"/>
                                                        </FormItem>
                                                                                                    <FormItem label="备注" prop="remark">
                                                        <Input placeholder="请输入备注" v-model="form.remark"/>
                                                        </FormItem>
                                                                                                    <FormItem label="备注" prop="remark">
                                                        <Input placeholder="请输入备注" v-model="form.remark"/>
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
                                                                                                    <FormItem label="地址" prop="url">
                                                        <Input placeholder="请输入地址" v-model="form.url"/>
                                                        </FormItem>
                                                                                                    <FormItem label="地址" prop="url">
                                                        <Input placeholder="请输入地址" v-model="form.url"/>
                                                        </FormItem>
                                                                                                    <FormItem label="排序编号" prop="orderNum">
                                                        <InputNumber placeholder="请输入排序编号" v-model="form.orderNum" clearable></InputNumber>
                                                        </FormItem>
                                                                                                    <FormItem label="排序编号" prop="orderNum">
                                                        <InputNumber placeholder="请输入排序编号" v-model="form.orderNum" clearable></InputNumber>
                                                        </FormItem>
                                                                          <FormItem  :label-width="0">
                        <Button icon="search" @click="refresh" style="margin-right: 5px" title="根据输入的条件查询" type="primary">查询</Button>

                        <Button type="primary" icon="plus" style="margin-right: 5px" @click="doAdd()" title="添加" >添加</Button>
                      </FormItem>
                </Form>
            <Table :loading="loading" :columns="tableHeader" :data="dataList" style="width: 100%">
                          <template slot-scope="{ row,index }" slot="col_funcId">
                <div>{{ row.funcId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_funcId">
                <div>{{ row.funcId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_type">
                <div>{{ row.type }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_type">
                <div>{{ row.type }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_color">
                <div>{{ row.color }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_color">
                <div>{{ row.color }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_icon">
                <div>{{ row.icon }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_icon">
                <div>{{ row.icon }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_name">
                <div>{{ row.name }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_name">
                <div>{{ row.name }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_parentId">
                <div>{{ row.parentId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_parentId">
                <div>{{ row.parentId }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_tip">
                <div>{{ row.tip }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_tip">
                <div>{{ row.tip }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_remark">
                <div>{{ row.remark }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_remark">
                <div>{{ row.remark }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_status">
                <div>{{ row.status }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_status">
                <div>{{ row.status }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_url">
                <div>{{ row.url }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_url">
                <div>{{ row.url }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_orderNum">
                <div>{{ row.orderNum }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_orderNum">
                <div>{{ row.orderNum }}</div>
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
        <FuncDialog ref="dialog" :refresh="refresh"></FuncDialog>
  </div>
</template>
<script>
import FuncDialog from './FuncDialog.vue';
import FuncListExpand from './FuncListExpand.vue';
  export default {
    components: {
     FuncDialog,
     FuncListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(FuncListExpand, {  props: {row: params.row}  })  }  },
                            {title: '主键', key: 'funcId', slot:'col_funcId' },
                            {title: '主键', key: 'funcId', slot:'col_funcId' },
                            {title: '类型', key: 'type', slot:'col_type' },
                            {title: '类型', key: 'type', slot:'col_type' },
                            {title: '颜色', key: 'color', slot:'col_color' },
                            {title: '颜色', key: 'color', slot:'col_color' },
                            {title: '图标', key: 'icon', slot:'col_icon' },
                            {title: '图标', key: 'icon', slot:'col_icon' },
                            {title: '名称', key: 'name', slot:'col_name' },
                            {title: '名称', key: 'name', slot:'col_name' },
                            {title: '父结点ID', key: 'parentId', slot:'col_parentId' },
                            {title: '父结点ID', key: 'parentId', slot:'col_parentId' },
                            {title: '提示信息', key: 'tip', slot:'col_tip' },
                            {title: '提示信息', key: 'tip', slot:'col_tip' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                            {title: '备注', key: 'remark', slot:'col_remark' },
                            {title: '状态', key: 'status', slot:'col_status' },
                            {title: '状态', key: 'status', slot:'col_status' },
                            {title: '地址', key: 'url', slot:'col_url' },
                            {title: '地址', key: 'url', slot:'col_url' },
                            {title: '排序编号', key: 'orderNum', slot:'col_orderNum' },
                            {title: '排序编号', key: 'orderNum', slot:'col_orderNum' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            funcId : null,// 主键
                            funcId : null,// 主键
                            type : null,// 类型
                            type : null,// 类型
                            color : null,// 颜色
                            color : null,// 颜色
                            icon : null,// 图标
                            icon : null,// 图标
                            name : null,// 名称
                            name : null,// 名称
                            parentId : null,// 父结点ID
                            parentId : null,// 父结点ID
                            tip : null,// 提示信息
                            tip : null,// 提示信息
                            remark : null,// 备注
                            remark : null,// 备注
                            status : null,// 状态
                            status : null,// 状态
                            url : null,// 地址
                            url : null,// 地址
                            orderNum : null,// 排序编号
                            orderNum : null,// 排序编号
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
        that.$postBody("/api/func/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取菜单列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取菜单列表失败：' + res });
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
            this.$post('/api/func/delete', {id: row.func_id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取菜单列表失败'});
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