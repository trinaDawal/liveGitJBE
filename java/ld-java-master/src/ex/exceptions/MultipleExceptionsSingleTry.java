package ex.exceptions;

public class MultipleExceptionsSingleTry {
	public static void main(String[] args) {
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
		System.out.println(cookies[5]);
		try {
//			System.out.println(cookies[-1]);
			System.out.println(cookies[6]);
			Calculator2 casioCalculator = null;
			casioCalculator.add(5, 10);
		} 
		catch (NullPointerException nullPointerException) {
			System.out.println("Check if you have created and instance of Calculator using new keyword...");
//			casioCalculator = new Calculator2();
//			casioCalculator.add(5, 10);
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Check the index");
			String messageString = exception.getMessage();
			System.out.println("More Info : " + messageString);
		}
		System.out.println("complete");
	}
}

class Calculator2 {
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
}