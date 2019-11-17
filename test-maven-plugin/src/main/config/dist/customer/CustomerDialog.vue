/*客户新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                            <FormItem label="客户编号" prop="cusNo">
                                                        <Input placeholder="客户编号" v-model="form.cusNo" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="单位名称" prop="cusName">
                                                        <Input placeholder="单位名称" v-model="form.cusName" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="客户地址" prop="address">
                                                        <Input placeholder="客户地址" v-model="form.address" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="客户性质" prop="cusType">
                                                        <Select placeholder="客户性质" v-model="form.cusType" style="width: 100%"  clearable>
                            <Option   value="-1"  >-请选择-</Option>
                            </Select>
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
                    cusNo : [
                            {required: true,   message: '请输入客户编号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '客户编号长度不正确', trigger: 'blur'},
                    ],
                    cusName : [
                            {required: true,   message: '请输入单位名称', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '单位名称长度不正确', trigger: 'blur'},
                    ],
                    address : [
                            {required: true,   message: '请输入客户地址', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '客户地址长度不正确', trigger: 'blur'},
                    ],
                    cusType : [
                        {required: true, type:'number', message: '请输入客户性质', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '客户性质长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/customer/" + that.dialogMode, that.form).then(res => {
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
                        cusNo : null,// 客户编号
                        cusName : null,// 单位名称
                        address : null,// 客户地址
                        cusType : null,// 客户性质
                        remark : null,// 备注
                  }
      },
      addDialog() {//新增
        this.title = "新增客户";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改客户";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>