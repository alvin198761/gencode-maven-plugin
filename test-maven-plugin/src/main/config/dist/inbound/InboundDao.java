package org.alvin.test.inbound;
import java.util.List;

/**
* @类说明: 入库记录--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface InboundDao {

	/**
    * @方法说明：物理删除入库记录记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新入库记录记录
    */
    int update(Inbound vo) ;
	
	/**
    * @方法说明：更新入库记录记录,不为空的都更新掉
    */
    int updateNotNull(Inbound vo);
	
	/**
    * @方法说明：新增入库记录记录
    */
    int save(Inbound vo);

	/**
    * @方法说明：按条件查询不分页入库记录列表
    */
    List<Inbound> queryList(InboundCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 入库记录 对象
    */
    Inbound findOne(InboundCond cond) ;
	
	/**
    * @方法说明：按ID查找单个入库记录实体
    */
    Inbound findById(Long id);
	
	
	/**
    * @方法说明：按条件查询入库记录记录个数
    */
    long queryCount(InboundCond cond);
	
	/**
    * @方法说明：按条件查询入库记录记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 入库记录
    */
	int insertBatch(List<Inbound> list);
}