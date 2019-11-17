/*进销项发票录入新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                            <FormItem label="供应商id" prop="vendorId">
                                                        <InputNumber placeholder="供应商id" v-model="form.vendorId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="税收类型" prop="taxType">
                                                        <Input placeholder="税收类型" v-model="form.taxType" clearable/>
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
                                                                                                                <FormItem label="发票类型" prop="ticketType">
                                                        <Input placeholder="发票类型" v-model="form.ticketType" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="税率" prop="rate">
                                                        <InputNumber placeholder="税率" v-model="form.rate" style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="进出类型" prop="type">
                                                        <Input placeholder="进出类型" v-model="form.type" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="客户Id" prop="cusId">
                                                        <InputNumber placeholder="客户Id" v-model="form.cusId"  style="width: 100%"  clearable></InputNumber>
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
                    vendorId : [
                        {required: true, type:'number', message: '请输入供应商id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '供应商id长度不正确', trigger: 'blur'},
                    ],
                    taxType : [
                            {required: true,   message: '请输入税收类型', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '税收类型长度不正确', trigger: 'blur'},
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
                    ticketType : [
                            {required: true,   message: '请输入发票类型', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '发票类型长度不正确', trigger: 'blur'},
                    ],
                    rate : [
                        {required: true, type:'number', message: '请输入税率', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '税率长度不正确', trigger: 'blur'},
                    ],
                    type : [
                            {required: true,   message: '请输入进出类型', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '进出类型长度不正确', trigger: 'blur'},
                    ],
                    cusId : [
                        {required: true, type:'number', message: '请输入客户Id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '客户Id长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/ticket/" + that.dialogMode, that.form).then(res => {
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
                        vendorId : null,// 供应商id
                        taxType : null,// 税收类型
                        targetName : null,// 姓名
                        targetId : null,// 收寄方id
                        remark : null,// 备注
                        ticketType : null,// 发票类型
                        rate : null,// 税率
                        type : null,// 进出类型
                        cusId : null,// 客户Id
                  }
      },
      addDialog() {//新增
        this.title = "新增进销项发票录入";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改进销项发票录入";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>