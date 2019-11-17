package org.alvin.test.product;
import java.util.List;

/**
* @类说明: 产品--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface ProductDao {

	/**
    * @方法说明：物理删除产品记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新产品记录
    */
    int update(Product vo) ;
	
	/**
    * @方法说明：更新产品记录,不为空的都更新掉
    */
    int updateNotNull(Product vo);
	
	/**
    * @方法说明：新增产品记录
    */
    int save(Product vo);

	/**
    * @方法说明：按条件查询不分页产品列表
    */
    List<Product> queryList(ProductCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 产品 对象
    */
    Product findOne(ProductCond cond) ;
	
	/**
    * @方法说明：按ID查找单个产品实体
    */
    Product findById(Long id);
	
	
	/**
    * @方法说明：按条件查询产品记录个数
    */
    long queryCount(ProductCond cond);
	
	/**
    * @方法说明：按条件查询产品记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 产品
    */
	int insertBatch(List<Product> list);
}