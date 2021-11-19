//LEARNING : initialize all local variables before using.
package ex.basics;

public class NullEx {

}

class Test{
//	instance variable directly declared inside the class is initialized by default
	String cityString;
//	Test(){
//		cityString = null;
//	}
	void method() {
		// local variable are not initialized by default
		String countryString;
//		The local variable countryString may not have been initialized
//		System.err.println(countryString);
		System.out.println(cityString);
	}
}