package math;

public class Calculator {

	public static int pow(int base, int exponent) {
		int result = 1;
		while (exponent-- > 0) {
			result *= base;
		}
		return result;
	}

}
