/*admin_role_dept新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                                                                                    <FormItem label="角色主键" prop="roleId">
                                                        <InputNumber placeholder="角色主键" v-model="form.roleId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="角色主键" prop="roleId">
                                                        <InputNumber placeholder="角色主键" v-model="form.roleId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="菜单主键" prop="deptId">
                                                        <InputNumber placeholder="菜单主键" v-model="form.deptId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="菜单主键" prop="deptId">
                                                        <InputNumber placeholder="菜单主键" v-model="form.deptId"  style="width: 100%"  clearable></InputNumber>
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
                    id : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    id : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    roleId : [
                        {required: true, type:'number', message: '请输入角色主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '角色主键长度不正确', trigger: 'blur'},
                    ],
                    roleId : [
                        {required: true, type:'number', message: '请输入角色主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '角色主键长度不正确', trigger: 'blur'},
                    ],
                    deptId : [
                        {required: true, type:'number', message: '请输入菜单主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '菜单主键长度不正确', trigger: 'blur'},
                    ],
                    deptId : [
                        {required: true, type:'number', message: '请输入菜单主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '菜单主键长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/roleDept/" + that.dialogMode, that.form).then(res => {
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
                        id : null,// 主键
                        id : null,// 主键
                        roleId : null,// 角色主键
                        roleId : null,// 角色主键
                        deptId : null,// 菜单主键
                        deptId : null,// 菜单主键
                  }
      },
      addDialog() {//新增
        this.title = "新增admin_role_dept";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改admin_role_dept";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>