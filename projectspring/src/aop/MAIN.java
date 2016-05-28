package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("aopbeans.xml");
	
	public static void main(String[] args) {
		Cdac cdac = (Cdac)context.getBean("cdacStaff");
		
		cdac.helloActivity2();
	}
}
