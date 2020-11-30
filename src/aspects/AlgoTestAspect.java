package aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AlgoTestAspect {
	
//	private Object[] args;
//
//	@Before("execution ( int pow(int,int) ) ")
//	public void beforePow(JoinPoint jp) throws Exception {
//
//		args = jp.getArgs();
//
//		System.out.println("   capturing \"pow(" + args[0] + "," + args[1] + ")\" arguments");
//
//	}
//
//	@AfterReturning(pointcut="execution ( int pow(int,int) ) ", returning="result")
//	public void afterPow(JoinPoint jp, int result) throws Exception {
//		System.out.println("   capturing \"pow()\" returns = " + result);
//		Double correctResult = Math.pow( (int) args[0], (int) args[1]);
//		if( correctResult.intValue() != result ) {
//			System.out.println("   Testing Algo failed. Correct result is: " + correctResult);
//		}
//
//	}

}
