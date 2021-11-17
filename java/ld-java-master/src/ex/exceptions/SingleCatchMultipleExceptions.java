package ex.exceptions;

public class SingleCatchMultipleExceptions {
	public static void main(String[] args) {
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
		System.out.println(cookies[5]);
		try {
			System.out.println(cookies[-1]);
			System.out.println(cookies[6]);
			Calculator20 casioCalculator = null;
			casioCalculator.add(5, 10);
		} 
		catch (NullPointerException | ArrayIndexOutOfBoundsException exception ) {
			System.out.println("Check for NullPointer or ArrayIndex issues...");
			String messageString = exception.getMessage();
			System.out.println(messageString);
//			casioCalculator = new Calculator20();
//			casioCalculator.add(5, 10);
		}
		
		System.out.println("complete");
	}
}

class Calculator20 {
	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}
}