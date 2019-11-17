/*admin_dept新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                                                                                    <FormItem label="上级ID" prop="parentId">
                                                        <InputNumber placeholder="上级ID" v-model="form.parentId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="上级ID" prop="parentId">
                                                        <InputNumber placeholder="上级ID" v-model="form.parentId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="部门名称" prop="name">
                                                        <Input placeholder="部门名称" v-model="form.name" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="部门名称" prop="name">
                                                        <Input placeholder="部门名称" v-model="form.name" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="可用标志" prop="enable">
                                                        <Select placeholder="可用标志" v-model="form.enable" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                                <FormItem label="可用标志" prop="enable">
                                                        <Select placeholder="可用标志" v-model="form.enable" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
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
                    deptId : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    deptId : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    parentId : [
                        {required: true, type:'number', message: '请输入上级ID', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '上级ID长度不正确', trigger: 'blur'},
                    ],
                    parentId : [
                        {required: true, type:'number', message: '请输入上级ID', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '上级ID长度不正确', trigger: 'blur'},
                    ],
                    name : [
                            {required: true,   message: '请输入部门名称', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '部门名称长度不正确', trigger: 'blur'},
                    ],
                    name : [
                            {required: true,   message: '请输入部门名称', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '部门名称长度不正确', trigger: 'blur'},
                    ],
                    enable : [
                        {required: true, type:'number', message: '请输入可用标志', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '可用标志长度不正确', trigger: 'blur'},
                    ],
                    enable : [
                        {required: true, type:'number', message: '请输入可用标志', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '可用标志长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/dept/" + that.dialogMode, that.form).then(res => {
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
                  }
      },
      addDialog() {//新增
        this.title = "新增admin_dept";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改admin_dept";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>