/*进销项发票录入模拟数据},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
'use strict';
var Mock = require('mockjs')
var Random = Mock.Random;
module.exports = {

  'POST /api/ticket/queryPage': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    id: "@integer(100,200)",//主键
                                                vendorId: "@integer(100,200)",//供应商id
                                                taxType : "@word(5,10)",// 税收类型
                                                targetName : "@word(5,10)",// 姓名
                                                targetId: "@integer(100,200)",//收寄方id
                                                remark : "@word(5,10)",// 备注
                                                ticketType : "@word(5,10)",// 发票类型
                                                rate: "@integer(100,200)",//税率
                                                type : "@word(5,10)",// 进出类型
                                                cusId: "@integer(100,200)",//客户Id
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

  'POST /api/ticket/update': function (req, res, next) {
    var resp = {
           "code": 200,
           "errorMsg": "请求成功",
           "data":1
           };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/ticket/save': function (req, res, next) {
   var resp = {
         "code": 200,
         "errorMsg": "请求成功",
         "data":1
         };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/ticket/queryList': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    id: "@integer(100,200)",//主键
                                                vendorId: "@integer(100,200)",//供应商id
                                                taxType : "@word(5,10)",// 税收类型
                                                targetName : "@word(5,10)",// 姓名
                                                targetId: "@integer(100,200)",//收寄方id
                                                remark : "@word(5,10)",// 备注
                                                ticketType : "@word(5,10)",// 发票类型
                                                rate: "@integer(100,200)",//税率
                                                type : "@word(5,10)",// 进出类型
                                                cusId: "@integer(100,200)",//客户Id
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

  'POST /api/ticket/delete': function (req, res, next) {
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