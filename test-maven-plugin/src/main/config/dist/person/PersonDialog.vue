/*联系人新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                            <FormItem label="联系人姓名" prop="name">
                                                        <Input placeholder="联系人姓名" v-model="form.name" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="联系人电话" prop="phoneNo">
                                                        <Input placeholder="联系人电话" v-model="form.phoneNo" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="业务id" prop="busId">
                                                        <InputNumber placeholder="业务id" v-model="form.busId"  style="width: 100%"  clearable></InputNumber>
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
                    name : [
                            {required: true,   message: '请输入联系人姓名', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '联系人姓名长度不正确', trigger: 'blur'},
                    ],
                    phoneNo : [
                            {required: true,   message: '请输入联系人电话', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '联系人电话长度不正确', trigger: 'blur'},
                    ],
                    busId : [
                        {required: true, type:'number', message: '请输入业务id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '业务id长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/person/" + that.dialogMode, that.form).then(res => {
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
                        name : null,// 联系人姓名
                        phoneNo : null,// 联系人电话
                        busId : null,// 业务id
                        busType : null,// 业务类型
                  }
      },
      addDialog() {//新增
        this.title = "新增联系人";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改联系人";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>