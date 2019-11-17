package org.alvin.test.quote;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 报价--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class QuoteService {

	 
	@Autowired
	private QuoteDao dao; //注入报价数据访问层

	/**
	* @方法说明：  新增[报价]记录
	*/
	@Transactional
	public int save(Quote quote) {
		return dao.save(quote);
	}

	/**
	* @方法说明：  删除报价记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新报价记录
	*/
	@Transactional
	public int update(Quote quote) {
		return dao.update(quote); 
	}

	 /**
    * @方法说明：更新报价记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Quote quote) {
		return dao.updateNotNull(quote); 
    }

	/**
	* @方法说明： 按条件查询分页报价列表
	*/
	public Page<Quote> queryPage(QuoteCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页报价列表(使用范型)
	*/
	public List<Quote> queryList(QuoteCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 报价 对象
	*/
	public Quote findOne(QuoteCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个报价记录
	*/
	public Quote findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询报价记录个数
	*/
	public long queryCount(QuoteCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 报价
	*/
	@Transactional
	public int insertBatch(List<Quote> list){
		return dao.insertBatch(list);
	}
}