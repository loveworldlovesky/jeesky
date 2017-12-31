package cn.luna.sky.core.module.menu.service;

import java.util.List;

import cn.luna.sky.core.base.manager.BaseManagerImpl;
import cn.luna.sky.core.module.menu.dao.IMenuDao;
import cn.luna.sky.core.module.menu.entity.Menu;
import cn.luna.sky.core.module.menu.entity.MenuTreeGridVO;
  
public class MenuService extends BaseManagerImpl<Menu>{

	public List<Menu> list() {
		IMenuDao dao = (IMenuDao) getBaseDao();
		List<Menu> list = dao.list();
		return list;
	}
	public List<MenuTreeGridVO> listTreeGrid() {
		IMenuDao dao = (IMenuDao) getBaseDao();
		List<MenuTreeGridVO> list = dao.listTreeGrid();
		return list;
	}
	
	
	
}
