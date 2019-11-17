package org.alvin.test.vendor;

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
* @类说明: "[供应商]app端Swagger控制器类 ,使用requestbody 实现"
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Api(value = "[供应商]控制器", description = "[供应商]相关操作")
@RestController
@RequestMapping("/api/vendor")
public class VendorAction{

    @Autowired
	private VendorService service; //注入[供应商]业务逻辑类

    /**
     * @方法说明：  新增[供应商]记录
     */
    @ApiOperation(value = "新增[供应商]", notes = "返回影响记录行数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Vendor", name = "vendor", value = "供应商", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("save")
	public RestfullResp<Integer> save(@RequestBody Vendor vendor, Principal principal) {
    		return new RestfullResp<>(service.save(vendor));
    	}
    

    /**
    * @方法说明： 删除[供应商]记录
    */
    @ApiOperation(value = "删除[供应商]", notes = "返回影响记录行数")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[供应商]的主键", required = true, dataType = "array", paramType = "query")})
    @PostMapping( "delete" )
    public RestfullResp<Integer> delete(@RequestParam("id") Long [] id, Principal principal) {
            return new RestfullResp<>(service.delete(id));
        }

		
    /**
    * @方法说明： 修改[供应商]记录
    */
    @ApiOperation(value = "修改[供应商]", notes = "返回影响记录行数,(必须传入完整对象,否则会有数据丢失)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Vendor", name = "vendor", value = "供应商", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("update")
    public RestfullResp<Integer> update(@RequestBody Vendor vendor, Principal principal) {
        return new RestfullResp<>(service.update(vendor));
    }
	
	  /**
    * @方法说明： 修改[供应商]记录
    */
    @ApiOperation(value = "修改[供应商]", notes = "返回影响记录行数(传入需要修改的属性和主键即可,其他可以为空)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Vendor", name = "vendor", value = "供应商", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("updateNotNull")
    public RestfullResp<Integer> updateNotNull(@RequestBody Vendor vendor, Principal principal) {
        return new RestfullResp<>(service.updateNotNull(vendor));
    }

    /**
    * @方法说明： 按条件查询分页[供应商]列表
    */
    @ApiOperation(value = "按条件查询分页[供应商]列表", notes = "返回分页[供应商]列表")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "VendorCond", name = "cond", value = "供应商", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping( "queryPage")
    public RestfullResp<Page<Vendor>> queryPage(@RequestBody VendorCond cond, Principal principal) {
        return new RestfullResp<>(service.queryPage(cond));
    }

    /**
    * @方法说明： 按条件查询不分页[供应商]列表
    */
    @ApiOperation(value = "按条件查询不分页[供应商]列表", notes = "返回不分页[供应商]列表")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "VendorCond", name = "cond", value = "供应商", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryList")
    public RestfullResp<List<Vendor>> queryList(@RequestBody VendorCond cond, Principal principal) {
    		return new RestfullResp<>(service.queryList(cond));
    }
	
	  /**
    * @方法说明： 按条件查询一个 供应商 对象
    */
    @ApiOperation(value = "按条件查询一个 供应商 对象", notes = "返回 供应商对象")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "VendorCond", name = "cond", value = "供应商", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("findOne")
    public RestfullResp<Vendor> findOne(@RequestBody VendorCond cond, Principal principal) {
    		return new RestfullResp<>(service.findOne(cond));
    }
            
    /**
    * @方法说明： 按条件查询[供应商]记录个数
    */
    @ApiOperation(value = "按条件查询[供应商]记录个数", notes = "返回记录个数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "VendorCond", name = "cond", value = "供应商", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryCount")
	public RestfullResp<Long> queryCount(@RequestBody VendorCond cond, Principal principal) {
		return new RestfullResp<>(service.queryCount(cond));
	}
                
    /**
    * @方法说明： 按主键查询单条[供应商]记录
    */
    @ApiOperation(value = "按主键查询单个[供应商]记录", notes = "返回单个[供应商]对象")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[供应商]的主键", required = true, dataType = "Long", paramType = "query")})
    @PostMapping("findById")
    public RestfullResp<Vendor> findById(@RequestParam("id") Long id, Principal principal) {
    		return new RestfullResp<>(service.findById(id));
    	}

}

