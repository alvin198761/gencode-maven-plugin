package org.alvin.test.dict;
import java.util.List;
import org.alvin.code.gen.utils.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* @类说明: 类型字典--数据逻辑层
* @author: alvin198761@163.com
* @date : 2019-11-17 21:00:17
**/
@Slf4j
@Service
public class DictService {

	 
	@Autowired
	private DictDao dao; //注入类型字典数据访问层

	/**
	* @方法说明：  新增[类型字典]记录
	*/
	@Transactional
	public int save(Dict dict) {
		return dao.save(dict);
	}

	/**
	* @方法说明：  删除类型字典记录(多条)
	*/
	@Transactional
	public int delete(Long ids[]) {
		//return dao.deleteLogic(ids);//逻辑删除
		return dao.delete(ids);//物理删除
	}

	/**
	* @方法说明：  更新类型字典记录
	*/
	@Transactional
	public int update(Dict dict) {
		return dao.update(dict); 
	}

	 /**
    * @方法说明：更新类型字典记录,不为空的都更新掉
    */
    @Transactional
    public int updateNotNull(Dict dict) {
		return dao.updateNotNull(dict); 
    }

	/**
	* @方法说明： 按条件查询分页类型字典列表
	*/
	public Page<Dict> queryPage(DictCond cond) {
		com.github.pagehelper.Page page = PageHelper.startPage(cond.getPage(), cond.getSize(), true);
		dao.queryList(cond);
		return new Page(page.getPageNum() ,page.getPageSize() ,page.getTotal() ,page.getResult());
	}

	/**
	* @方法说明： 按条件查询不分页类型字典列表(使用范型)
	*/
	public List<Dict> queryList(DictCond cond) {
		return dao.queryList(cond);
	}
	
	/**
	* @方法说明： 按条件查询一个 类型字典 对象
	*/
	public Dict findOne(DictCond cond) {
		return dao.findOne(cond);
	}

	/**
	* @方法说明： 按ID查找单个类型字典记录
	*/
	public Dict findById(Long id) {
		return dao.findById(id);
	}

	/**
	* @方法说明： 按条件查询类型字典记录个数
	*/
	public long queryCount(DictCond cond) {
		return dao.queryCount(cond);
	}
	
	/**
	* @方法说明： 批量添加 类型字典
	*/
	@Transactional
	public int insertBatch(List<Dict> list){
		return dao.insertBatch(list);
	}
}