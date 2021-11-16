package ex.oops;

import java.util.Scanner;

class BlueToothSpeaker {
	String model;
	float price;

	void acceptDetails() {
//		create the scanner
//		pass System.in to the Scanner constructor
		Scanner keyBoardScanner = new Scanner(System.in);
		System.out.println("Enter Model :");
//		reads a line from the keyboard and returns it.
		String speakerModel = keyBoardScanner.nextLine();
		model = speakerModel;
		// Price is also read by default as a string "500"
		System.out.println("Enter Price :");
//		"500.50"
		String speakerPriceString = keyBoardScanner.nextLine();
//		// convert to float
//		// "500.50" > 500.50
		float speakerPriceFloat = Float.parseFloat(speakerPriceString);
		
//		float speakerPriceFloat = keyBoardScanner.nextFloat();
		price = speakerPriceFloat;
	}
	void printDetails() {
//	void apple() {
		System.out.println("Model : " + model);
		System.out.println("Price : " + price);
	}
}

public class ScannerEx2 {
	public static void main(String[] args) {
		BlueToothSpeaker boseBlueToothSpeaker = new BlueToothSpeaker();
		boseBlueToothSpeaker.acceptDetails();
		boseBlueToothSpeaker.printDetails();
//		boseBlueToothSpeaker.apple();
		BlueToothSpeaker sonyBlueToothSpeaker = new BlueToothSpeaker();
		sonyBlueToothSpeaker.acceptDetails();
		sonyBlueToothSpeaker.printDetails();
	}

}
