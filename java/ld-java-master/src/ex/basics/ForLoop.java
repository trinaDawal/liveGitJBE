package ex.basics;
// IP ACCEPT 1 TO 7 AND PRINT THE DAY OF WEEK. 1= SUNDAY, 2=MONDAY.... NOT A VALID DAY.
import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		for (int counter = 1; counter < 11; counter++) {
			System.out.print(counter + "\t");
		}
		System.out.println();
		for (int counter = 10; counter > 0; counter = counter - 1) {
			System.out.print(counter + "\t");
		}
		System.out.println();		
		for(int i = 1; i<11; i++) {
			if(i%2==0) {
				continue;
			}else {
				System.out.println(i+" ");
			}
		}
		
		System.out.println();		
		for(int i = 1; ;i++) {
			if(i%2==0) {
				continue;
			}else {
				System.out.println(i+" ");
			}
			if(i ==9) {
				break;
			}
		}
		
		String choice = null;
		do {
			System.out.println("eat a cookie");
			choice = new Scanner(System.in).nextLine();
		} while(choice.equals("y"));

		System.out.println("exiting program");
	}

}
