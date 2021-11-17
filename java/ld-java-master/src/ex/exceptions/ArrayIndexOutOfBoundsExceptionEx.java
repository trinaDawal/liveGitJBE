package ex.exceptions;

public class ArrayIndexOutOfBoundsExceptionEx {
	public static void main(String[] args) {
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
		System.out.println(cookies[5]);
		try {
			System.out.println(cookies[-1]);
			// the lines here will not execute
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println("Check the index");
			String messageString = exception.getMessage();
			System.out.println("More Info : " + messageString);
		}
//	program continues the normal flow
		System.out.println(cookies[6]);
	}
}

