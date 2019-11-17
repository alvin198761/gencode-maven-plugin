package org.alvin.test.sysuser;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: admin_sys_user--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class SysUserService {

	 
	@Autowired
	private SysUserDao dao; //注入admin_sys_user数据访问层

	/**
	* @方法说明：  新增[admin_sys_user]记录
	*/
	@Transactional
	public int save(SysUser sysUser) {
		return dao.save(sysUser);
	}

	/**
	* @方法说明：  删除admin_sys_user记录(多条)
	*/
	@Transactional
	public int delete(Integer ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新admin_sys_user记录
	*/
	@Transactional
	public int update(SysUser sysUser) {
		return dao.update(sysUser); 
	}

	 /**
    * @方法说明：更新admin_sys_user记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(SysUser sysUser) {
		return dao.updateNotNull(sysUser); 
    }

	/**
	* @方法说明： 按条件查询分页admin_sys_user列表
	*/
	public Page<SysUser> queryPage(SysUserCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页admin_sys_user列表(使用范型)
	*/
	public List<SysUser> queryList(SysUserCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 admin_sys_user 对象
	*/
	public SysUser findOne(SysUserCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个admin_sys_user记录
	*/
	public SysUser findById(Integer id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询admin_sys_user记录个数
	*/
	public long queryCount(SysUserCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 admin_sys_user
	*/
	@Transactional
	public int insertBatch(List<SysUser> list){
		return dao.insertBatch(list);
	}
}