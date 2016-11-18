package spring.springAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class userAspect {

	@Pointcut("execution(* User.register(..))")
		public void breaker()
		{
		}
	
	@Around("breaker()")
		public void kuchBhi(ProceedingJoinPoint pjp) throws Throwable
		{
		
			if(((String)pjp.getArgs()[0]).length()>3 && ((String)pjp.getArgs()[1]).length()>3) 
			{
				System.out.println("Register Successful");
				pjp.proceed();
			}
			else
			{
				System.out.println("register Unsuccessful");
			}
		}
	
	
}
