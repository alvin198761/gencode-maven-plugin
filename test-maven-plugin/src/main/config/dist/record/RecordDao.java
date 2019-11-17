package org.alvin.test.record;
import java.util.List;

/**
* @类说明: 产品信息记录--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface RecordDao {

	/**
    * @方法说明：物理删除产品信息记录记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新产品信息记录记录
    */
    int update(Record vo) ;
	
	/**
    * @方法说明：更新产品信息记录记录,不为空的都更新掉
    */
    int updateNotNull(Record vo);
	
	/**
    * @方法说明：新增产品信息记录记录
    */
    int save(Record vo);

	/**
    * @方法说明：按条件查询不分页产品信息记录列表
    */
    List<Record> queryList(RecordCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 产品信息记录 对象
    */
    Record findOne(RecordCond cond) ;
	
	/**
    * @方法说明：按ID查找单个产品信息记录实体
    */
    Record findById(Long id);
	
	
	/**
    * @方法说明：按条件查询产品信息记录记录个数
    */
    long queryCount(RecordCond cond);
	
	/**
    * @方法说明：按条件查询产品信息记录记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 产品信息记录
    */
	int insertBatch(List<Record> list);
}