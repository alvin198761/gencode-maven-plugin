/*菜单模拟数据},作者:alvin198761@163.com,日期:2019-11-17 21:00:17*/
'use strict';
var Mock = require('mockjs')
var Random = Mock.Random;
module.exports = {

  'POST /api/func/queryPage': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    funcId: "@integer(100,200)",//主键
                                                funcId: "@integer(100,200)",//主键
                                                type: "@integer(100,200)",//类型
                                                type: "@integer(100,200)",//类型
                                                color : "@word(5,10)",// 颜色
                                                color : "@word(5,10)",// 颜色
                                                icon : "@word(5,10)",// 图标
                                                icon : "@word(5,10)",// 图标
                                                name : "@word(5,10)",// 名称
                                                name : "@word(5,10)",// 名称
                                                parentId: "@integer(100,200)",//父结点ID
                                                parentId: "@integer(100,200)",//父结点ID
                                                tip : "@word(5,10)",// 提示信息
                                                tip : "@word(5,10)",// 提示信息
                                                remark : "@word(5,10)",// 备注
                                                remark : "@word(5,10)",// 备注
                                                status: "@integer(100,200)",//状态
                                                status: "@integer(100,200)",//状态
                                                url : "@word(5,10)",// 地址
                                                url : "@word(5,10)",// 地址
                                                orderNum: "@integer(100,200)",//排序编号
                                                orderNum: "@integer(100,200)",//排序编号
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

  'POST /api/func/update': function (req, res, next) {
    var resp = {
           "code": 200,
           "errorMsg": "请求成功",
           "data":1
           };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/func/save': function (req, res, next) {
   var resp = {
         "code": 200,
         "errorMsg": "请求成功",
         "data":1
         };
    setTimeout(function () {
      res.json(resp);
    }, 500);
  },

  'POST /api/func/queryList': function (req, res, next) {
    var data = Mock.mock({
      'content|10': [{
                                    funcId: "@integer(100,200)",//主键
                                                funcId: "@integer(100,200)",//主键
                                                type: "@integer(100,200)",//类型
                                                type: "@integer(100,200)",//类型
                                                color : "@word(5,10)",// 颜色
                                                color : "@word(5,10)",// 颜色
                                                icon : "@word(5,10)",// 图标
                                                icon : "@word(5,10)",// 图标
                                                name : "@word(5,10)",// 名称
                                                name : "@word(5,10)",// 名称
                                                parentId: "@integer(100,200)",//父结点ID
                                                parentId: "@integer(100,200)",//父结点ID
                                                tip : "@word(5,10)",// 提示信息
                                                tip : "@word(5,10)",// 提示信息
                                                remark : "@word(5,10)",// 备注
                                                remark : "@word(5,10)",// 备注
                                                status: "@integer(100,200)",//状态
                                                status: "@integer(100,200)",//状态
                                                url : "@word(5,10)",// 地址
                                                url : "@word(5,10)",// 地址
                                                orderNum: "@integer(100,200)",//排序编号
                                                orderNum: "@integer(100,200)",//排序编号
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

  'POST /api/func/delete': function (req, res, next) {
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