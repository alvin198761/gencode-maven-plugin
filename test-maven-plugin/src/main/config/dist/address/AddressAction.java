package org.alvin.test.address;

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
* @类说明: "[收寄信息]app端Swagger控制器类 ,使用requestbody 实现"
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Api(value = "[收寄信息]控制器", description = "[收寄信息]相关操作")
@RestController
@RequestMapping("/api/address")
public class AddressAction{

    @Autowired
	private AddressService service; //注入[收寄信息]业务逻辑类

    /**
     * @方法说明：  新增[收寄信息]记录
     */
    @ApiOperation(value = "新增[收寄信息]", notes = "返回影响记录行数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Address", name = "address", value = "收寄信息", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("save")
	public RestfullResp<Integer> save(@RequestBody Address address, Principal principal) {
    		return new RestfullResp<>(service.save(address));
    	}
    

    /**
    * @方法说明： 删除[收寄信息]记录
    */
    @ApiOperation(value = "删除[收寄信息]", notes = "返回影响记录行数")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[收寄信息]的主键", required = true, dataType = "array", paramType = "query")})
    @PostMapping( "delete" )
    public RestfullResp<Integer> delete(@RequestParam("id") Long [] id, Principal principal) {
            return new RestfullResp<>(service.delete(id));
        }

		
    /**
    * @方法说明： 修改[收寄信息]记录
    */
    @ApiOperation(value = "修改[收寄信息]", notes = "返回影响记录行数,(必须传入完整对象,否则会有数据丢失)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Address", name = "address", value = "收寄信息", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("update")
    public RestfullResp<Integer> update(@RequestBody Address address, Principal principal) {
        return new RestfullResp<>(service.update(address));
    }
	
	  /**
    * @方法说明： 修改[收寄信息]记录
    */
    @ApiOperation(value = "修改[收寄信息]", notes = "返回影响记录行数(传入需要修改的属性和主键即可,其他可以为空)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Address", name = "address", value = "收寄信息", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("updateNotNull")
    public RestfullResp<Integer> updateNotNull(@RequestBody Address address, Principal principal) {
        return new RestfullResp<>(service.updateNotNull(address));
    }

    /**
    * @方法说明： 按条件查询分页[收寄信息]列表
    */
    @ApiOperation(value = "按条件查询分页[收寄信息]列表", notes = "返回分页[收寄信息]列表")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "AddressCond", name = "cond", value = "收寄信息", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping( "queryPage")
    public RestfullResp<Page<Address>> queryPage(@RequestBody AddressCond cond, Principal principal) {
        return new RestfullResp<>(service.queryPage(cond));
    }

    /**
    * @方法说明： 按条件查询不分页[收寄信息]列表
    */
    @ApiOperation(value = "按条件查询不分页[收寄信息]列表", notes = "返回不分页[收寄信息]列表")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "AddressCond", name = "cond", value = "收寄信息", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryList")
    public RestfullResp<List<Address>> queryList(@RequestBody AddressCond cond, Principal principal) {
    		return new RestfullResp<>(service.queryList(cond));
    }
	
	  /**
    * @方法说明： 按条件查询一个 收寄信息 对象
    */
    @ApiOperation(value = "按条件查询一个 收寄信息 对象", notes = "返回 收寄信息对象")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "AddressCond", name = "cond", value = "收寄信息", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("findOne")
    public RestfullResp<Address> findOne(@RequestBody AddressCond cond, Principal principal) {
    		return new RestfullResp<>(service.findOne(cond));
    }
            
    /**
    * @方法说明： 按条件查询[收寄信息]记录个数
    */
    @ApiOperation(value = "按条件查询[收寄信息]记录个数", notes = "返回记录个数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "AddressCond", name = "cond", value = "收寄信息", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryCount")
	public RestfullResp<Long> queryCount(@RequestBody AddressCond cond, Principal principal) {
		return new RestfullResp<>(service.queryCount(cond));
	}
                
    /**
    * @方法说明： 按主键查询单条[收寄信息]记录
    */
    @ApiOperation(value = "按主键查询单个[收寄信息]记录", notes = "返回单个[收寄信息]对象")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[收寄信息]的主键", required = true, dataType = "Long", paramType = "query")})
    @PostMapping("findById")
    public RestfullResp<Address> findById(@RequestParam("id") Long id, Principal principal) {
    		return new RestfullResp<>(service.findById(id));
    	}

}

