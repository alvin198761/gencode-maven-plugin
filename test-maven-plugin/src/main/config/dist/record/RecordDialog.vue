/*产品信息记录新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                            <FormItem label="产品id" prop="prodId">
                                                        <Select placeholder="产品id" v-model="form.prodId" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
                                                        </FormItem>
                                                                                                                <FormItem label="总价" prop="total">
                                                        <Input placeholder="总价" v-model="form.total" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="单价" prop="priice">
                                                        <Input placeholder="单价" v-model="form.priice" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="数量" prop="num">
                                                        <Input placeholder="数量" v-model="form.num" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="业务ID" prop="busId">
                                                        <InputNumber placeholder="业务ID" v-model="form.busId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="业务类型" prop="busType">
                                                        <Select placeholder="业务类型" v-model="form.busType" style="width: 100%"  clearable>
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
                    prodId : [
                        {required: true, type:'number', message: '请输入产品id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '产品id长度不正确', trigger: 'blur'},
                    ],
                    total : [
                        {required: true, type:'number', message: '请输入总价', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '总价长度不正确', trigger: 'blur'},
                    ],
                    priice : [
                        {required: true, type:'number', message: '请输入单价', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '单价长度不正确', trigger: 'blur'},
                    ],
                    num : [
                        {required: true, type:'number', message: '请输入数量', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '数量长度不正确', trigger: 'blur'},
                    ],
                    busId : [
                        {required: true, type:'number', message: '请输入业务ID', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '业务ID长度不正确', trigger: 'blur'},
                    ],
                    busType : [
                        {required: true, type:'number', message: '请输入业务类型', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '业务类型长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/record/" + that.dialogMode, that.form).then(res => {
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
                        total : null,// 总价
                        priice : null,// 单价
                        num : null,// 数量
                        busId : null,// 业务ID
                        busType : null,// 业务类型
                  }
      },
      addDialog() {//新增
        this.title = "新增产品信息记录";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改产品信息记录";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>