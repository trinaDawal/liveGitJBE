package ex.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {
		Calculator3 calculator3 = null;
		try {
		calculator3 = new Calculator3();
			calculator3.add(100, 200);
		} catch (NullPointerException nullPointerException) {
			System.out.println("Calculation error as there is no instance.");
		} finally {
			System.out.println("off");
		}
		System.out.println("continue .....");
	}
}

class Calculator3 {

	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

}