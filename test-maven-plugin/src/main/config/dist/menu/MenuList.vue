/*admin_menu管理,作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <div>
            <Form inline :label-width="70"  style="text-align: left">
                                                                                                                                                    <FormItem label="icon" prop="icon">
                                                        <Input placeholder="请输入icon" v-model="form.icon"/>
                                                        </FormItem>
                                                                                                    <FormItem label="icon" prop="icon">
                                                        <Input placeholder="请输入icon" v-model="form.icon"/>
                                                        </FormItem>
                                                                                                    <FormItem label="parent_id" prop="parentId">
                                                        <Select placeholder="请选择parent_id" v-model="form.parentId" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="parent_id" prop="parentId">
                                                        <Select placeholder="请选择parent_id" v-model="form.parentId" clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                    <FormItem label="tip" prop="tip">
                                                        <Input placeholder="请输入tip" v-model="form.tip"/>
                                                        </FormItem>
                                                                                                    <FormItem label="tip" prop="tip">
                                                        <Input placeholder="请输入tip" v-model="form.tip"/>
                                                        </FormItem>
                                                                                                    <FormItem label="title" prop="title">
                                                        <Input placeholder="请输入title" v-model="form.title"/>
                                                        </FormItem>
                                                                                                    <FormItem label="title" prop="title">
                                                        <Input placeholder="请输入title" v-model="form.title"/>
                                                        </FormItem>
                                                                                                    <FormItem label="url" prop="url">
                                                        <Input placeholder="请输入url" v-model="form.url"/>
                                                        </FormItem>
                                                                                                    <FormItem label="url" prop="url">
                                                        <Input placeholder="请输入url" v-model="form.url"/>
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
                          <template slot-scope="{ row,index }" slot="col_icon">
                <div>{{ row.icon }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_icon">
                <div>{{ row.icon }}</div>
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
                          <template slot-scope="{ row,index }" slot="col_title">
                <div>{{ row.title }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_title">
                <div>{{ row.title }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_url">
                <div>{{ row.url }}</div>
              </template>
                          <template slot-scope="{ row,index }" slot="col_url">
                <div>{{ row.url }}</div>
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
        <MenuDialog ref="dialog" :refresh="refresh"></MenuDialog>
  </div>
</template>
<script>
import MenuDialog from './MenuDialog.vue';
import MenuListExpand from './MenuListExpand.vue';
  export default {
    components: {
     MenuDialog,
     MenuListExpand
   },
    data: function () {
      const that = this;
      return {
        tableHeader: [
          { type: 'expand',  width: 50, render: (h, params) => { return h(MenuListExpand, {  props: {row: params.row}  })  }  },
                            {title: 'id', key: 'id', slot:'col_id' },
                            {title: 'id', key: 'id', slot:'col_id' },
                            {title: 'icon', key: 'icon', slot:'col_icon' },
                            {title: 'icon', key: 'icon', slot:'col_icon' },
                            {title: 'parent_id', key: 'parentId', slot:'col_parentId' },
                            {title: 'parent_id', key: 'parentId', slot:'col_parentId' },
                            {title: 'tip', key: 'tip', slot:'col_tip' },
                            {title: 'tip', key: 'tip', slot:'col_tip' },
                            {title: 'title', key: 'title', slot:'col_title' },
                            {title: 'title', key: 'title', slot:'col_title' },
                            {title: 'url', key: 'url', slot:'col_url' },
                            {title: 'url', key: 'url', slot:'col_url' },
                    {            title: '操作',            width: 150,            slot : 'col_opt'          }
        ],
        total: 0,
        page: 1,
        pageSize: 20,
        dataList: [],
        form: {
                            id : null,// id
                            id : null,// id
                            icon : null,// icon
                            icon : null,// icon
                            parentId : null,// parent_id
                            parentId : null,// parent_id
                            tip : null,// tip
                            tip : null,// tip
                            title : null,// title
                            title : null,// title
                            url : null,// url
                            url : null,// url
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
        that.$postBody("/api/menu/queryPage", requestData).then(res => {
              that.loading = false;
              if (res.errcode != 0) {
                that.$Message.error({content: res.errmsg ? res.errmsg : '获取admin_menu列表失败'});
                return ;
              }
		          that.dataList = res.replydata.content;
		          that.total = res.replydata.totalElements;
		        }).catch(res => {
		          that.$Message.error({ content: '获取admin_menu列表失败：' + res });
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
            this.$post('/api/menu/delete', {id: row.id }).then(res => {
                  if (res.errcode != 0) {
                    that.$Message.error({content: res.errmsg ? res.errmsg : '获取admin_menu列表失败'});
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