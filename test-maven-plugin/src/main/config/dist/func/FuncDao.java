package org.alvin.test.func;
import java.util.List;

/**
* @类说明: 菜单--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface FuncDao {

	/**
    * @方法说明：物理删除菜单记录(多条)
    */
    int delete(Integer ids[]) ;
	
	/**
    * @方法说明：更新菜单记录
    */
    int update(Func vo) ;
	
	/**
    * @方法说明：更新菜单记录,不为空的都更新掉
    */
    int updateNotNull(Func vo);
	
	/**
    * @方法说明：新增菜单记录
    */
    int save(Func vo);

	/**
    * @方法说明：按条件查询不分页菜单列表
    */
    List<Func> queryList(FuncCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 菜单 对象
    */
    Func findOne(FuncCond cond) ;
	
	/**
    * @方法说明：按ID查找单个菜单实体
    */
    Func findById(Integer id);
	
	
	/**
    * @方法说明：按条件查询菜单记录个数
    */
    long queryCount(FuncCond cond);
	
	/**
    * @方法说明：按条件查询菜单记录个数
    */
    int deleteLogic(Integer ids[]);
	
	/**
    * @方法说明： 批量添加 菜单
    */
	int insertBatch(List<Func> list);
}