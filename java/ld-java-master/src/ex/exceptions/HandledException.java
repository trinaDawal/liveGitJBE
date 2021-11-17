package ex.exceptions;

public class HandledException {
public static void main(String[] args) {

	System.out.println("Program begins");
	int num1 = 100;
	int num2 = 50;
	int division = 0;
	try {	
//		ArithmeticException: / by zero
		 division = num1/num2;
	} catch (ArithmeticException exception) {
		System.out.println("Do not divide by zero....");
	}

	System.out.println(division);
	System.out.println("Program ends");
}
}
