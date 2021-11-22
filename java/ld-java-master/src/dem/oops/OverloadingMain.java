package dem.oops;

public class OverloadingMain {
//	entry point for JVM
//public static void main(String[] args) {
//	System.out.println("welcome");
//}
//entry point for JVM
//static public  void main(String[] args) {
//System.out.println("welcome");
//}

//	static public void main(String args[]) {
//		System.out.println("welcome");
//	}

	static public void main(String philippines[]) {
		System.out.println("welcome");
		int numbers[] = {1,2};
		main(numbers);
	}
//	overloaded
	 public static void main(int philippines[]) {
		System.out.println("main with int array");
	}	
}
