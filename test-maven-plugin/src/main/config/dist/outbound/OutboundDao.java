package org.alvin.test.outbound;
import java.util.List;

/**
* @类说明: 出库记录--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface OutboundDao {

	/**
    * @方法说明：物理删除出库记录记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新出库记录记录
    */
    int update(Outbound vo) ;
	
	/**
    * @方法说明：更新出库记录记录,不为空的都更新掉
    */
    int updateNotNull(Outbound vo);
	
	/**
    * @方法说明：新增出库记录记录
    */
    int save(Outbound vo);

	/**
    * @方法说明：按条件查询不分页出库记录列表
    */
    List<Outbound> queryList(OutboundCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 出库记录 对象
    */
    Outbound findOne(OutboundCond cond) ;
	
	/**
    * @方法说明：按ID查找单个出库记录实体
    */
    Outbound findById(Long id);
	
	
	/**
    * @方法说明：按条件查询出库记录记录个数
    */
    long queryCount(OutboundCond cond);
	
	/**
    * @方法说明：按条件查询出库记录记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 出库记录
    */
	int insertBatch(List<Outbound> list);
}