package org.alvin.test.menu;
import java.util.List;

/**
* @类说明: admin_menu--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface MenuDao {

	/**
    * @方法说明：物理删除admin_menu记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新admin_menu记录
    */
    int update(Menu vo) ;
	
	/**
    * @方法说明：更新admin_menu记录,不为空的都更新掉
    */
    int updateNotNull(Menu vo);
	
	/**
    * @方法说明：新增admin_menu记录
    */
    int save(Menu vo);

	/**
    * @方法说明：按条件查询不分页admin_menu列表
    */
    List<Menu> queryList(MenuCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 admin_menu 对象
    */
    Menu findOne(MenuCond cond) ;
	
	/**
    * @方法说明：按ID查找单个admin_menu实体
    */
    Menu findById(Long id);
	
	
	/**
    * @方法说明：按条件查询admin_menu记录个数
    */
    long queryCount(MenuCond cond);
	
	/**
    * @方法说明：按条件查询admin_menu记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 admin_menu
    */
	int insertBatch(List<Menu> list);
}