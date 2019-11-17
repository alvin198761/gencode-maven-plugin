package org.alvin.test.menurule;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: admin_menu_rule--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class MenuRuleService {

	 
	@Autowired
	private MenuRuleDao dao; //注入admin_menu_rule数据访问层

	/**
	* @方法说明：  新增[admin_menu_rule]记录
	*/
	@Transactional
	public int save(MenuRule menuRule) {
		return dao.save(menuRule);
	}

	/**
	* @方法说明：  删除admin_menu_rule记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新admin_menu_rule记录
	*/
	@Transactional
	public int update(MenuRule menuRule) {
		return dao.update(menuRule); 
	}

	 /**
    * @方法说明：更新admin_menu_rule记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(MenuRule menuRule) {
		return dao.updateNotNull(menuRule); 
    }

	/**
	* @方法说明： 按条件查询分页admin_menu_rule列表
	*/
	public Page<MenuRule> queryPage(MenuRuleCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页admin_menu_rule列表(使用范型)
	*/
	public List<MenuRule> queryList(MenuRuleCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 admin_menu_rule 对象
	*/
	public MenuRule findOne(MenuRuleCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个admin_menu_rule记录
	*/
	public MenuRule findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询admin_menu_rule记录个数
	*/
	public long queryCount(MenuRuleCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 admin_menu_rule
	*/
	@Transactional
	public int insertBatch(List<MenuRule> list){
		return dao.insertBatch(list);
	}
}