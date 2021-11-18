package dem.inheritance.superdynamic;
public class App {
	public static void main(String[] args) {

		AudioBook swwBook = new AudioBook("start with why?", "simon sinek", 50.50f, 30);
		swwBook.displayBookDetails();
		
//		DYNAMIC POLYMORPHISM
		Book book = null;

//		Generate a random value
//		for(int i = 0; i< 6; i++) {
//		double dynamicValue = Math.random();
//		System.out.println(dynamicValue);
//		}
		
		double dynamicValue = Math.random();
// the reference is of Book and the instance is also the Book
//		book = new Book();
//		book.displayBookDetails();
//  the reference is a Book but the instance is an AudioBook.
		if(dynamicValue > 0.5) {
			book = new AudioBook("Harry Potter", "J.K.Rowling", 55.5f, 70f);
		}
		else {
			book = new HardCover("The Alchemist", "Paulo Coelho", 55.5f, 350);
		}
		
		book.displayBookDetails();
	}
}
