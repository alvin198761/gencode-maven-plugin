/*admin_sys_user模拟数据},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
'use strict';
var Mock = require('mockjs')
var Random = Mock.Random;
module.exports = {

  'POST /api/sysUser/queryPage': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    userId: "@integer(100,200)",//主键
                                                userId: "@integer(100,200)",//主键
                                                name : "@word(5,10)",// 姓名
                                                name : "@word(5,10)",// 姓名
                                                password : "@word(5,10)",// 会员编号
                                                password : "@word(5,10)",// 会员编号
                                                phone : "@word(5,10)",// 手机号
                                                phone : "@word(5,10)",// 手机号
                                                gender: "@integer(100,200)",//性别
                                                gender: "@integer(100,200)",//性别
                                                status: "@integer(100,200)",//状态
                                                status: "@integer(100,200)",//状态
                                                departmentId: "@integer(100,200)",//部门ID
                                                departmentId: "@integer(100,200)",//部门ID
                                                wechat : "@word(5,10)",// 微信号
                                                wechat : "@word(5,10)",// 微信号
                                                remark : "@word(5,10)",// 备注
                                                remark : "@word(5,10)",// 备注
                          }],
      'number': '@integer(100,200)',
      'size': 10,
      'totalElements': 500,
    });

    var resp = {
         "code": 200,
         "errorMsg": "请求成功",
         "data":data
         };

    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/sysUser/update': function (req, res, next) {
    var resp = {
           "code": 200,
           "errorMsg": "请求成功",
           "data":1
           };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/sysUser/save': function (req, res, next) {
   var resp = {
         "code": 200,
         "errorMsg": "请求成功",
         "data":1
         };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/sysUser/queryList': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    userId: "@integer(100,200)",//主键
                                                userId: "@integer(100,200)",//主键
                                                name : "@word(5,10)",// 姓名
                                                name : "@word(5,10)",// 姓名
                                                password : "@word(5,10)",// 会员编号
                                                password : "@word(5,10)",// 会员编号
                                                phone : "@word(5,10)",// 手机号
                                                phone : "@word(5,10)",// 手机号
                                                gender: "@integer(100,200)",//性别
                                                gender: "@integer(100,200)",//性别
                                                status: "@integer(100,200)",//状态
                                                status: "@integer(100,200)",//状态
                                                departmentId: "@integer(100,200)",//部门ID
                                                departmentId: "@integer(100,200)",//部门ID
                                                wechat : "@word(5,10)",// 微信号
                                                wechat : "@word(5,10)",// 微信号
                                                remark : "@word(5,10)",// 备注
                                                remark : "@word(5,10)",// 备注
                          }]
    });
      var resp = {
         "code": 200,
         "errorMsg": "请求成功",
         "data":data.content
         };

        setTimeout(function () {
          res.json(resp);
        }, 500);

  },

  'POST /api/sysUser/delete': function (req, res, next) {
     var resp = {
       "code": 200,
       "errorMsg": "请求成功",
       "data":1
       };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },
}