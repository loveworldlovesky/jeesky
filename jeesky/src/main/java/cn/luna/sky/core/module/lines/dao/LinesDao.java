package cn.luna.sky.core.module.lines.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.luna.sky.core.base.dao.BaseDaoImpl;
import cn.luna.sky.core.module.lines.entity.TrainLines;

public class LinesDao extends BaseDaoImpl<TrainLines> implements
		ILinesDao {

	public HibernateTemplate getHT(){
		HibernateTemplate ht = this.getHibernateTemplate();
		return ht;
	}
	@Override
	public List<TrainLines> listByOrder(String trainStartStation,
			String trainEndStation) {
		HibernateTemplate ht = this.getHibernateTemplate();
		
		DetachedCriteria criteria=DetachedCriteria.forClass(TrainLines.class);
		if(trainStartStation!=null && trainStartStation.trim().length() > 0){
			criteria.add(Restrictions.eq("trainStartStation", trainStartStation));
		}
		if(trainEndStation!=null && trainEndStation.trim().length() > 0){
			criteria.add(Restrictions.eq("trainEndStation", trainEndStation));
		}
		criteria.addOrder(Order.asc("trainNum"));
		
//		List<TrainLines> list = ht.findByCriteria(criteria);
		
		return null;
	}



}
