package cn.luna.sky.core.base.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.luna.sky.core.base.pagination.Page;

public abstract class BaseDaoImpl<T> extends HibernateDaoSupport implements
		IBaseDao<T> {
	private Class<T> clazz;
	private SessionFactory sf;
	@SuppressWarnings("deprecation")
	@Resource(name = "sessionFactory")
	public void setHibernateSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
		sf = sessionFactory;
	}

	/**
	 * 通过构造方法指定DAO的具体实现类
	 */
	@SuppressWarnings("unchecked")
	public BaseDaoImpl() {
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
		System.out.println("DAO的真实实现类是：" + this.clazz.getName());
	}

	public T get(Serializable id) {
		T t = this.getHibernateTemplate().get(this.clazz, id);
		return t;
	}

	public void insert(T entity) {
		this.getHibernateTemplate().saveOrUpdate(entity);
	}

	public void update(T entity) {
		// this.getSqlSession().update(ns + ".update", entity);
	}

	public void deleteById(Serializable id) {
		// this.getSqlSession().delete(ns + ".deleteById", id);
	}

	public void delete(Serializable[] ids) {
		// this.getSqlSession().delete(ns + ".delete", ids);
	}

	public List<T> findPage(Page<T> page) {
		// List<T> oList = this.getSqlSession().selectList(ns + ".findPage",
		// page);
		// return oList;
		return null;
	}

	public List<T> list() {
		List<T> list = this.getHibernateTemplate().loadAll(clazz);
		return list;
	}

	public List<T> list(Map<Object, Object> map) {
		// List<T> oList = this.getSqlSession().selectList(ns + ".find", map);
		// return oList;
		return null;
	}

}