/*菜单新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                                                                                    <FormItem label="类型" prop="type">
                                                        <Select placeholder="类型" v-model="form.type" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                                <FormItem label="类型" prop="type">
                                                        <Select placeholder="类型" v-model="form.type" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                                <FormItem label="颜色" prop="color">
                                                        <Input placeholder="颜色" v-model="form.color" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="颜色" prop="color">
                                                        <Input placeholder="颜色" v-model="form.color" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="图标" prop="icon">
                                                        <Input placeholder="图标" v-model="form.icon" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="图标" prop="icon">
                                                        <Input placeholder="图标" v-model="form.icon" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="名称" prop="name">
                                                        <Input placeholder="名称" v-model="form.name" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="名称" prop="name">
                                                        <Input placeholder="名称" v-model="form.name" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="父结点ID" prop="parentId">
                                                        <InputNumber placeholder="父结点ID" v-model="form.parentId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="父结点ID" prop="parentId">
                                                        <InputNumber placeholder="父结点ID" v-model="form.parentId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="提示信息" prop="tip">
                                                        <Input placeholder="提示信息" v-model="form.tip" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="提示信息" prop="tip">
                                                        <Input placeholder="提示信息" v-model="form.tip" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="备注" prop="remark">
                                                        <Input placeholder="备注" v-model="form.remark" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="备注" prop="remark">
                                                        <Input placeholder="备注" v-model="form.remark" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="状态" prop="status">
                                                        <Select placeholder="状态" v-model="form.status" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                                <FormItem label="状态" prop="status">
                                                        <Select placeholder="状态" v-model="form.status" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                                <FormItem label="地址" prop="url">
                                                        <Input placeholder="地址" v-model="form.url" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="地址" prop="url">
                                                        <Input placeholder="地址" v-model="form.url" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="排序编号" prop="orderNum">
                                                        <InputNumber placeholder="排序编号" v-model="form.orderNum" style="width: 100%" clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="排序编号" prop="orderNum">
                                                        <InputNumber placeholder="排序编号" v-model="form.orderNum" style="width: 100%" clearable></InputNumber>
                                                        </FormItem>
                                                                                    </i-col>
                      </Row>
                </Form>
            <div slot="footer" style="text-align: right">
              <Button @click="show = false">取消</Button>
              <Button type="primary" @click="save()">确定</Button>
            </div>
          </Modal>
    </template>
<script>
  export default {
    components: {},
    props: ["refresh"],
    data() {
      return {
        title: '',
        form: this.initForm(),
        dialogMode: "save",
        show: false,
        rules: {
                    funcId : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    funcId : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    type : [
                        {required: true, type:'number', message: '请输入类型', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '类型长度不正确', trigger: 'blur'},
                    ],
                    type : [
                        {required: true, type:'number', message: '请输入类型', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '类型长度不正确', trigger: 'blur'},
                    ],
                    color : [
                            {required: true,   message: '请输入颜色', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '颜色长度不正确', trigger: 'blur'},
                    ],
                    color : [
                            {required: true,   message: '请输入颜色', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '颜色长度不正确', trigger: 'blur'},
                    ],
                    icon : [
                            {required: true,   message: '请输入图标', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '图标长度不正确', trigger: 'blur'},
                    ],
                    icon : [
                            {required: true,   message: '请输入图标', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '图标长度不正确', trigger: 'blur'},
                    ],
                    name : [
                            {required: true,   message: '请输入名称', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '名称长度不正确', trigger: 'blur'},
                    ],
                    name : [
                            {required: true,   message: '请输入名称', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '名称长度不正确', trigger: 'blur'},
                    ],
                    parentId : [
                        {required: true, type:'number', message: '请输入父结点ID', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '父结点ID长度不正确', trigger: 'blur'},
                    ],
                    parentId : [
                        {required: true, type:'number', message: '请输入父结点ID', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '父结点ID长度不正确', trigger: 'blur'},
                    ],
                    tip : [
                            {required: true,   message: '请输入提示信息', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '提示信息长度不正确', trigger: 'blur'},
                    ],
                    tip : [
                            {required: true,   message: '请输入提示信息', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '提示信息长度不正确', trigger: 'blur'},
                    ],
                    remark : [
                            {required: true,   message: '请输入备注', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '备注长度不正确', trigger: 'blur'},
                    ],
                    remark : [
                            {required: true,   message: '请输入备注', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '备注长度不正确', trigger: 'blur'},
                    ],
                    status : [
                        {required: true, type:'number', message: '请输入状态', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '状态长度不正确', trigger: 'blur'},
                    ],
                    status : [
                        {required: true, type:'number', message: '请输入状态', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '状态长度不正确', trigger: 'blur'},
                    ],
                    url : [
                            {required: true,   message: '请输入地址', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '地址长度不正确', trigger: 'blur'},
                    ],
                    url : [
                            {required: true,   message: '请输入地址', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '地址长度不正确', trigger: 'blur'},
                    ],
                    orderNum : [
                        {required: true, type:'number', message: '请输入排序编号', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '排序编号长度不正确', trigger: 'blur'},
                    ],
                    orderNum : [
                        {required: true, type:'number', message: '请输入排序编号', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '排序编号长度不正确', trigger: 'blur'},
                    ],
                }
      }
    },
    methods: {
      save() {//新增及修改记录
        const that = this;
        this.$refs['form'].validate((valid) => {
          if (!valid) {
            return;
          }
          that.$postBody("/api/func/" + that.dialogMode, that.form).then(res => {
          that.show = false;
            if (res.errcode != 0) {
              that.$Message.error({content: res.errmsg ? res.errmsg : that.title+'失败'});
              return ;
            }
            that.refresh();
            that.$Message.success({ content: that.title+'成功'});
          }).catch(res => {
             that.$Message.error({ content: that.title+'失败' + res });
          });
        });
      },
      initForm() {//初始数据
        return {
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
                  }
      },
      addDialog() {//新增
        this.title = "新增菜单";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改菜单";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>