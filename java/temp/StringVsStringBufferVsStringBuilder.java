public class StringVsStringBufferVsStringBuilder {
	public static void main(String[] args) {
		testString();
		testStringBuffer();
		testStringBuilder();
	}

	private static void testString() {
//		STRING IS IMMUTABLE
//		STRING -  immutable sequence of characters
		int testNumber = 150000;
		String testString = "";

//	int testNumber = 77777777;
//	start time
		long start = System.currentTimeMillis();
		for (int ctr = 0; ctr < testNumber; ctr++) {
			testString = testString + ctr + " ";
		}
		long end = System.currentTimeMillis();	
		System.out.println("String : " + (end-start));
//		System.out.println(testString);
	}
	private static void testStringBuffer() {
//		StringBuffer -  immutable sequence of characters
		int testNumber = 150000;
		StringBuffer stringBuffer = new StringBuffer();

//	int testNumber = 77777777;
//	start time
		long start = System.currentTimeMillis();
		for (int ctr = 0; ctr < testNumber; ctr++) {
			stringBuffer.append(ctr + " ");
		}
		long end = System.currentTimeMillis();	
		System.out.println("String Buffer : " + (end-start));
//		System.out.println(stringBuffer);
	}
	private static void testStringBuilder() {
//		StringBuffer -  immutable sequence of characters
		int testNumber = 150000;
		StringBuilder stringBuilder  = new StringBuilder();

//	int testNumber = 77777777;
//	start time
		long start = System.currentTimeMillis();
		for (int ctr = 0; ctr < testNumber; ctr++) {
			stringBuilder.append(ctr + " ");
		}
		long end = System.currentTimeMillis();	
		System.out.println("String Buffer : " + (end-start));
//		System.out.println(stringBuffer);
	}
}
