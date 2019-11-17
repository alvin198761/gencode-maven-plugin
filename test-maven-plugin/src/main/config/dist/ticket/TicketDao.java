package org.alvin.test.ticket;
import java.util.List;

/**
* @类说明: 进销项发票录入--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface TicketDao {

	/**
    * @方法说明：物理删除进销项发票录入记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新进销项发票录入记录
    */
    int update(Ticket vo) ;
	
	/**
    * @方法说明：更新进销项发票录入记录,不为空的都更新掉
    */
    int updateNotNull(Ticket vo);
	
	/**
    * @方法说明：新增进销项发票录入记录
    */
    int save(Ticket vo);

	/**
    * @方法说明：按条件查询不分页进销项发票录入列表
    */
    List<Ticket> queryList(TicketCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 进销项发票录入 对象
    */
    Ticket findOne(TicketCond cond) ;
	
	/**
    * @方法说明：按ID查找单个进销项发票录入实体
    */
    Ticket findById(Long id);
	
	
	/**
    * @方法说明：按条件查询进销项发票录入记录个数
    */
    long queryCount(TicketCond cond);
	
	/**
    * @方法说明：按条件查询进销项发票录入记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 进销项发票录入
    */
	int insertBatch(List<Ticket> list);
}