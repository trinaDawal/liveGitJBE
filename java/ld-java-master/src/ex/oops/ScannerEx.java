package ex.oops;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
//	create the scanner
//	pass System.in to the Scanner constructor
		Scanner keyBoardScanner = new Scanner(System.in);
		System.out.println("Enter your message :");
//	reads a line from the keyboard and returns it.
		String messageString = keyBoardScanner.nextLine();
		System.out.println(messageString);
	}
}
