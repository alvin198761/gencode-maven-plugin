/*收寄信息新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
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
                                                                                                                <FormItem label="电话" prop="targetPhone">
                                                        <Input placeholder="电话" v-model="form.targetPhone" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="地址" prop="targetAddr">
                                                        <Input placeholder="地址" v-model="form.targetAddr" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="姓名" prop="targetName">
                                                        <Input placeholder="姓名" v-model="form.targetName" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="收寄方id" prop="targetId">
                                                        <InputNumber placeholder="收寄方id" v-model="form.targetId"  style="width: 100%"  clearable></InputNumber>
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
                    id : [
                        {required: true, type:'number', message: '请输入主键', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '主键长度不正确', trigger: 'blur'},
                    ],
                    type : [
                        {required: true, type:'number', message: '请输入类型', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '类型长度不正确', trigger: 'blur'},
                    ],
                    targetPhone : [
                            {required: true,   message: '请输入电话', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '电话长度不正确', trigger: 'blur'},
                    ],
                    targetAddr : [
                            {required: true,   message: '请输入地址', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '地址长度不正确', trigger: 'blur'},
                    ],
                    targetName : [
                            {required: true,   message: '请输入姓名', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '姓名长度不正确', trigger: 'blur'},
                    ],
                    targetId : [
                        {required: true, type:'number', message: '请输入收寄方id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '收寄方id长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/address/" + that.dialogMode, that.form).then(res => {
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
                        type : null,// 类型
                        targetPhone : null,// 电话
                        targetAddr : null,// 地址
                        targetName : null,// 姓名
                        targetId : null,// 收寄方id
                        remark : null,// 备注
                  }
      },
      addDialog() {//新增
        this.title = "新增收寄信息";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改收寄信息";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>