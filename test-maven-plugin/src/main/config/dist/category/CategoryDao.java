package org.alvin.test.category;
import java.util.List;

/**
* @类说明: 税收分类--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface CategoryDao {

	/**
    * @方法说明：物理删除税收分类记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新税收分类记录
    */
    int update(Category vo) ;
	
	/**
    * @方法说明：更新税收分类记录,不为空的都更新掉
    */
    int updateNotNull(Category vo);
	
	/**
    * @方法说明：新增税收分类记录
    */
    int save(Category vo);

	/**
    * @方法说明：按条件查询不分页税收分类列表
    */
    List<Category> queryList(CategoryCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 税收分类 对象
    */
    Category findOne(CategoryCond cond) ;
	
	/**
    * @方法说明：按ID查找单个税收分类实体
    */
    Category findById(Long id);
	
	
	/**
    * @方法说明：按条件查询税收分类记录个数
    */
    long queryCount(CategoryCond cond);
	
	/**
    * @方法说明：按条件查询税收分类记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 税收分类
    */
	int insertBatch(List<Category> list);
}