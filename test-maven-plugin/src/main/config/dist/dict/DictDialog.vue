/*类型字典新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                                                                                    <FormItem label="type" prop="type">
                                                        <InputNumber placeholder="type" v-model="form.type"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="type" prop="type">
                                                        <InputNumber placeholder="type" v-model="form.type"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="name" prop="name">
                                                        <Input placeholder="name" v-model="form.name" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="name" prop="name">
                                                        <Input placeholder="name" v-model="form.name" clearable/>
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
                    type : [
                        {required: true, type:'number', message: '请输入type', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'type长度不正确', trigger: 'blur'},
                    ],
                    type : [
                        {required: true, type:'number', message: '请输入type', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'type长度不正确', trigger: 'blur'},
                    ],
                    name : [
                            {required: true,   message: '请输入name', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'name长度不正确', trigger: 'blur'},
                    ],
                    name : [
                            {required: true,   message: '请输入name', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'name长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/dict/" + that.dialogMode, that.form).then(res => {
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
                        type : null,// type
                        type : null,// type
                        name : null,// name
                        name : null,// name
                  }
      },
      addDialog() {//新增
        this.title = "新增类型字典";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改类型字典";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>