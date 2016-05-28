package aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class FirstAspect {
	
	public void beforeAdvice() {
		System.out.println("Before Advice");
	}
	
	
	public void afterAdvice() {
		System.out.println("After Advice");
	}
	
	public void aroundAdvice(ProceedingJoinPoint joinpoint) {
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
