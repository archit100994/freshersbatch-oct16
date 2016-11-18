package com.Hibernate.Hibernate;

import java.util.List;
import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeHibernate {

	public static void main(String[] args) 
	{
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("select sum(sal) from Employee");
		//Query query = session.createQuery("sumAllSalaries");
		List list= query.list();
		//for(Map e: list)
		//{
			System.out.println(list);
		//}
		session.close();
		
	
		Session se1 = sessionFactory.openSession();
		Query qu1 = se1.createQuery("FROM Employee E ORDER BY E.sal");
//		Query qu1 = se1.createQuery("orderBySalary");
		list= qu1.list();
		for(Object e: list)
		{
			System.out.println(e);
		}
		se1.close();
		
		Session se2= sessionFactory.openSession();
		Query qu2= se2.createQuery("select name from Employee as e GROUP BY e.city");
		//Query qu2= se2.createQuery("groupByCity");
		list= qu2.list();
		for(Object e: list)
		{
			System.out.println(e);
		}
		se2.close();
		
		Session se3= sessionFactory.openSession();
		Query qu3= se3.createQuery("select avg(sal) from Employee");
		//Query qu3= se3.createQuery("avgSalaryAll");
		list= qu3.list();
		for(Object e: list)
		{
			System.out.println(e);
		}
		se3.close();
		
		Session se4= sessionFactory.openSession();
		Query qu4= se4.createQuery("from Employee E where E.sal>20000");
		//Query qu4= se4.createQuery("allSalarygreaterthan20000");
		list= qu4.list();
		for(Object e: list)
		{
			System.out.println(e);
		}
		se4.close();

		sessionFactory.close();
	}

}
