/*admin_sys_user新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                                                                                    <FormItem label="姓名" prop="name">
                                                        <Input placeholder="姓名" v-model="form.name" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="姓名" prop="name">
                                                        <Input placeholder="姓名" v-model="form.name" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="会员编号" prop="password">
                                                        <Input placeholder="会员编号" v-model="form.password" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="会员编号" prop="password">
                                                        <Input placeholder="会员编号" v-model="form.password" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="手机号" prop="phone">
                                                        <Input placeholder="手机号" v-model="form.phone" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="手机号" prop="phone">
                                                        <Input placeholder="手机号" v-model="form.phone" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="性别" prop="gender">
                                                        <Select placeholder="性别" v-model="form.gender" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                                <FormItem label="性别" prop="gender">
                                                        <Select placeholder="性别" v-model="form.gender" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
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
                                                                                                                <FormItem label="部门ID" prop="departmentId">
                                                        <InputNumber placeholder="部门ID" v-model="form.departmentId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="部门ID" prop="departmentId">
                                                        <InputNumber placeholder="部门ID" v-model="form.departmentId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="微信号" prop="wechat">
                                                        <Input placeholder="微信号" v-model="form.wechat" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="微信号" prop="wechat">
                                                        <Input placeholder="微信号" v-model="form.wechat" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="备注" prop="remark">
                                                        <Input placeholder="备注" v-model="form.remark" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="备注" prop="remark">
                                                        <Input placeholder="备注" v-model="form.remark" clearable/>
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
                    userId : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    userId : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    name : [
                            {required: true,   message: '请输入姓名', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '姓名长度不正确', trigger: 'blur'},
                    ],
                    name : [
                            {required: true,   message: '请输入姓名', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '姓名长度不正确', trigger: 'blur'},
                    ],
                    password : [
                            {required: true,   message: '请输入会员编号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '会员编号长度不正确', trigger: 'blur'},
                    ],
                    password : [
                            {required: true,   message: '请输入会员编号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '会员编号长度不正确', trigger: 'blur'},
                    ],
                    phone : [
                            {required: true,   message: '请输入手机号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '手机号长度不正确', trigger: 'blur'},
                    ],
                    phone : [
                            {required: true,   message: '请输入手机号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '手机号长度不正确', trigger: 'blur'},
                    ],
                    gender : [
                        {required: true, type:'number', message: '请输入性别', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '性别长度不正确', trigger: 'blur'},
                    ],
                    gender : [
                        {required: true, type:'number', message: '请输入性别', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '性别长度不正确', trigger: 'blur'},
                    ],
                    status : [
                        {required: true, type:'number', message: '请输入状态', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '状态长度不正确', trigger: 'blur'},
                    ],
                    status : [
                        {required: true, type:'number', message: '请输入状态', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '状态长度不正确', trigger: 'blur'},
                    ],
                    departmentId : [
                        {required: true, type:'number', message: '请输入部门ID', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '部门ID长度不正确', trigger: 'blur'},
                    ],
                    departmentId : [
                        {required: true, type:'number', message: '请输入部门ID', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '部门ID长度不正确', trigger: 'blur'},
                    ],
                    wechat : [
                            {required: true,   message: '请输入微信号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '微信号长度不正确', trigger: 'blur'},
                    ],
                    wechat : [
                            {required: true,   message: '请输入微信号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '微信号长度不正确', trigger: 'blur'},
                    ],
                    remark : [
                            {required: true,   message: '请输入备注', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '备注长度不正确', trigger: 'blur'},
                    ],
                    remark : [
                            {required: true,   message: '请输入备注', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '备注长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/sysUser/" + that.dialogMode, that.form).then(res => {
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
                  }
      },
      addDialog() {//新增
        this.title = "新增admin_sys_user";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改admin_sys_user";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>