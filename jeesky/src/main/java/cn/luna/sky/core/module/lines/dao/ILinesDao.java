package cn.luna.sky.core.module.lines.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import cn.luna.sky.core.base.dao.IBaseDao;
import cn.luna.sky.core.module.lines.entity.TrainLines;

public interface ILinesDao extends IBaseDao<TrainLines>{

	List<TrainLines> listByOrder(String trainStartStation,
			String trainEndStation);

	HibernateTemplate getHT();

}
