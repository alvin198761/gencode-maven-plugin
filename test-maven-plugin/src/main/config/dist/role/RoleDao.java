package org.alvin.test.role;
import java.util.List;

/**
* @类说明: admin_role--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface RoleDao {

	/**
    * @方法说明：物理删除admin_role记录(多条)
    */
    int delete(Integer ids[]) ;
	
	/**
    * @方法说明：更新admin_role记录
    */
    int update(Role vo) ;
	
	/**
    * @方法说明：更新admin_role记录,不为空的都更新掉
    */
    int updateNotNull(Role vo);
	
	/**
    * @方法说明：新增admin_role记录
    */
    int save(Role vo);

	/**
    * @方法说明：按条件查询不分页admin_role列表
    */
    List<Role> queryList(RoleCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 admin_role 对象
    */
    Role findOne(RoleCond cond) ;
	
	/**
    * @方法说明：按ID查找单个admin_role实体
    */
    Role findById(Integer id);
	
	
	/**
    * @方法说明：按条件查询admin_role记录个数
    */
    long queryCount(RoleCond cond);
	
	/**
    * @方法说明：按条件查询admin_role记录个数
    */
    int deleteLogic(Integer ids[]);
	
	/**
    * @方法说明： 批量添加 admin_role
    */
	int insertBatch(List<Role> list);
}