package org.alvin.test.menurule;
import java.util.List;

/**
* @类说明: admin_menu_rule--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface MenuRuleDao {

	/**
    * @方法说明：物理删除admin_menu_rule记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新admin_menu_rule记录
    */
    int update(MenuRule vo) ;
	
	/**
    * @方法说明：更新admin_menu_rule记录,不为空的都更新掉
    */
    int updateNotNull(MenuRule vo);
	
	/**
    * @方法说明：新增admin_menu_rule记录
    */
    int save(MenuRule vo);

	/**
    * @方法说明：按条件查询不分页admin_menu_rule列表
    */
    List<MenuRule> queryList(MenuRuleCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 admin_menu_rule 对象
    */
    MenuRule findOne(MenuRuleCond cond) ;
	
	/**
    * @方法说明：按ID查找单个admin_menu_rule实体
    */
    MenuRule findById(Long id);
	
	
	/**
    * @方法说明：按条件查询admin_menu_rule记录个数
    */
    long queryCount(MenuRuleCond cond);
	
	/**
    * @方法说明：按条件查询admin_menu_rule记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 admin_menu_rule
    */
	int insertBatch(List<MenuRule> list);
}