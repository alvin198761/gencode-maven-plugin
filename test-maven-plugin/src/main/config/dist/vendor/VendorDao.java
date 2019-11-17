package org.alvin.test.vendor;
import java.util.List;

/**
* @类说明: 供应商--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface VendorDao {

	/**
    * @方法说明：物理删除供应商记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新供应商记录
    */
    int update(Vendor vo) ;
	
	/**
    * @方法说明：更新供应商记录,不为空的都更新掉
    */
    int updateNotNull(Vendor vo);
	
	/**
    * @方法说明：新增供应商记录
    */
    int save(Vendor vo);

	/**
    * @方法说明：按条件查询不分页供应商列表
    */
    List<Vendor> queryList(VendorCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 供应商 对象
    */
    Vendor findOne(VendorCond cond) ;
	
	/**
    * @方法说明：按ID查找单个供应商实体
    */
    Vendor findById(Long id);
	
	
	/**
    * @方法说明：按条件查询供应商记录个数
    */
    long queryCount(VendorCond cond);
	
	/**
    * @方法说明：按条件查询供应商记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 供应商
    */
	int insertBatch(List<Vendor> list);
}