package ex.basics;

import java.io.IOException;

public class IfElse {
	public static void main(String[] args) throws InterruptedException, IOException {
//	boolean rainy = true;
		boolean rainy = false;
//	if(rainy == true) {
		if (rainy) {
			System.out.println("carry an umbrella");
		} else {
			System.out.println("leave umbrella at home");
		}
		 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		String colorString = "red";

	}
}
