/*产品新增与修改},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
<template>
      <Modal :title="title" v-model="show" :scrollable="false" :mask-closable="false" width="600">
            <Form :model="form" ref="form" :rules="rules" :label-width="100">
                  <Row>
                        <i-col>
                                                                                                                                            <FormItem label="货号" prop="prodNo">
                                                        <Input placeholder="货号" v-model="form.prodNo" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="税收类型" prop="taxType">
                                                        <Input placeholder="税收类型" v-model="form.taxType" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="产品名称" prop="prodName">
                                                        <Input placeholder="产品名称" v-model="form.prodName" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="规格型号" prop="specNo">
                                                        <Input placeholder="规格型号" v-model="form.specNo" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="产品说明" prop="note">
                                                        <Input placeholder="产品说明" v-model="form.note" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="单位" prop="unit">
                                                        <Input placeholder="单位" v-model="form.unit" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="底价" prop="price">
                                                        <Input placeholder="底价" v-model="form.price" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="售卖价(含税)" prop="sellPrice">
                                                        <Input placeholder="售卖价(含税)" v-model="form.sellPrice" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="市场价(不含税)" prop="markPrice">
                                                        <Input placeholder="市场价(不含税)" v-model="form.markPrice" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="市场价(含税)" prop="hasTax">
                                                        <Input placeholder="市场价(含税)" v-model="form.hasTax" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="价格类型" prop="priceMode">
                                                        <Input placeholder="价格类型" v-model="form.priceMode" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="货物来源" prop="vendorId">
                                                        <InputNumber placeholder="货物来源" v-model="form.vendorId"  style="width: 100%"  clearable></InputNumber>
                                                        </FormItem>
                                                                                                                <FormItem label="产品图片1" prop="pic1">
                                                        <Input placeholder="产品图片1" v-model="form.pic1" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="产品图片2" prop="pic2">
                                                        <Input placeholder="产品图片2" v-model="form.pic2" clearable/>
                                                        </FormItem>
                                                                                                                <FormItem label="产品图片3" prop="pic3">
                                                        <Input placeholder="产品图片3" v-model="form.pic3" clearable/>
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
                    prodNo : [
                            {required: true,   message: '请输入货号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '货号长度不正确', trigger: 'blur'},
                    ],
                    taxType : [
                            {required: true,   message: '请输入税收类型', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '税收类型长度不正确', trigger: 'blur'},
                    ],
                    prodName : [
                            {required: true,   message: '请输入产品名称', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '产品名称长度不正确', trigger: 'blur'},
                    ],
                    specNo : [
                            {required: true,   message: '请输入规格型号', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '规格型号长度不正确', trigger: 'blur'},
                    ],
                    note : [
                            {required: true,   message: '请输入产品说明', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '产品说明长度不正确', trigger: 'blur'},
                    ],
                    unit : [
                            {required: true,   message: '请输入单位', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '单位长度不正确', trigger: 'blur'},
                    ],
                    price : [
                        {required: true, type:'number', message: '请输入底价', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '底价长度不正确', trigger: 'blur'},
                    ],
                    sellPrice : [
                        {required: true, type:'number', message: '请输入售卖价(含税)', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '售卖价(含税)长度不正确', trigger: 'blur'},
                    ],
                    markPrice : [
                        {required: true, type:'number', message: '请输入市场价(不含税)', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '市场价(不含税)长度不正确', trigger: 'blur'},
                    ],
                    hasTax : [
                            {required: true,   message: '请输入市场价(含税)', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '市场价(含税)长度不正确', trigger: 'blur'},
                    ],
                    priceMode : [
                            {required: true,   message: '请输入价格类型', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '价格类型长度不正确', trigger: 'blur'},
                    ],
                    vendorId : [
                        {required: true, type:'number', message: '请输入货物来源', trigger: 'blur'},
          //  {min: 1, max: 10, type:'number', message: '货物来源长度不正确', trigger: 'blur'},
                    ],
                    pic1 : [
                            {required: true,   message: '请输入产品图片1', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '产品图片1长度不正确', trigger: 'blur'},
                    ],
                    pic2 : [
                            {required: true,   message: '请输入产品图片2', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '产品图片2长度不正确', trigger: 'blur'},
                    ],
                    pic3 : [
                            {required: true,   message: '请输入产品图片3', trigger: 'blur'},
          //  {min: 1, max: 10,   message: '产品图片3长度不正确', trigger: 'blur'},
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
          that.$postBody("/api/product/" + that.dialogMode, that.form).then(res => {
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
                        prodNo : null,// 货号
                        taxType : null,// 税收类型
                        prodName : null,// 产品名称
                        specNo : null,// 规格型号
                        note : null,// 产品说明
                        unit : null,// 单位
                        price : null,// 底价
                        sellPrice : null,// 售卖价(含税)
                        markPrice : null,// 市场价(不含税)
                        hasTax : null,// 市场价(含税)
                        priceMode : null,// 价格类型
                        vendorId : null,// 货物来源
                        pic1 : null,// 产品图片1
                        pic2 : null,// 产品图片2
                        pic3 : null,// 产品图片3
                        remark : null,// 备注
                  }
      },
      addDialog() {//新增
        this.title = "新增产品";
        this.dialogMode = "save";
        this.form = this.initForm();
        this.show = true;
      },
      editDialog(row) {//修改
        this.title = "修改产品";
        this.dialogMode = "update";
        this.form = {...row};
        this.show = true;
      },
    }
  }
</script>
<style></style>