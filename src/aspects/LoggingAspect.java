package aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("execution ( void main(..) )")
	public void beforeMain() {
		System.out.println("APPLICATION STARTING\n");
	}
	
	@After("execution ( void main(..) )")
	public void afterMain() {
		System.out.println("\nAPPLICATION STOPPING");
	}

}
