/*入库记录模拟数据},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
'use strict';
var Mock = require('mockjs')
var Random = Mock.Random;
module.exports = {

  'POST /api/inbound/queryPage': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    id: "@integer(100,200)",//主键
                                                prodId : "@word(5,10)",// 产品id
                                                date: "@integer(100,200)",//入库日期
                                                ticketType : "@word(5,10)",// 发票类型
                                                ticketStatus : "@word(5,10)",// 发票状态
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

  'POST /api/inbound/update': function (req, res, next) {
    var resp = {
           "code": 200,
           "errorMsg": "请求成功",
           "data":1
           };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/inbound/save': function (req, res, next) {
   var resp = {
         "code": 200,
         "errorMsg": "请求成功",
         "data":1
         };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/inbound/queryList': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    id: "@integer(100,200)",//主键
                                                prodId : "@word(5,10)",// 产品id
                                                date: "@integer(100,200)",//入库日期
                                                ticketType : "@word(5,10)",// 发票类型
                                                ticketStatus : "@word(5,10)",// 发票状态
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

  'POST /api/inbound/delete': function (req, res, next) {
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