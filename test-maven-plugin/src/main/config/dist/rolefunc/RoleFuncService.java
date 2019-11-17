package org.alvin.test.rolefunc;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: admin_role_func--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class RoleFuncService {

	 
	@Autowired
	private RoleFuncDao dao; //注入admin_role_func数据访问层

	/**
	* @方法说明：  新增[admin_role_func]记录
	*/
	@Transactional
	public int save(RoleFunc roleFunc) {
		return dao.save(roleFunc);
	}

	/**
	* @方法说明：  删除admin_role_func记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新admin_role_func记录
	*/
	@Transactional
	public int update(RoleFunc roleFunc) {
		return dao.update(roleFunc); 
	}

	 /**
    * @方法说明：更新admin_role_func记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(RoleFunc roleFunc) {
		return dao.updateNotNull(roleFunc); 
    }

	/**
	* @方法说明： 按条件查询分页admin_role_func列表
	*/
	public Page<RoleFunc> queryPage(RoleFuncCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页admin_role_func列表(使用范型)
	*/
	public List<RoleFunc> queryList(RoleFuncCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 admin_role_func 对象
	*/
	public RoleFunc findOne(RoleFuncCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个admin_role_func记录
	*/
	public RoleFunc findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询admin_role_func记录个数
	*/
	public long queryCount(RoleFuncCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 admin_role_func
	*/
	@Transactional
	public int insertBatch(List<RoleFunc> list){
		return dao.insertBatch(list);
	}
}