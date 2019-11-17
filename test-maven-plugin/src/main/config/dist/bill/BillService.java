package org.alvin.test.bill;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 开票信息--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class BillService {

	 
	@Autowired
	private BillDao dao; //注入开票信息数据访问层

	/**
	* @方法说明：  新增[开票信息]记录
	*/
	@Transactional
	public int save(Bill bill) {
		return dao.save(bill);
	}

	/**
	* @方法说明：  删除开票信息记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新开票信息记录
	*/
	@Transactional
	public int update(Bill bill) {
		return dao.update(bill); 
	}

	 /**
    * @方法说明：更新开票信息记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Bill bill) {
		return dao.updateNotNull(bill); 
    }

	/**
	* @方法说明： 按条件查询分页开票信息列表
	*/
	public Page<Bill> queryPage(BillCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页开票信息列表(使用范型)
	*/
	public List<Bill> queryList(BillCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 开票信息 对象
	*/
	public Bill findOne(BillCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个开票信息记录
	*/
	public Bill findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询开票信息记录个数
	*/
	public long queryCount(BillCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 开票信息
	*/
	@Transactional
	public int insertBatch(List<Bill> list){
		return dao.insertBatch(list);
	}
}