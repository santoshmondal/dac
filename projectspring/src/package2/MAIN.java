package package2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MAIN {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
	
	public static void main(String[] args) {
		
		Car car = (Car)context.getBean("car");
		System.out.println(car);
		
		
		Car car1 = (Car)context.getBean("car1");
		System.out.println(car1);
		
		
		Car car2 = (Car)context.getBean("car2");
		System.out.println(car2);
		
		
		Car car3 = (Car)context.getBean("car3");
		System.out.println(car3);
		
		
		HelloCdac ref = (HelloCdac)context.getBean("hello");
		System.out.println(ref);
	}
}
