package tablepersubclass;


import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) throws Exception {
		Configuration configuration = new Configuration();
		configuration.configure("/hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Employee employee = new Employee("Tom", 10000);
		Labour labour = new Labour("Jerry", 20000, 5000);
		Manager manager = new Manager("Ivan", 20000, 5000);
		session.save(employee);
		session.save(labour);
		session.save(manager);
		transaction.commit();
		session.close();
		sessionFactory.close();
		System.out.println("Employee, Labour & Manager saved into separate tables with foreign key relation!!");
	}

}
