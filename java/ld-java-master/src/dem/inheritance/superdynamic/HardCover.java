package dem.inheritance.superdynamic;

public class HardCover extends Book{
	 int noOfPages;
	//  overriding is the process of redifining the base class method for providing specialized behaviour
	// OVERRIDING METHOD
		public void displayBookDetails() {
			System.out.println(title);
			System.out.println(author);
			System.out.println(price);
			System.out.println(noOfPages);
		}
	 
	//constructor
		HardCover(String pTitle,String pAuthor,  float pPrice, int pnoOfPages){
			title = pTitle;
			author= pAuthor;
			price = pPrice;
			noOfPages = pnoOfPages;
		}
}
