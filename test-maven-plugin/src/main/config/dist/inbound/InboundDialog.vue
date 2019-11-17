/*入库记录新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                            <FormItem label="产品id" prop="prodId">
                                                        <Input placeholder="产品id" v-model="form.prodId" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="入库日期" prop="date">
                                                        <DatePicker type="date" placeholder="入库日期" v-model="form.date" style="width: 100%" clearable></DatePicker>
                                                         </FormItem>
                                                                                                                <FormItem label="发票类型" prop="ticketType">
                                                        <Input placeholder="发票类型" v-model="form.ticketType" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="发票状态" prop="ticketStatus">
                                                        <Input placeholder="发票状态" v-model="form.ticketStatus" clearable/>
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
                    prodId : [
                            {required: true,   message: '请输入产品id', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '产品id长度不正确', trigger: 'blur'},
                    ],
                    date : [
                         {required: true, type:'date', message: '请输入入库日期', trigger: 'blur'},
          //  {min: 1, max: 10, type:'date', message: '入库日期长度不正确', trigger: 'blur'},
                    ],
                    ticketType : [
                            {required: true,   message: '请输入发票类型', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '发票类型长度不正确', trigger: 'blur'},
                    ],
                    ticketStatus : [
                            {required: true,   message: '请输入发票状态', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '发票状态长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/inbound/" + that.dialogMode, that.form).then(res => {
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
                        prodId : null,// 产品id
                        date : null,// 入库日期
                        ticketType : null,// 发票类型
                        ticketStatus : null,// 发票状态
                        remark : null,// 备注
                  }
      },
      addDialog() {//新增
        this.title = "新增入库记录";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改入库记录";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>