package dem.oops;

public class Calculator {
	void add2Ints(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	void add3Ints(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println(result);
	}
	
	void add2Floats(float num1, float num2) {
		float result = num1 + num2;
		System.out.println(result);
	}
	
	void add3Floats(float num1, float num2, float num3) {
		float result = num1 + num2 + num3;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Calculator simpleCalculator = new Calculator();
		simpleCalculator.add2Ints(1, 2);
		simpleCalculator.add3Ints(1, 2,3);
//		Calculator is not applicable for the arguments (double, double)
//		simpleCalculator.add2Floats(1.0, 2.0);
		simpleCalculator.add2Floats(1.0f, 2.0f);
		simpleCalculator.add3Floats(1.0f, 2.0f,3.3f);
	}
}
