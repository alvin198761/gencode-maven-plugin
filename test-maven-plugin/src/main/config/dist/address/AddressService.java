package org.alvin.test.address;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 收寄信息--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class AddressService {

	 
	@Autowired
	private AddressDao dao; //注入收寄信息数据访问层

	/**
	* @方法说明：  新增[收寄信息]记录
	*/
	@Transactional
	public int save(Address address) {
		return dao.save(address);
	}

	/**
	* @方法说明：  删除收寄信息记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新收寄信息记录
	*/
	@Transactional
	public int update(Address address) {
		return dao.update(address); 
	}

	 /**
    * @方法说明：更新收寄信息记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Address address) {
		return dao.updateNotNull(address); 
    }

	/**
	* @方法说明： 按条件查询分页收寄信息列表
	*/
	public Page<Address> queryPage(AddressCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页收寄信息列表(使用范型)
	*/
	public List<Address> queryList(AddressCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 收寄信息 对象
	*/
	public Address findOne(AddressCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个收寄信息记录
	*/
	public Address findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询收寄信息记录个数
	*/
	public long queryCount(AddressCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 收寄信息
	*/
	@Transactional
	public int insertBatch(List<Address> list){
		return dao.insertBatch(list);
	}
}