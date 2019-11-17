package org.alvin.test.dept;
import java.util.List;

/**
* @类说明: admin_dept--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface DeptDao {

	/**
    * @方法说明：物理删除admin_dept记录(多条)
    */
    int delete(Integer ids[]) ;
	
	/**
    * @方法说明：更新admin_dept记录
    */
    int update(Dept vo) ;
	
	/**
    * @方法说明：更新admin_dept记录,不为空的都更新掉
    */
    int updateNotNull(Dept vo);
	
	/**
    * @方法说明：新增admin_dept记录
    */
    int save(Dept vo);

	/**
    * @方法说明：按条件查询不分页admin_dept列表
    */
    List<Dept> queryList(DeptCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 admin_dept 对象
    */
    Dept findOne(DeptCond cond) ;
	
	/**
    * @方法说明：按ID查找单个admin_dept实体
    */
    Dept findById(Integer id);
	
	
	/**
    * @方法说明：按条件查询admin_dept记录个数
    */
    long queryCount(DeptCond cond);
	
	/**
    * @方法说明：按条件查询admin_dept记录个数
    */
    int deleteLogic(Integer ids[]);
	
	/**
    * @方法说明： 批量添加 admin_dept
    */
	int insertBatch(List<Dept> list);
}