package org.alvin.test.dict;

import java.security.Principal;
import java.util.List;
import java.util.Date;
import org.alvin.code.gen.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.*;
import org.alvin.code.gen.beans.RestfullResp;
import lombok.extern.slf4j.Slf4j;

/**
* @类说明: "[类型字典]app端Swagger控制器类 ,使用requestbody 实现"
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Api(value = "[类型字典]控制器", description = "[类型字典]相关操作")
@RestController
@RequestMapping("/api/dict")
public class DictAction{

    @Autowired
	private DictService service; //注入[类型字典]业务逻辑类

    /**
     * @方法说明：  新增[类型字典]记录
     */
    @ApiOperation(value = "新增[类型字典]", notes = "返回影响记录行数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Dict", name = "dict", value = "类型字典", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("save")
	public RestfullResp<Integer> save(@RequestBody Dict dict, Principal principal) {
    		return new RestfullResp<>(service.save(dict));
    	}
    

    /**
    * @方法说明： 删除[类型字典]记录
    */
    @ApiOperation(value = "删除[类型字典]", notes = "返回影响记录行数")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[类型字典]的主键", required = true, dataType = "array", paramType = "query")})
    @PostMapping( "delete" )
    public RestfullResp<Integer> delete(@RequestParam("id") Long [] id, Principal principal) {
            return new RestfullResp<>(service.delete(id));
        }

		
    /**
    * @方法说明： 修改[类型字典]记录
    */
    @ApiOperation(value = "修改[类型字典]", notes = "返回影响记录行数,(必须传入完整对象,否则会有数据丢失)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Dict", name = "dict", value = "类型字典", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("update")
    public RestfullResp<Integer> update(@RequestBody Dict dict, Principal principal) {
        return new RestfullResp<>(service.update(dict));
    }
	
	  /**
    * @方法说明： 修改[类型字典]记录
    */
    @ApiOperation(value = "修改[类型字典]", notes = "返回影响记录行数(传入需要修改的属性和主键即可,其他可以为空)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Dict", name = "dict", value = "类型字典", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("updateNotNull")
    public RestfullResp<Integer> updateNotNull(@RequestBody Dict dict, Principal principal) {
        return new RestfullResp<>(service.updateNotNull(dict));
    }

    /**
    * @方法说明： 按条件查询分页[类型字典]列表
    */
    @ApiOperation(value = "按条件查询分页[类型字典]列表", notes = "返回分页[类型字典]列表")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "DictCond", name = "cond", value = "类型字典", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping( "queryPage")
    public RestfullResp<Page<Dict>> queryPage(@RequestBody DictCond cond, Principal principal) {
        return new RestfullResp<>(service.queryPage(cond));
    }

    /**
    * @方法说明： 按条件查询不分页[类型字典]列表
    */
    @ApiOperation(value = "按条件查询不分页[类型字典]列表", notes = "返回不分页[类型字典]列表")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "DictCond", name = "cond", value = "类型字典", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryList")
    public RestfullResp<List<Dict>> queryList(@RequestBody DictCond cond, Principal principal) {
    		return new RestfullResp<>(service.queryList(cond));
    }
	
	  /**
    * @方法说明： 按条件查询一个 类型字典 对象
    */
    @ApiOperation(value = "按条件查询一个 类型字典 对象", notes = "返回 类型字典对象")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "DictCond", name = "cond", value = "类型字典", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("findOne")
    public RestfullResp<Dict> findOne(@RequestBody DictCond cond, Principal principal) {
    		return new RestfullResp<>(service.findOne(cond));
    }
            
    /**
    * @方法说明： 按条件查询[类型字典]记录个数
    */
    @ApiOperation(value = "按条件查询[类型字典]记录个数", notes = "返回记录个数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "DictCond", name = "cond", value = "类型字典", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryCount")
	public RestfullResp<Long> queryCount(@RequestBody DictCond cond, Principal principal) {
		return new RestfullResp<>(service.queryCount(cond));
	}
                
    /**
    * @方法说明： 按主键查询单条[类型字典]记录
    */
    @ApiOperation(value = "按主键查询单个[类型字典]记录", notes = "返回单个[类型字典]对象")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[类型字典]的主键", required = true, dataType = "Long", paramType = "query")})
    @PostMapping("findById")
    public RestfullResp<Dict> findById(@RequestParam("id") Long id, Principal principal) {
    		return new RestfullResp<>(service.findById(id));
    	}

}

