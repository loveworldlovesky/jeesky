package cn.luna.sky.core.base.manager;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import cn.luna.sky.core.base.dao.IBaseDao;
import cn.luna.sky.core.base.pagination.Page;

public abstract class BaseManagerImpl<T> implements IBaseManager<T>{
	
	private IBaseDao<T> baseDao;
	
	public void setBaseDao(IBaseDao<T> baseDao){
		System.out.println("BaseManagerImpl..setBaseDao======="+baseDao);
		this.baseDao = baseDao;
	}
	public IBaseDao<T> getBaseDao(){
		return this.baseDao;
	}
	@Override
	public T get(Serializable id) {
		T t =  baseDao.get(id);
		return t;
	}

	@Override
	public void insert(T t) {
		baseDao.insert(t);
	}

	@Override
	public void update(Object t) {
		
	}

	@Override
	public void deleteById(Serializable id) {
		
	}

	@Override
	public void delete(Serializable[] ids) {
		
	}
	@Override
	public List<T> findPage(Page<T> page) {
		return null;
	}

	@Override
	public List<T> list() {
		List<T> list = baseDao.list();
		return list;
	}
	@Override
	public List<T> list(Map<Object,Object> paraMap) {
		return null;
	}

}
