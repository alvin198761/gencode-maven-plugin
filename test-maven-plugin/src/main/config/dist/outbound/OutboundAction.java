package org.alvin.test.outbound;

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
* @类说明: "[出库记录]app端Swagger控制器类 ,使用requestbody 实现"
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Api(value = "[出库记录]控制器", description = "[出库记录]相关操作")
@RestController
@RequestMapping("/api/outbound")
public class OutboundAction{

    @Autowired
	private OutboundService service; //注入[出库记录]业务逻辑类

    /**
     * @方法说明：  新增[出库记录]记录
     */
    @ApiOperation(value = "新增[出库记录]", notes = "返回影响记录行数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Outbound", name = "outbound", value = "出库记录", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("save")
	public RestfullResp<Integer> save(@RequestBody Outbound outbound, Principal principal) {
    		return new RestfullResp<>(service.save(outbound));
    	}
    

    /**
    * @方法说明： 删除[出库记录]记录
    */
    @ApiOperation(value = "删除[出库记录]", notes = "返回影响记录行数")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[出库记录]的主键", required = true, dataType = "array", paramType = "query")})
    @PostMapping( "delete" )
    public RestfullResp<Integer> delete(@RequestParam("id") Long [] id, Principal principal) {
            return new RestfullResp<>(service.delete(id));
        }

		
    /**
    * @方法说明： 修改[出库记录]记录
    */
    @ApiOperation(value = "修改[出库记录]", notes = "返回影响记录行数,(必须传入完整对象,否则会有数据丢失)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Outbound", name = "outbound", value = "出库记录", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("update")
    public RestfullResp<Integer> update(@RequestBody Outbound outbound, Principal principal) {
        return new RestfullResp<>(service.update(outbound));
    }
	
	  /**
    * @方法说明： 修改[出库记录]记录
    */
    @ApiOperation(value = "修改[出库记录]", notes = "返回影响记录行数(传入需要修改的属性和主键即可,其他可以为空)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Outbound", name = "outbound", value = "出库记录", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("updateNotNull")
    public RestfullResp<Integer> updateNotNull(@RequestBody Outbound outbound, Principal principal) {
        return new RestfullResp<>(service.updateNotNull(outbound));
    }

    /**
    * @方法说明： 按条件查询分页[出库记录]列表
    */
    @ApiOperation(value = "按条件查询分页[出库记录]列表", notes = "返回分页[出库记录]列表")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "OutboundCond", name = "cond", value = "出库记录", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping( "queryPage")
    public RestfullResp<Page<Outbound>> queryPage(@RequestBody OutboundCond cond, Principal principal) {
        return new RestfullResp<>(service.queryPage(cond));
    }

    /**
    * @方法说明： 按条件查询不分页[出库记录]列表
    */
    @ApiOperation(value = "按条件查询不分页[出库记录]列表", notes = "返回不分页[出库记录]列表")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "OutboundCond", name = "cond", value = "出库记录", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryList")
    public RestfullResp<List<Outbound>> queryList(@RequestBody OutboundCond cond, Principal principal) {
    		return new RestfullResp<>(service.queryList(cond));
    }
	
	  /**
    * @方法说明： 按条件查询一个 出库记录 对象
    */
    @ApiOperation(value = "按条件查询一个 出库记录 对象", notes = "返回 出库记录对象")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "OutboundCond", name = "cond", value = "出库记录", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("findOne")
    public RestfullResp<Outbound> findOne(@RequestBody OutboundCond cond, Principal principal) {
    		return new RestfullResp<>(service.findOne(cond));
    }
            
    /**
    * @方法说明： 按条件查询[出库记录]记录个数
    */
    @ApiOperation(value = "按条件查询[出库记录]记录个数", notes = "返回记录个数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "OutboundCond", name = "cond", value = "出库记录", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryCount")
	public RestfullResp<Long> queryCount(@RequestBody OutboundCond cond, Principal principal) {
		return new RestfullResp<>(service.queryCount(cond));
	}
                
    /**
    * @方法说明： 按主键查询单条[出库记录]记录
    */
    @ApiOperation(value = "按主键查询单个[出库记录]记录", notes = "返回单个[出库记录]对象")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[出库记录]的主键", required = true, dataType = "Long", paramType = "query")})
    @PostMapping("findById")
    public RestfullResp<Outbound> findById(@RequestParam("id") Long id, Principal principal) {
    		return new RestfullResp<>(service.findById(id));
    	}

}

