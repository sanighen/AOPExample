package aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import exceptions.InvalidArgumentValueException;

@Aspect
public class ValidationAspect {
	
	@Before("call ( int pow(int,int) ) && args(base,exponent)")
	public void beforeMain(int base, int exponent) throws InvalidArgumentValueException {
		
		System.out.println("   VALIDATING \"pow(" + base + "," + exponent + ")\" ");
		
		if (exponent < 0) {
			throw new InvalidArgumentValueException("Validation failed");
		}
	}
	
}
