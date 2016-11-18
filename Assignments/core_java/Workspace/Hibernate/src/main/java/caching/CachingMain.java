package caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CachingMain{

	public static void main(String[] args)  throws Exception
	{
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionfactory = configuration.buildSessionFactory();
		Session session = sessionfactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Product product = new Product("Mobile", 100);
		session.persist(product);
		
		Product pr1= session.get(Product.class, product.getP_id());
		Product pr2=session.get(Product.class, product.getP_id());
		
		transaction.commit();
		session.close();
		
		Session s= sessionfactory.openSession();
		s.get(Product.class, product.getP_id());
		s.close();
		
		sessionfactory.close();
	}

}
