package dem.collections;

import java.util.ArrayList;

public class AppCart {

	public static void main(String[] args) {
//	create the cart
		ArrayList booksCart = new ArrayList();
// 	add elements to the cart
		booksCart.add("Limitless");
		booksCart.add("Start With Why: How Great Leaders Inspire Everyone To Take Action");
		booksCart.add("Thinking, Fast and Slow ");
		booksCart.add("Man's Search For Meaning: The classic tribute to hope from the Holocaust");
		booksCart.add("Harry Potter and the Chamber of Secrets");
// display cart
		System.out.println(booksCart);
		int booksCartSize = booksCart.size();
//	for(int itemCount=0; itemCount < booksCartSize ;itemCount = itemCount+1) {
//		String bookString = (String)booksCart.get(itemCount);
//		System.out.println(bookString);
//	}
		for (int itemCount = booksCartSize - 1; itemCount >= 0; itemCount = itemCount - 1) {
			String bookString = (String) booksCart.get(itemCount);
			System.out.println(bookString);
		}
//		update the element
//		System.out.println("Enter Replacement Book");
//		Scanner scanner = new Scanner(System.in);
//		String bookString = scanner.nextLine();
//		booksCart.set(4,bookString);
		booksCart.set(4, "Deep Work: Rules for Focused Success in a Distracted World");
		booksCart.add("Deep Work: Rules for Focused Success in a Distracted World");
		System.out.println("\n" + booksCart);
		
//		remove a book
		System.out.println("\n DELETED 2ND COPY");
		booksCart.remove(4);
		//old style
		for (int itemCount = booksCartSize - 1; itemCount >= 0; itemCount = itemCount - 1) {
			String bookString = (String) booksCart.get(itemCount);
			System.out.println(bookString);
		}

	}
}
