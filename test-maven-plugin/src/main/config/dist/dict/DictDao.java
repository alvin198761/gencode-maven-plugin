package org.alvin.test.dict;
import java.util.List;

/**
* @类说明: 类型字典--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface DictDao {

	/**
    * @方法说明：物理删除类型字典记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新类型字典记录
    */
    int update(Dict vo) ;
	
	/**
    * @方法说明：更新类型字典记录,不为空的都更新掉
    */
    int updateNotNull(Dict vo);
	
	/**
    * @方法说明：新增类型字典记录
    */
    int save(Dict vo);

	/**
    * @方法说明：按条件查询不分页类型字典列表
    */
    List<Dict> queryList(DictCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 类型字典 对象
    */
    Dict findOne(DictCond cond) ;
	
	/**
    * @方法说明：按ID查找单个类型字典实体
    */
    Dict findById(Long id);
	
	
	/**
    * @方法说明：按条件查询类型字典记录个数
    */
    long queryCount(DictCond cond);
	
	/**
    * @方法说明：按条件查询类型字典记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 类型字典
    */
	int insertBatch(List<Dict> list);
}