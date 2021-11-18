package dem.inheritance.superdynamic;

public class AudioBook extends Book {
	float duration;
//  overriding is the process of redifining the base class method for providing specialized behaviour
// OVERRIDING METHOD
//	public void displayBookDetails() {
//		System.out.println(title);
//		System.out.println(author);
//		System.out.println(price);
//		System.out.println(duration);
//	}

//constructor
	AudioBook(String pTitle, String pAuthor, float pPrice, float pDuration) {
		super(pTitle, pAuthor, pPrice);
		duration = pDuration;
	}

	public void displayBookDetails() {
		super.displayBookDetails();
		System.out.println(duration);
	}

}
