package dem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dem.entity.Product;
import dem.repository.ProductRepository;


@RestController
@RequestMapping("/api")
public class ProductController {
//	SPRING FRAMEWORK CREATES THE INSTANCE OF REPOSITORY.
	@Autowired
	ProductRepository productRepository;

//	RETURNS HTML
	@GetMapping("/welcome")
	protected String welcome()  {
		System.out.println("TO THE WORLD OF SPRING BOOT AND REST API");
		return "<html><head><title>Welcome Servlet</title></head><body><h1>Welcome to the world of springboot............</h1></body></html>";
//		return "WELCOME TO THE WORLD OF SPRING BOOT AND REST API";
	}

	@GetMapping("/productsAsHTML")
	protected String getAllProductsAsHTML()  {
		List<Product> productsList = productRepository.findAll();
		String productsHTML = "<html><head><title>Display Product Details !!!</title>"
				+ "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n" + 
				"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n" + 
				"    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n" + 
				"    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script></head><body><h1>Products List</h1>";
		productsHTML +=	"<table class=\"table table-dark table-striped\" style = \"width:500px\"><tr><th>Product ID</th><th>Name</th><th>Product Price</th></tr>";
		for(Product product : productsList) {
			productsHTML +=	 "<tr><td>"+product.getProductId()+ "</td><td>" + product.getProductName() + "</td><td>" + product.getPrice() + "</td></tr>";
		}
		productsHTML +=	 "</table></body></html>";
		return productsHTML;
	}
// GET ALL THE PRODUCTS
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> productsList = productRepository.findAll();
		return productsList;
	}
//  CREATE A NEW PRODUCT
	@PostMapping("/products")
	public Product createProduct(@RequestBody Product productFromBrowser) {
		System.out.println("Inserting : " + productFromBrowser);
		Product savedProduct = productRepository.save(productFromBrowser);
		return savedProduct;
	}
//  UPDATE EXISTING PRODUCT
	@PutMapping("/products/{id}")
	public Product updateProduct(@PathVariable(value = "id") Long productId, @RequestBody Product productFromBrowser) {
		System.out.println("Updating : " + productFromBrowser);
//		fetch the product from the database with the id
		Product existingProduct = productRepository.findById(productId).get();
//		update the existing product with the details from the browser
		existingProduct.setProductName(productFromBrowser.getProductName());
		existingProduct.setPrice(productFromBrowser.getPrice());
//		save the updated details
		Product updatedProduct = productRepository.save(existingProduct);
		return updatedProduct;
	}
	
//	DELETE AN EXISTING PRODUCT
	@DeleteMapping("/products/{productIdfromBrowser}")
	public void deleteProduct(@PathVariable(value="productIdfromBrowser")Long productId) {
		System.out.println("Deleting : " + productId);
		productRepository.deleteById(productId);
	}
}
