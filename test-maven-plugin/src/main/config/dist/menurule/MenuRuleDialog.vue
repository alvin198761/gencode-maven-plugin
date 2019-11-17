/*admin_menu_rule新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                                                                                    <FormItem label="did" prop="did">
                                                        <InputNumber placeholder="did" v-model="form.did"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="did" prop="did">
                                                        <InputNumber placeholder="did" v-model="form.did"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="mid" prop="mid">
                                                        <InputNumber placeholder="mid" v-model="form.mid"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="mid" prop="mid">
                                                        <InputNumber placeholder="mid" v-model="form.mid"  style="width: 100%"  clearable></InputNumber>
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
                        {required: true, type:'number', message: '请输入id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'id长度不正确', trigger: 'blur'},
                    ],
                    id : [
                        {required: true, type:'number', message: '请输入id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'id长度不正确', trigger: 'blur'},
                    ],
                    did : [
                        {required: true, type:'number', message: '请输入did', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'did长度不正确', trigger: 'blur'},
                    ],
                    did : [
                        {required: true, type:'number', message: '请输入did', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'did长度不正确', trigger: 'blur'},
                    ],
                    mid : [
                        {required: true, type:'number', message: '请输入mid', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'mid长度不正确', trigger: 'blur'},
                    ],
                    mid : [
                        {required: true, type:'number', message: '请输入mid', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'mid长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/menuRule/" + that.dialogMode, that.form).then(res => {
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
                        id : null,// id
                        id : null,// id
                        did : null,// did
                        did : null,// did
                        mid : null,// mid
                        mid : null,// mid
                  }
      },
      addDialog() {//新增
        this.title = "新增admin_menu_rule";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改admin_menu_rule";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>