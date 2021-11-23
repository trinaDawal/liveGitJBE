package ex.collections;

import java.util.ArrayList;

public class ProductsArrayList {
	public static void main(String[] args) {
		Product bookProduct = new Product(1, "limitless", 50.5f);
		ArrayList<Product> productsArrayList = getProductsArrayList();
//		enhanced for loop
		for(Product product : productsArrayList) {
			product.displayDetails();
		}
	}

	public static ArrayList<Product> getProductsArrayList() {
		ArrayList<Product> productsArrayList = new ArrayList<Product>();
		Product limitless = new Product(1, "limitless", 50.5f);
		Product power = new Product(1, "pow of now", 50.5f);
		productsArrayList.add(limitless);
		productsArrayList.add(power);
		return productsArrayList;
	}
}

class Product {
	public int productId;
	public String productName;
	public float price;
	public Product(int productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

   public void displayDetails() {
	   System.out.println(productId + "  >  "+productName+"  >  "+price);
   }

}
