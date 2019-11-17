package org.alvin.test.func;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 菜单--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class FuncService {

	 
	@Autowired
	private FuncDao dao; //注入菜单数据访问层

	/**
	* @方法说明：  新增[菜单]记录
	*/
	@Transactional
	public int save(Func func) {
		return dao.save(func);
	}

	/**
	* @方法说明：  删除菜单记录(多条)
	*/
	@Transactional
	public int delete(Integer ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新菜单记录
	*/
	@Transactional
	public int update(Func func) {
		return dao.update(func); 
	}

	 /**
    * @方法说明：更新菜单记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Func func) {
		return dao.updateNotNull(func); 
    }

	/**
	* @方法说明： 按条件查询分页菜单列表
	*/
	public Page<Func> queryPage(FuncCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页菜单列表(使用范型)
	*/
	public List<Func> queryList(FuncCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 菜单 对象
	*/
	public Func findOne(FuncCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个菜单记录
	*/
	public Func findById(Integer id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询菜单记录个数
	*/
	public long queryCount(FuncCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 菜单
	*/
	@Transactional
	public int insertBatch(List<Func> list){
		return dao.insertBatch(list);
	}
}