package dem.inheritance;

public class App {
public static void main(String[] args) {
	Book book = new Book();
	book.displayBookDetails();
	
	Book swwBook = new Book("start with why?", "simon sinek", 50.50f);
	swwBook.displayBookDetails();
}
}
