package org.alvin.test.menu;

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
* @类说明: "[admin_menu]app端Swagger控制器类 ,使用requestbody 实现"
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Api(value = "[admin_menu]控制器", description = "[admin_menu]相关操作")
@RestController
@RequestMapping("/api/menu")
public class MenuAction{

    @Autowired
	private MenuService service; //注入[admin_menu]业务逻辑类

    /**
     * @方法说明：  新增[admin_menu]记录
     */
    @ApiOperation(value = "新增[admin_menu]", notes = "返回影响记录行数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Menu", name = "menu", value = "admin_menu", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("save")
	public RestfullResp<Integer> save(@RequestBody Menu menu, Principal principal) {
    		return new RestfullResp<>(service.save(menu));
    	}
    

    /**
    * @方法说明： 删除[admin_menu]记录
    */
    @ApiOperation(value = "删除[admin_menu]", notes = "返回影响记录行数")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[admin_menu]的主键", required = true, dataType = "array", paramType = "query")})
    @PostMapping( "delete" )
    public RestfullResp<Integer> delete(@RequestParam("id") Long [] id, Principal principal) {
            return new RestfullResp<>(service.delete(id));
        }

		
    /**
    * @方法说明： 修改[admin_menu]记录
    */
    @ApiOperation(value = "修改[admin_menu]", notes = "返回影响记录行数,(必须传入完整对象,否则会有数据丢失)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Menu", name = "menu", value = "admin_menu", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("update")
    public RestfullResp<Integer> update(@RequestBody Menu menu, Principal principal) {
        return new RestfullResp<>(service.update(menu));
    }
	
	  /**
    * @方法说明： 修改[admin_menu]记录
    */
    @ApiOperation(value = "修改[admin_menu]", notes = "返回影响记录行数(传入需要修改的属性和主键即可,其他可以为空)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Menu", name = "menu", value = "admin_menu", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("updateNotNull")
    public RestfullResp<Integer> updateNotNull(@RequestBody Menu menu, Principal principal) {
        return new RestfullResp<>(service.updateNotNull(menu));
    }

    /**
    * @方法说明： 按条件查询分页[admin_menu]列表
    */
    @ApiOperation(value = "按条件查询分页[admin_menu]列表", notes = "返回分页[admin_menu]列表")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "MenuCond", name = "cond", value = "admin_menu", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping( "queryPage")
    public RestfullResp<Page<Menu>> queryPage(@RequestBody MenuCond cond, Principal principal) {
        return new RestfullResp<>(service.queryPage(cond));
    }

    /**
    * @方法说明： 按条件查询不分页[admin_menu]列表
    */
    @ApiOperation(value = "按条件查询不分页[admin_menu]列表", notes = "返回不分页[admin_menu]列表")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "MenuCond", name = "cond", value = "admin_menu", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryList")
    public RestfullResp<List<Menu>> queryList(@RequestBody MenuCond cond, Principal principal) {
    		return new RestfullResp<>(service.queryList(cond));
    }
	
	  /**
    * @方法说明： 按条件查询一个 admin_menu 对象
    */
    @ApiOperation(value = "按条件查询一个 admin_menu 对象", notes = "返回 admin_menu对象")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "MenuCond", name = "cond", value = "admin_menu", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("findOne")
    public RestfullResp<Menu> findOne(@RequestBody MenuCond cond, Principal principal) {
    		return new RestfullResp<>(service.findOne(cond));
    }
            
    /**
    * @方法说明： 按条件查询[admin_menu]记录个数
    */
    @ApiOperation(value = "按条件查询[admin_menu]记录个数", notes = "返回记录个数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "MenuCond", name = "cond", value = "admin_menu", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryCount")
	public RestfullResp<Long> queryCount(@RequestBody MenuCond cond, Principal principal) {
		return new RestfullResp<>(service.queryCount(cond));
	}
                
    /**
    * @方法说明： 按主键查询单条[admin_menu]记录
    */
    @ApiOperation(value = "按主键查询单个[admin_menu]记录", notes = "返回单个[admin_menu]对象")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[admin_menu]的主键", required = true, dataType = "Long", paramType = "query")})
    @PostMapping("findById")
    public RestfullResp<Menu> findById(@RequestParam("id") Long id, Principal principal) {
    		return new RestfullResp<>(service.findById(id));
    	}

}

