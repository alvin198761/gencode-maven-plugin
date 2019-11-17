package org.alvin.test.category;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 税收分类--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class CategoryService {

	 
	@Autowired
	private CategoryDao dao; //注入税收分类数据访问层

	/**
	* @方法说明：  新增[税收分类]记录
	*/
	@Transactional
	public int save(Category category) {
		return dao.save(category);
	}

	/**
	* @方法说明：  删除税收分类记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新税收分类记录
	*/
	@Transactional
	public int update(Category category) {
		return dao.update(category); 
	}

	 /**
    * @方法说明：更新税收分类记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Category category) {
		return dao.updateNotNull(category); 
    }

	/**
	* @方法说明： 按条件查询分页税收分类列表
	*/
	public Page<Category> queryPage(CategoryCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页税收分类列表(使用范型)
	*/
	public List<Category> queryList(CategoryCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 税收分类 对象
	*/
	public Category findOne(CategoryCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个税收分类记录
	*/
	public Category findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询税收分类记录个数
	*/
	public long queryCount(CategoryCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 税收分类
	*/
	@Transactional
	public int insertBatch(List<Category> list){
		return dao.insertBatch(list);
	}
}