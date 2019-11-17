/*admin_dept模拟数据},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
'use strict';
var Mock = require('mockjs')
var Random = Mock.Random;
module.exports = {

  'POST /api/dept/queryPage': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    deptId: "@integer(100,200)",//主键
                                                deptId: "@integer(100,200)",//主键
                                                parentId: "@integer(100,200)",//上级ID
                                                parentId: "@integer(100,200)",//上级ID
                                                name : "@word(5,10)",// 部门名称
                                                name : "@word(5,10)",// 部门名称
                                                enable: "@integer(100,200)",//可用标志
                                                enable: "@integer(100,200)",//可用标志
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

  'POST /api/dept/update': function (req, res, next) {
    var resp = {
           "code": 200,
           "errorMsg": "请求成功",
           "data":1
           };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/dept/save': function (req, res, next) {
   var resp = {
         "code": 200,
         "errorMsg": "请求成功",
         "data":1
         };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/dept/queryList': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    deptId: "@integer(100,200)",//主键
                                                deptId: "@integer(100,200)",//主键
                                                parentId: "@integer(100,200)",//上级ID
                                                parentId: "@integer(100,200)",//上级ID
                                                name : "@word(5,10)",// 部门名称
                                                name : "@word(5,10)",// 部门名称
                                                enable: "@integer(100,200)",//可用标志
                                                enable: "@integer(100,200)",//可用标志
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

  'POST /api/dept/delete': function (req, res, next) {
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