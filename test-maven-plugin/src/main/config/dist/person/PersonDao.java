package org.alvin.test.person;
import java.util.List;

/**
* @类说明: 联系人--数据访问层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
public interface PersonDao {

	/**
    * @方法说明：物理删除联系人记录(多条)
    */
    int delete(Long ids[]) ;
	
	/**
    * @方法说明：更新联系人记录
    */
    int update(Person vo) ;
	
	/**
    * @方法说明：更新联系人记录,不为空的都更新掉
    */
    int updateNotNull(Person vo);
	
	/**
    * @方法说明：新增联系人记录
    */
    int save(Person vo);

	/**
    * @方法说明：按条件查询不分页联系人列表
    */
    List<Person> queryList(PersonCond cond) ;
	
	/**
    * @方法说明：按条件查询一个 联系人 对象
    */
    Person findOne(PersonCond cond) ;
	
	/**
    * @方法说明：按ID查找单个联系人实体
    */
    Person findById(Long id);
	
	
	/**
    * @方法说明：按条件查询联系人记录个数
    */
    long queryCount(PersonCond cond);
	
	/**
    * @方法说明：按条件查询联系人记录个数
    */
    int deleteLogic(Long ids[]);
	
	/**
    * @方法说明： 批量添加 联系人
    */
	int insertBatch(List<Person> list);
}