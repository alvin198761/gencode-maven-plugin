package org.alvin.test.product;

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
* @类说明: "[产品]app端Swagger控制器类 ,使用requestbody 实现"
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Api(value = "[产品]控制器", description = "[产品]相关操作")
@RestController
@RequestMapping("/api/product")
public class ProductAction{

    @Autowired
	private ProductService service; //注入[产品]业务逻辑类

    /**
     * @方法说明：  新增[产品]记录
     */
    @ApiOperation(value = "新增[产品]", notes = "返回影响记录行数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Product", name = "product", value = "产品", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("save")
	public RestfullResp<Integer> save(@RequestBody Product product, Principal principal) {
    		return new RestfullResp<>(service.save(product));
    	}
    

    /**
    * @方法说明： 删除[产品]记录
    */
    @ApiOperation(value = "删除[产品]", notes = "返回影响记录行数")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[产品]的主键", required = true, dataType = "array", paramType = "query")})
    @PostMapping( "delete" )
    public RestfullResp<Integer> delete(@RequestParam("id") Long [] id, Principal principal) {
            return new RestfullResp<>(service.delete(id));
        }

		
    /**
    * @方法说明： 修改[产品]记录
    */
    @ApiOperation(value = "修改[产品]", notes = "返回影响记录行数,(必须传入完整对象,否则会有数据丢失)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Product", name = "product", value = "产品", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("update")
    public RestfullResp<Integer> update(@RequestBody Product product, Principal principal) {
        return new RestfullResp<>(service.update(product));
    }
	
	  /**
    * @方法说明： 修改[产品]记录
    */
    @ApiOperation(value = "修改[产品]", notes = "返回影响记录行数(传入需要修改的属性和主键即可,其他可以为空)")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "Product", name = "product", value = "产品", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping("updateNotNull")
    public RestfullResp<Integer> updateNotNull(@RequestBody Product product, Principal principal) {
        return new RestfullResp<>(service.updateNotNull(product));
    }

    /**
    * @方法说明： 按条件查询分页[产品]列表
    */
    @ApiOperation(value = "按条件查询分页[产品]列表", notes = "返回分页[产品]列表")
     @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "ProductCond", name = "cond", value = "产品", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
    @PostMapping( "queryPage")
    public RestfullResp<Page<Product>> queryPage(@RequestBody ProductCond cond, Principal principal) {
        return new RestfullResp<>(service.queryPage(cond));
    }

    /**
    * @方法说明： 按条件查询不分页[产品]列表
    */
    @ApiOperation(value = "按条件查询不分页[产品]列表", notes = "返回不分页[产品]列表")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "ProductCond", name = "cond", value = "产品", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryList")
    public RestfullResp<List<Product>> queryList(@RequestBody ProductCond cond, Principal principal) {
    		return new RestfullResp<>(service.queryList(cond));
    }
	
	  /**
    * @方法说明： 按条件查询一个 产品 对象
    */
    @ApiOperation(value = "按条件查询一个 产品 对象", notes = "返回 产品对象")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "ProductCond", name = "cond", value = "产品", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("findOne")
    public RestfullResp<Product> findOne(@RequestBody ProductCond cond, Principal principal) {
    		return new RestfullResp<>(service.findOne(cond));
    }
            
    /**
    * @方法说明： 按条件查询[产品]记录个数
    */
    @ApiOperation(value = "按条件查询[产品]记录个数", notes = "返回记录个数")
    @ApiImplicitParams(
    {
        @ApiImplicitParam(paramType = "body", dataType = "ProductCond", name = "cond", value = "产品", required = true) 
    })
    @ApiResponses({
        @ApiResponse(code = 0, message = "操作成功")
    })
	@PostMapping("queryCount")
	public RestfullResp<Long> queryCount(@RequestBody ProductCond cond, Principal principal) {
		return new RestfullResp<>(service.queryCount(cond));
	}
                
    /**
    * @方法说明： 按主键查询单条[产品]记录
    */
    @ApiOperation(value = "按主键查询单个[产品]记录", notes = "返回单个[产品]对象")
    @ApiImplicitParams({ @ApiImplicitParam(name = "id", value = "[产品]的主键", required = true, dataType = "Long", paramType = "query")})
    @PostMapping("findById")
    public RestfullResp<Product> findById(@RequestParam("id") Long id, Principal principal) {
    		return new RestfullResp<>(service.findById(id));
    	}

}

