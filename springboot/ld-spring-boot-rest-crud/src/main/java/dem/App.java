package dem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
	public static void main(String[] args) {
//		System.out.println("JAVA APP");
		System.out.println("SPRING BOOT APPLICATION (WEB APP)");
		SpringApplication.run(App.class, args);
//		Product bookProduct = new Product(1,"power of now", 50.0f);
//		System.out.println(bookProduct.productId);
//		int productId = bookProduct.getProductId();
//		bookProduct.productId = 100;
//		bookProduct.productName = "WingsOfFire";
//		bookProduct.setProductName("Wings of Fire");
		
	}
}
