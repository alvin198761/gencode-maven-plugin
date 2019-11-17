/*admin_menu模拟数据},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
'use strict';
var Mock = require('mockjs')
var Random = Mock.Random;
module.exports = {

  'POST /api/menu/queryPage': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    id: "@integer(100,200)",//id
                                                id: "@integer(100,200)",//id
                                                icon : "@word(5,10)",// icon
                                                icon : "@word(5,10)",// icon
                                                parentId: "@integer(100,200)",//parent_id
                                                parentId: "@integer(100,200)",//parent_id
                                                tip : "@word(5,10)",// tip
                                                tip : "@word(5,10)",// tip
                                                title : "@word(5,10)",// title
                                                title : "@word(5,10)",// title
                                                url : "@word(5,10)",// url
                                                url : "@word(5,10)",// url
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

  'POST /api/menu/update': function (req, res, next) {
    var resp = {
           "code": 200,
           "errorMsg": "请求成功",
           "data":1
           };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/menu/save': function (req, res, next) {
   var resp = {
         "code": 200,
         "errorMsg": "请求成功",
         "data":1
         };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/menu/queryList': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    id: "@integer(100,200)",//id
                                                id: "@integer(100,200)",//id
                                                icon : "@word(5,10)",// icon
                                                icon : "@word(5,10)",// icon
                                                parentId: "@integer(100,200)",//parent_id
                                                parentId: "@integer(100,200)",//parent_id
                                                tip : "@word(5,10)",// tip
                                                tip : "@word(5,10)",// tip
                                                title : "@word(5,10)",// title
                                                title : "@word(5,10)",// title
                                                url : "@word(5,10)",// url
                                                url : "@word(5,10)",// url
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

  'POST /api/menu/delete': function (req, res, next) {
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