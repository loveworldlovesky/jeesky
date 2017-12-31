package cn.luna.sky.core.module.menu.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.luna.sky.core.base.dao.IBaseDao;
import cn.luna.sky.core.module.menu.entity.Menu;
import cn.luna.sky.core.module.menu.entity.MenuTreeGridVO;

public interface IMenuDao extends IBaseDao<Menu>{


	HibernateTemplate getHT();
	List<MenuTreeGridVO> listTreeGrid();

}
