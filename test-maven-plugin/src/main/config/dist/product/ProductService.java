package org.alvin.test.product;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 产品--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class ProductService {

	 
	@Autowired
	private ProductDao dao; //注入产品数据访问层

	/**
	* @方法说明：  新增[产品]记录
	*/
	@Transactional
	public int save(Product product) {
		return dao.save(product);
	}

	/**
	* @方法说明：  删除产品记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新产品记录
	*/
	@Transactional
	public int update(Product product) {
		return dao.update(product); 
	}

	 /**
    * @方法说明：更新产品记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Product product) {
		return dao.updateNotNull(product); 
    }

	/**
	* @方法说明： 按条件查询分页产品列表
	*/
	public Page<Product> queryPage(ProductCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页产品列表(使用范型)
	*/
	public List<Product> queryList(ProductCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 产品 对象
	*/
	public Product findOne(ProductCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个产品记录
	*/
	public Product findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询产品记录个数
	*/
	public long queryCount(ProductCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 产品
	*/
	@Transactional
	public int insertBatch(List<Product> list){
		return dao.insertBatch(list);
	}
}