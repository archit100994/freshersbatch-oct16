package spring.springAOP;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Usermain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractApplicationContext ioc = new ClassPathXmlApplicationContext("execTime.xml");
		User a = (User) ioc.getBean("User1");
		//a.add_in_list();
		//a.add_in_vector();
		System.out.println("1");
		a.register("ar", "archit", "archit", "India");
		System.out.println("2");
		ioc.registerShutdownHook();

	}

}
