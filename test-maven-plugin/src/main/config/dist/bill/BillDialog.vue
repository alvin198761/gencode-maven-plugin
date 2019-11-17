/*开票信息新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                            <FormItem label="供应商" prop="busId">
                                                        <InputNumber placeholder="供应商" v-model="form.busId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="开户行" prop="bank">
                                                        <Input placeholder="开户行" v-model="form.bank" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="账号" prop="account">
                                                        <Input placeholder="账号" v-model="form.account" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="纳税人识别号" prop="taxpayerNo">
                                                        <Input placeholder="纳税人识别号" v-model="form.taxpayerNo" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="备注" prop="remark">
                                                        <Input placeholder="备注" v-model="form.remark" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="bus_type" prop="busType">
                                                        <Select placeholder="bus_type" v-model="form.busType" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
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
                    busId : [
                        {required: true, type:'number', message: '请输入供应商', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '供应商长度不正确', trigger: 'blur'},
                    ],
                    bank : [
                            {required: true,   message: '请输入开户行', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '开户行长度不正确', trigger: 'blur'},
                    ],
                    account : [
                            {required: true,   message: '请输入账号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '账号长度不正确', trigger: 'blur'},
                    ],
                    taxpayerNo : [
                            {required: true,   message: '请输入纳税人识别号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '纳税人识别号长度不正确', trigger: 'blur'},
                    ],
                    remark : [
                            {required: true,   message: '请输入备注', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '备注长度不正确', trigger: 'blur'},
                    ],
                    busType : [
                        {required: true, type:'number', message: '请输入bus_type', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'bus_type长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/bill/" + that.dialogMode, that.form).then(res => {
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
                        busId : null,// 供应商
                        bank : null,// 开户行
                        account : null,// 账号
                        taxpayerNo : null,// 纳税人识别号
                        remark : null,// 备注
                        busType : null,// bus_type
                  }
      },
      addDialog() {//新增
        this.title = "新增开票信息";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改开票信息";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>