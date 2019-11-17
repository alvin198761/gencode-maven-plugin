package org.alvin.test.customer;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 客户--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class CustomerService {

	 
	@Autowired
	private CustomerDao dao; //注入客户数据访问层

	/**
	* @方法说明：  新增[客户]记录
	*/
	@Transactional
	public int save(Customer customer) {
		return dao.save(customer);
	}

	/**
	* @方法说明：  删除客户记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新客户记录
	*/
	@Transactional
	public int update(Customer customer) {
		return dao.update(customer); 
	}

	 /**
    * @方法说明：更新客户记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Customer customer) {
		return dao.updateNotNull(customer); 
    }

	/**
	* @方法说明： 按条件查询分页客户列表
	*/
	public Page<Customer> queryPage(CustomerCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页客户列表(使用范型)
	*/
	public List<Customer> queryList(CustomerCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 客户 对象
	*/
	public Customer findOne(CustomerCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个客户记录
	*/
	public Customer findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询客户记录个数
	*/
	public long queryCount(CustomerCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 客户
	*/
	@Transactional
	public int insertBatch(List<Customer> list){
		return dao.insertBatch(list);
	}
}