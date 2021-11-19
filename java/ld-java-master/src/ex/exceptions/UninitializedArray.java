package ex.exceptions;

public class UninitializedArray {
	String cityArray[];

	public static void main(String[] args) {
		UninitializedArray uninitializedArray = new UninitializedArray();
		uninitializedArray.cityArray[0] = "oh my god, there is no memory";
	}
}
