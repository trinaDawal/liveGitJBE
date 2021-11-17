package ex.exceptions;

//import java.lang.RuntimeException;
//import java.lang.*; [String, Integer]

public class UserDefinedException{

	public static void main(String[] args) {
		int employeeAge = 50;
		if(employeeAge <21 || employeeAge > 60) {
//			5/0. Java Runtime understood divide by zero, created an ArithmeticException and throws the Exception.
			try {
			//creating the exception
			AgeInvalidException employeeAgeInvalidException = new AgeInvalidException();
			// throw the exception
			throw employeeAgeInvalidException;
			}
			catch(AgeInvalidException employeeAgeInvalidException) {
				System.out.println("Employee age should be between 21 and 60");
			}
		}else {
			System.out.println("Congrats, you are permitted to work.");
		}
		System.out.println("program completed");
	}
}
//create an exception by extending the RuntimeException class
class AgeInvalidException extends RuntimeException{
// here after understanding inheritance.
}
