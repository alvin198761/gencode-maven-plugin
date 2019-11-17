package org.alvin.test.roledept;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: admin_role_dept--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class RoleDeptService {

	 
	@Autowired
	private RoleDeptDao dao; //注入admin_role_dept数据访问层

	/**
	* @方法说明：  新增[admin_role_dept]记录
	*/
	@Transactional
	public int save(RoleDept roleDept) {
		return dao.save(roleDept);
	}

	/**
	* @方法说明：  删除admin_role_dept记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新admin_role_dept记录
	*/
	@Transactional
	public int update(RoleDept roleDept) {
		return dao.update(roleDept); 
	}

	 /**
    * @方法说明：更新admin_role_dept记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(RoleDept roleDept) {
		return dao.updateNotNull(roleDept); 
    }

	/**
	* @方法说明： 按条件查询分页admin_role_dept列表
	*/
	public Page<RoleDept> queryPage(RoleDeptCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页admin_role_dept列表(使用范型)
	*/
	public List<RoleDept> queryList(RoleDeptCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 admin_role_dept 对象
	*/
	public RoleDept findOne(RoleDeptCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个admin_role_dept记录
	*/
	public RoleDept findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询admin_role_dept记录个数
	*/
	public long queryCount(RoleDeptCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 admin_role_dept
	*/
	@Transactional
	public int insertBatch(List<RoleDept> list){
		return dao.insertBatch(list);
	}
}