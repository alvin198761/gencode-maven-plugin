package org.alvin.test.rolefunc;
import java.util.List;

/**
* @类说明: admin_role_func--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface RoleFuncDao {

	/**
    * @方法说明：物理删除admin_role_func记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新admin_role_func记录
    */
    int update(RoleFunc vo) ;
	
	/**
    * @方法说明：更新admin_role_func记录,不为空的都更新掉
    */
    int updateNotNull(RoleFunc vo);
	
	/**
    * @方法说明：新增admin_role_func记录
    */
    int save(RoleFunc vo);

	/**
    * @方法说明：按条件查询不分页admin_role_func列表
    */
    List<RoleFunc> queryList(RoleFuncCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 admin_role_func 对象
    */
    RoleFunc findOne(RoleFuncCond cond) ;
	
	/**
    * @方法说明：按ID查找单个admin_role_func实体
    */
    RoleFunc findById(Long id);
	
	
	/**
    * @方法说明：按条件查询admin_role_func记录个数
    */
    long queryCount(RoleFuncCond cond);
	
	/**
    * @方法说明：按条件查询admin_role_func记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 admin_role_func
    */
	int insertBatch(List<RoleFunc> list);
}