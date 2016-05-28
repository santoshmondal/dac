package aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class FirstAspect {
	
	public void beforeAdvice(String param1, String param2) {
		System.out.println("Before Advice :: " + param1  );
	}
	
	
	public void afterAdvice(String param1,  String param2) {
		System.out.println("After Advice ::  " + param1);
	}
	
	public void aroundAdvice(ProceedingJoinPoint joinpoint, String param1,String param2) {
		System.out.println("Around -  This is before exeuction");
		
		try {
			joinpoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Around - This is after exeuction");
	}

}
