package org.alvin.test.dept;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: admin_dept--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class DeptService {

	 
	@Autowired
	private DeptDao dao; //注入admin_dept数据访问层

	/**
	* @方法说明：  新增[admin_dept]记录
	*/
	@Transactional
	public int save(Dept dept) {
		return dao.save(dept);
	}

	/**
	* @方法说明：  删除admin_dept记录(多条)
	*/
	@Transactional
	public int delete(Integer ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新admin_dept记录
	*/
	@Transactional
	public int update(Dept dept) {
		return dao.update(dept); 
	}

	 /**
    * @方法说明：更新admin_dept记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Dept dept) {
		return dao.updateNotNull(dept); 
    }

	/**
	* @方法说明： 按条件查询分页admin_dept列表
	*/
	public Page<Dept> queryPage(DeptCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页admin_dept列表(使用范型)
	*/
	public List<Dept> queryList(DeptCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 admin_dept 对象
	*/
	public Dept findOne(DeptCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个admin_dept记录
	*/
	public Dept findById(Integer id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询admin_dept记录个数
	*/
	public long queryCount(DeptCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 admin_dept
	*/
	@Transactional
	public int insertBatch(List<Dept> list){
		return dao.insertBatch(list);
	}
}