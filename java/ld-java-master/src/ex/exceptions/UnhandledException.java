package ex.exceptions;

public class UnhandledException {
public static void main(String[] args) {
	System.out.println("Program begins");
	int num1 = 100;
	int num2 = 0;
//	ArithmeticException: / by zero
	int division = num1/num2;
	System.out.println(division);
	System.out.println("Program ends");
}
}
