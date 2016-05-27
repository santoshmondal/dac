package projectspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	
	// context :: your spirng container
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	
	public static void main(String[] args) {
		
		HelloSpring bean1 = (HelloSpring) context.getBean("bean1");
		//bean1.setName("Hello CDAC!!");
		System.out.println(bean1.getName());
		
		
		HelloSpring bean11 = (HelloSpring) context.getBean("bean1");
		System.out.println(bean11.getName());
		
		
		HelloSpring bean2 = (HelloSpring)context.getBean("bean2");
		System.out.println(bean2.getName());
		
		
		HelloSpring bean3 = (HelloSpring)context.getBean("bean3");
		System.out.println(bean3.getName());
		
		
		
		HelloSpring bean4 = (HelloSpring)context.getBean("bean4");
		System.out.println(bean4.getCityList());
		
	}
	
	
	
	
	
	
	
	
}
