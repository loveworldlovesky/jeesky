package cn.luna.sky.core.module.menu.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import cn.luna.sky.common.utils.UtilsString;
import cn.luna.sky.core.base.dao.BaseDaoImpl;
import cn.luna.sky.core.module.menu.entity.Menu;
import cn.luna.sky.core.module.menu.entity.MenuTreeGridVO;

public class MenuDao extends BaseDaoImpl<Menu> implements
		IMenuDao {

	public HibernateTemplate getHT(){
		HibernateTemplate ht = this.getHibernateTemplate();
		return ht;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<MenuTreeGridVO> listTreeGrid() {
		String hql = "select menuId,parentMenuId,menuName,menuUrl,openType,icon from Menu order by sortNum";
		
		HibernateTemplate ht = getHT();
		SessionFactory sessionFactory = ht.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		Query query = session.createQuery(hql); 
		List<Object[]> list = query.list();
		//整理成树列表
		Map<String,MenuTreeGridVO> map = new HashMap<String,MenuTreeGridVO>();
		for(int i = 0;i<list.size();i++){
			Object[] obj = list.get(i);
			String menuId = UtilsString.getStrValue(obj[0]);
			String parentMenuId = UtilsString.getStrValue(obj[1]);
			String menuName = UtilsString.getStrValue(obj[2]);
			String menuUrl = UtilsString.getStrValue(obj[3]);
			String openType = UtilsString.getStrValue(obj[4]);
			String icon = UtilsString.getStrValue(obj[5]);
			
			MenuTreeGridVO vo = new MenuTreeGridVO(menuId,parentMenuId,menuName,menuUrl,openType,icon);
			map.put(menuId, vo);
		}
		for(int i = 0;i<list.size();i++){
			Object[] obj = list.get(i);
			String menuId = UtilsString.getStrValue(obj[0]);
			String parentMenuId = UtilsString.getStrValue(obj[1]);
			String menuName = UtilsString.getStrValue(obj[2]);
			System.out.println("当前节点[menuId="+menuId+",parentMenuId="+parentMenuId+"menuName="+menuName);
			//找到父级
			if("ROOT".equals(parentMenuId)){//顶级节点的父节点默认设置为了ROOT
				continue;
			}else{
				MenuTreeGridVO vo = map.get(parentMenuId);
				vo.getChildren().add(map.get(menuId));
			}
		}
		List<MenuTreeGridVO> treeGridArray = new ArrayList<MenuTreeGridVO>();
		for(Map.Entry<String,MenuTreeGridVO> entry:map.entrySet()){
			MenuTreeGridVO vo = entry.getValue();
			if("ROOT".equals(vo.getParentMenuId())){
				treeGridArray.add(vo);
			}
		}
		return treeGridArray;
	}


}
