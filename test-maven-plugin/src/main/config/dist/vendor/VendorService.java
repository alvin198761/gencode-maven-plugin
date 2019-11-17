package org.alvin.test.vendor;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 供应商--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class VendorService {

	 
	@Autowired
	private VendorDao dao; //注入供应商数据访问层

	/**
	* @方法说明：  新增[供应商]记录
	*/
	@Transactional
	public int save(Vendor vendor) {
		return dao.save(vendor);
	}

	/**
	* @方法说明：  删除供应商记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新供应商记录
	*/
	@Transactional
	public int update(Vendor vendor) {
		return dao.update(vendor); 
	}

	 /**
    * @方法说明：更新供应商记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Vendor vendor) {
		return dao.updateNotNull(vendor); 
    }

	/**
	* @方法说明： 按条件查询分页供应商列表
	*/
	public Page<Vendor> queryPage(VendorCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页供应商列表(使用范型)
	*/
	public List<Vendor> queryList(VendorCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 供应商 对象
	*/
	public Vendor findOne(VendorCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个供应商记录
	*/
	public Vendor findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询供应商记录个数
	*/
	public long queryCount(VendorCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 供应商
	*/
	@Transactional
	public int insertBatch(List<Vendor> list){
		return dao.insertBatch(list);
	}
}