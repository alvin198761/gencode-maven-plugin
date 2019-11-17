package org.alvin.test.roledept;
import java.util.List;

/**
* @类说明: admin_role_dept--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface RoleDeptDao {

	/**
    * @方法说明：物理删除admin_role_dept记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新admin_role_dept记录
    */
    int update(RoleDept vo) ;
	
	/**
    * @方法说明：更新admin_role_dept记录,不为空的都更新掉
    */
    int updateNotNull(RoleDept vo);
	
	/**
    * @方法说明：新增admin_role_dept记录
    */
    int save(RoleDept vo);

	/**
    * @方法说明：按条件查询不分页admin_role_dept列表
    */
    List<RoleDept> queryList(RoleDeptCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 admin_role_dept 对象
    */
    RoleDept findOne(RoleDeptCond cond) ;
	
	/**
    * @方法说明：按ID查找单个admin_role_dept实体
    */
    RoleDept findById(Long id);
	
	
	/**
    * @方法说明：按条件查询admin_role_dept记录个数
    */
    long queryCount(RoleDeptCond cond);
	
	/**
    * @方法说明：按条件查询admin_role_dept记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 admin_role_dept
    */
	int insertBatch(List<RoleDept> list);
}