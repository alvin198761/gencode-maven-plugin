package org.alvin.test.outbound;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 出库记录--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class OutboundService {

	 
	@Autowired
	private OutboundDao dao; //注入出库记录数据访问层

	/**
	* @方法说明：  新增[出库记录]记录
	*/
	@Transactional
	public int save(Outbound outbound) {
		return dao.save(outbound);
	}

	/**
	* @方法说明：  删除出库记录记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新出库记录记录
	*/
	@Transactional
	public int update(Outbound outbound) {
		return dao.update(outbound); 
	}

	 /**
    * @方法说明：更新出库记录记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Outbound outbound) {
		return dao.updateNotNull(outbound); 
    }

	/**
	* @方法说明： 按条件查询分页出库记录列表
	*/
	public Page<Outbound> queryPage(OutboundCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页出库记录列表(使用范型)
	*/
	public List<Outbound> queryList(OutboundCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 出库记录 对象
	*/
	public Outbound findOne(OutboundCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个出库记录记录
	*/
	public Outbound findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询出库记录记录个数
	*/
	public long queryCount(OutboundCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 出库记录
	*/
	@Transactional
	public int insertBatch(List<Outbound> list){
		return dao.insertBatch(list);
	}
}