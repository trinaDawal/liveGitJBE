package ex.collections;

import java.util.LinkedList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		Product1 bookProduct = new Product1(1, "limitless", 50.5f);
		List<Product> productsList = getList();
//		enhanced for loop
		for(Product product : productsList) {
			product.displayDetails();
		}
	}

	public static List<Product> getList() {
		List<Product> productsList = new LinkedList<Product>();
		Product limitless = new Product(1, "limitless", 50.5f);
		Product power = new Product(1, "pow of now", 50.5f);
		productsList.add(limitless);
		productsList.add(power);
		return productsList;
	}
}

class Product1 {
	public int productId;
	public String productName;
	public float price;
	public Product1(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

   public void displayDetails() {
	   System.out.println(productId + "  >  "+productName+"  >  "+price);
   }

}
