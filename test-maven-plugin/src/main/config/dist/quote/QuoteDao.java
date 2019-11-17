package org.alvin.test.quote;
import java.util.List;

/**
* @类说明: 报价--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface QuoteDao {

	/**
    * @方法说明：物理删除报价记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新报价记录
    */
    int update(Quote vo) ;
	
	/**
    * @方法说明：更新报价记录,不为空的都更新掉
    */
    int updateNotNull(Quote vo);
	
	/**
    * @方法说明：新增报价记录
    */
    int save(Quote vo);

	/**
    * @方法说明：按条件查询不分页报价列表
    */
    List<Quote> queryList(QuoteCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 报价 对象
    */
    Quote findOne(QuoteCond cond) ;
	
	/**
    * @方法说明：按ID查找单个报价实体
    */
    Quote findById(Long id);
	
	
	/**
    * @方法说明：按条件查询报价记录个数
    */
    long queryCount(QuoteCond cond);
	
	/**
    * @方法说明：按条件查询报价记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 报价
    */
	int insertBatch(List<Quote> list);
}