package ex.collections;
// IP : DISPLAY THE COOKIES IN REVERSE.
// ctrl + a to select all your code
// ctrl + shift + f to format the code 
// COMMENT TOGGLE (SELECT CODE CTRL+/ )
public class CookiesArray {
	public static void main(String[] args) {
//	[] specifies the dimension of an array;
		String cookies[] = { "violet", "indigo", "blue", "green", "yellow", "orange", "red" };
//	cookies[] declare the cookie array
//  String cookies[] - String is assigned as the datatype
//  initialization with 7 elements {"violet","indigo","blue","green","yellow","orange","red"}
// cookies[7] - size was derived automatically by the initialization

//		System.out.println("DISPLAYING ALL COOKIES");
//	ITERATE THROUGHT THE COOKIES
//		for (int cookieCount = 1; cookieCount <= cookies.length; cookieCount = cookieCount + 1) {
//			System.out.println("Enjoy the " + cookies[cookieCount - 1] + " cookie....");
//		}

System.out.println("SEARCHING FOR GREEN COOKIE");
		String searchCookie = "green";
		for (int cookieCount = 0; cookieCount < cookies.length; cookieCount = cookieCount + 1) {
			String cookie = cookies[cookieCount];
			if(cookie.equals(searchCookie)) {
				System.out.println(searchCookie + " cookie found");
				break;
			}
			if(cookieCount == cookies.length -1) {
				System.out.println("Cookie not found");
			}
		}
		System.out.println("PROGRAM COMPLETE!!!");
	}
}
