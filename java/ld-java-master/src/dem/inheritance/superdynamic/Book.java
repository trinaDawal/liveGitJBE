package dem.inheritance.superdynamic;

public class Book {
// properties 
// automatically assigned default values
	String title;
	String author;
	float price;
	
//	default counstructor
	Book(){
		title = "Limitless";
		author="Jim Kwik";
		price = 2995.50f;
	}
	
// overloaded constructor
	Book(String pTitle,String pAuthor,  float pPrice){
		title = pTitle;
		author = pAuthor;
		price = pPrice;
	}	
//	OVERRIDDEN METHOD
	public void displayBookDetails() {
		System.out.println("DISPLAYING THE BOOK DETAILS");
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
}
