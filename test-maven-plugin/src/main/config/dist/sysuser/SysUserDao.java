package org.alvin.test.sysuser;
import java.util.List;

/**
* @类说明: admin_sys_user--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface SysUserDao {

	/**
    * @方法说明：物理删除admin_sys_user记录(多条)
    */
    int delete(Integer ids[]) ;
	
	/**
    * @方法说明：更新admin_sys_user记录
    */
    int update(SysUser vo) ;
	
	/**
    * @方法说明：更新admin_sys_user记录,不为空的都更新掉
    */
    int updateNotNull(SysUser vo);
	
	/**
    * @方法说明：新增admin_sys_user记录
    */
    int save(SysUser vo);

	/**
    * @方法说明：按条件查询不分页admin_sys_user列表
    */
    List<SysUser> queryList(SysUserCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 admin_sys_user 对象
    */
    SysUser findOne(SysUserCond cond) ;
	
	/**
    * @方法说明：按ID查找单个admin_sys_user实体
    */
    SysUser findById(Integer id);
	
	
	/**
    * @方法说明：按条件查询admin_sys_user记录个数
    */
    long queryCount(SysUserCond cond);
	
	/**
    * @方法说明：按条件查询admin_sys_user记录个数
    */
    int deleteLogic(Integer ids[]);
	
	/**
    * @方法说明： 批量添加 admin_sys_user
    */
	int insertBatch(List<SysUser> list);
}