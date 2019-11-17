package org.alvin.test.bill;
import java.util.List;

/**
* @类说明: 开票信息--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface BillDao {

	/**
    * @方法说明：物理删除开票信息记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新开票信息记录
    */
    int update(Bill vo) ;
	
	/**
    * @方法说明：更新开票信息记录,不为空的都更新掉
    */
    int updateNotNull(Bill vo);
	
	/**
    * @方法说明：新增开票信息记录
    */
    int save(Bill vo);

	/**
    * @方法说明：按条件查询不分页开票信息列表
    */
    List<Bill> queryList(BillCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 开票信息 对象
    */
    Bill findOne(BillCond cond) ;
	
	/**
    * @方法说明：按ID查找单个开票信息实体
    */
    Bill findById(Long id);
	
	
	/**
    * @方法说明：按条件查询开票信息记录个数
    */
    long queryCount(BillCond cond);
	
	/**
    * @方法说明：按条件查询开票信息记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 开票信息
    */
	int insertBatch(List<Bill> list);
}