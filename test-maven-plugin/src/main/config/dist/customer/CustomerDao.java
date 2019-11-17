package org.alvin.test.customer;
import java.util.List;

/**
* @类说明: 客户--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface CustomerDao {

	/**
    * @方法说明：物理删除客户记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新客户记录
    */
    int update(Customer vo) ;
	
	/**
    * @方法说明：更新客户记录,不为空的都更新掉
    */
    int updateNotNull(Customer vo);
	
	/**
    * @方法说明：新增客户记录
    */
    int save(Customer vo);

	/**
    * @方法说明：按条件查询不分页客户列表
    */
    List<Customer> queryList(CustomerCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 客户 对象
    */
    Customer findOne(CustomerCond cond) ;
	
	/**
    * @方法说明：按ID查找单个客户实体
    */
    Customer findById(Long id);
	
	
	/**
    * @方法说明：按条件查询客户记录个数
    */
    long queryCount(CustomerCond cond);
	
	/**
    * @方法说明：按条件查询客户记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 客户
    */
	int insertBatch(List<Customer> list);
}