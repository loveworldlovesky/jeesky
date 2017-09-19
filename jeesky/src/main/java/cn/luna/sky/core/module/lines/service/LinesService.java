package cn.luna.sky.core.module.lines.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate5.SessionFactoryUtils;

import cn.luna.sky.common.utils.UtilsUUID;
import cn.luna.sky.core.base.manager.BaseManagerImpl;
import cn.luna.sky.core.module.lines.dao.ILinesDao;
import cn.luna.sky.core.module.lines.dao.LinesDao;
import cn.luna.sky.core.module.lines.entity.TrainLines;
import cn.luna.sky.core.module.testhib5.dao.Person;
  
public class LinesService extends BaseManagerImpl<TrainLines>{
	
	//手动注入dao可以保证测试和生产环境都可以取到daobean

	public List<TrainLines> listByOrder(String trainStartStation,
			String trainEndStation) {
		ILinesDao dao = (ILinesDao) getBaseDao();
		List<TrainLines> list = dao.listByOrder(trainStartStation,trainEndStation);
		return list;
	}
	@SuppressWarnings("deprecation")
	public void testTrans() throws SQLException {
		LinesDao dao = (LinesDao) getBaseDao();
		//事物开关10000次
		HibernateTemplate ht = dao.getHT();
		SessionFactory sessionFactory = ht.getSessionFactory();
		Session session = sessionFactory.openSession();
//		Hibernate3.3.2版本中getSession().connection()已被弃用，
//		Connection conn = session.connection();
//		替代方法SessionFactoryUtils.getDataSource(getSessionFactory()).getConnection()
		Connection conn = SessionFactoryUtils.getDataSource(dao.getSessionFactory()).getConnection();
		boolean autoCommit = conn.getAutoCommit();
		System.out.println("autoCommit="+autoCommit);
		
		Transaction transaction = null;
		for(int i = 0;i<1;i++){
			try {
				transaction = session.beginTransaction();
				Connection connTest = SessionFactoryUtils.getDataSource(dao.getSessionFactory()).getConnection();
				boolean autoCommitTest = connTest.getAutoCommit();
				System.out.println("autoCommitTest="+autoCommitTest);
				TrainLines tl = new TrainLines();
				tl.setTrainNum("TL00"+i);
				tl.setId(UtilsUUID.getId());
				
				Person p = new Person();
				p.setId(1);
				p.setName("pp");
				
				session.save(p);
				
				session.save(tl);
				session.flush();
				
//				System.out.println(5/0);
				transaction.commit();
				
			} catch (Exception e) {
				if(transaction!=null){
					transaction.rollback();
					//log记录
				}
				e.printStackTrace();
			}
		}
		session.close();
	}
	
	
}
