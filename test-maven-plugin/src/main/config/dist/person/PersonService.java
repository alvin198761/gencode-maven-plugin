package org.alvin.test.person;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 联系人--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class PersonService {

	 
	@Autowired
	private PersonDao dao; //注入联系人数据访问层

	/**
	* @方法说明：  新增[联系人]记录
	*/
	@Transactional
	public int save(Person person) {
		return dao.save(person);
	}

	/**
	* @方法说明：  删除联系人记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新联系人记录
	*/
	@Transactional
	public int update(Person person) {
		return dao.update(person); 
	}

	 /**
    * @方法说明：更新联系人记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Person person) {
		return dao.updateNotNull(person); 
    }

	/**
	* @方法说明： 按条件查询分页联系人列表
	*/
	public Page<Person> queryPage(PersonCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页联系人列表(使用范型)
	*/
	public List<Person> queryList(PersonCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 联系人 对象
	*/
	public Person findOne(PersonCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个联系人记录
	*/
	public Person findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询联系人记录个数
	*/
	public long queryCount(PersonCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 联系人
	*/
	@Transactional
	public int insertBatch(List<Person> list){
		return dao.insertBatch(list);
	}
}