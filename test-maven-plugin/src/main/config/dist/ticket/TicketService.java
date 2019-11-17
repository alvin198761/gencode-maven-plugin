package org.alvin.test.ticket;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 进销项发票录入--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class TicketService {

	 
	@Autowired
	private TicketDao dao; //注入进销项发票录入数据访问层

	/**
	* @方法说明：  新增[进销项发票录入]记录
	*/
	@Transactional
	public int save(Ticket ticket) {
		return dao.save(ticket);
	}

	/**
	* @方法说明：  删除进销项发票录入记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新进销项发票录入记录
	*/
	@Transactional
	public int update(Ticket ticket) {
		return dao.update(ticket); 
	}

	 /**
    * @方法说明：更新进销项发票录入记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Ticket ticket) {
		return dao.updateNotNull(ticket); 
    }

	/**
	* @方法说明： 按条件查询分页进销项发票录入列表
	*/
	public Page<Ticket> queryPage(TicketCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页进销项发票录入列表(使用范型)
	*/
	public List<Ticket> queryList(TicketCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 进销项发票录入 对象
	*/
	public Ticket findOne(TicketCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个进销项发票录入记录
	*/
	public Ticket findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询进销项发票录入记录个数
	*/
	public long queryCount(TicketCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 进销项发票录入
	*/
	@Transactional
	public int insertBatch(List<Ticket> list){
		return dao.insertBatch(list);
	}
}