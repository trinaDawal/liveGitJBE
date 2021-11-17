package ex.exceptions;

public class NullPointerExceptionEx {
	public static void main(String[] args) {
		// create an object for the calculator
		Calculator casioCalculator = null;
//		new keyword creates the memory
		casioCalculator = new Calculator();
//		java.lang.NullPointerException: Cannot invoke ""
//		"dem.exceptions.Calculator.add(int, int)" because "casioCalculator" is null
//		casioCalculator.add(5, 10);
		try {
			casioCalculator.add(5, 10);
		} catch (NullPointerException nullPointerException) {
			System.out.println("Check if you have created and instance of Calculator using new keyword...");
			casioCalculator = new Calculator();
			casioCalculator.add(5, 10);
		}
		System.out.println("complete");
	}
}

class Calculator {
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
}