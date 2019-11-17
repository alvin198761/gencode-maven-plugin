/*admin_menu新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                                                                                    <FormItem label="icon" prop="icon">
                                                        <Input placeholder="icon" v-model="form.icon" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="icon" prop="icon">
                                                        <Input placeholder="icon" v-model="form.icon" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="parent_id" prop="parentId">
                                                        <InputNumber placeholder="parent_id" v-model="form.parentId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="parent_id" prop="parentId">
                                                        <InputNumber placeholder="parent_id" v-model="form.parentId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="tip" prop="tip">
                                                        <Input placeholder="tip" v-model="form.tip" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="tip" prop="tip">
                                                        <Input placeholder="tip" v-model="form.tip" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="title" prop="title">
                                                        <Input placeholder="title" v-model="form.title" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="title" prop="title">
                                                        <Input placeholder="title" v-model="form.title" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="url" prop="url">
                                                        <Input placeholder="url" v-model="form.url" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="url" prop="url">
                                                        <Input placeholder="url" v-model="form.url" clearable/>
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
                    icon : [
                            {required: true,   message: '请输入icon', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'icon长度不正确', trigger: 'blur'},
                    ],
                    icon : [
                            {required: true,   message: '请输入icon', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'icon长度不正确', trigger: 'blur'},
                    ],
                    parentId : [
                        {required: true, type:'number', message: '请输入parent_id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'parent_id长度不正确', trigger: 'blur'},
                    ],
                    parentId : [
                        {required: true, type:'number', message: '请输入parent_id', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: 'parent_id长度不正确', trigger: 'blur'},
                    ],
                    tip : [
                            {required: true,   message: '请输入tip', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'tip长度不正确', trigger: 'blur'},
                    ],
                    tip : [
                            {required: true,   message: '请输入tip', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'tip长度不正确', trigger: 'blur'},
                    ],
                    title : [
                            {required: true,   message: '请输入title', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'title长度不正确', trigger: 'blur'},
                    ],
                    title : [
                            {required: true,   message: '请输入title', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'title长度不正确', trigger: 'blur'},
                    ],
                    url : [
                            {required: true,   message: '请输入url', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'url长度不正确', trigger: 'blur'},
                    ],
                    url : [
                            {required: true,   message: '请输入url', trigger: 'blur'},
          //  {min: 1, max: 10,   message: 'url长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/menu/" + that.dialogMode, that.form).then(res => {
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
                        icon : null,// icon
                        icon : null,// icon
                        parentId : null,// parent_id
                        parentId : null,// parent_id
                        tip : null,// tip
                        tip : null,// tip
                        title : null,// title
                        title : null,// title
                        url : null,// url
                        url : null,// url
                  }
      },
      addDialog() {//新增
        this.title = "新增admin_menu";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改admin_menu";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>