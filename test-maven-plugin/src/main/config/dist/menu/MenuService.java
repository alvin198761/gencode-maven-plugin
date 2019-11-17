package org.alvin.test.menu;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: admin_menu--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class MenuService {

	 
	@Autowired
	private MenuDao dao; //注入admin_menu数据访问层

	/**
	* @方法说明：  新增[admin_menu]记录
	*/
	@Transactional
	public int save(Menu menu) {
		return dao.save(menu);
	}

	/**
	* @方法说明：  删除admin_menu记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新admin_menu记录
	*/
	@Transactional
	public int update(Menu menu) {
		return dao.update(menu); 
	}

	 /**
    * @方法说明：更新admin_menu记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Menu menu) {
		return dao.updateNotNull(menu); 
    }

	/**
	* @方法说明： 按条件查询分页admin_menu列表
	*/
	public Page<Menu> queryPage(MenuCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页admin_menu列表(使用范型)
	*/
	public List<Menu> queryList(MenuCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 admin_menu 对象
	*/
	public Menu findOne(MenuCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个admin_menu记录
	*/
	public Menu findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询admin_menu记录个数
	*/
	public long queryCount(MenuCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 admin_menu
	*/
	@Transactional
	public int insertBatch(List<Menu> list){
		return dao.insertBatch(list);
	}
}