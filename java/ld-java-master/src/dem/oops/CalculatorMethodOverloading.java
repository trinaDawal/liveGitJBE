package dem.oops;
// IP multiplication with different datatypes.
public class CalculatorMethodOverloading {
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
	void add(int num1, int num2, int num3) {
		int result = num1 + num2 + num3;
		System.out.println(result);
	}
	
	void add(float num1, float num2) {
		float result = num1 + num2;
		System.out.println(result);
	}
	
	void add(float num1, float num2, float num3) {
		float result = num1 + num2 + num3;
		System.out.println(result);
	}
	
	// function signature float add(float num1, int num2)
//	float = return type
//	add = function method
//	num1 & num2 = arguments or parameters
	float add(float num1, int num2) {
		float result = num1 + num2;
//		System.out.println(result);
		return result;
	}
	void add(int num1, float num2) {
		float result = num1 + num2;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		CalculatorMethodOverloading simpleCalculator = new CalculatorMethodOverloading();
		float result = 0.0f;
		result = simpleCalculator.add(5.5f, 6);
		System.out.println("Result : " + result);
		
//		simpleCalculator.add(1.1f, 2.2f, 3.3f,4.45f);
	}
}
