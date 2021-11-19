package ex.basics;

public class ParameterizedAndDefaultConstrutor {
	public static void main(String[] args) {
//		Test10 test10 = new Test10();
		Test10 test10 = new Test10("welcome");
		System.out.println(test10.testString);
	}
}

class Test10 {
//	the java default constructor initializes the String variable to null.
	String testString;

	// default constructor has same name of class and no parameters
//	Test10() {
//		testString = "Test String";
//		System.out.println(testString);
//	}
	Test10(String pTestString) {
		testString = pTestString;
		System.out.println(testString);
	}
}