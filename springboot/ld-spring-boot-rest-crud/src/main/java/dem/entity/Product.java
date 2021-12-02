package dem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// PROPERTIES : PRIVATE FIELDS WITH GETTERS AND SETTERS
// JAVA BEAN OR MODEL
// ENTITY BEAN OR ENTITY MODEL
@Entity
@Table(name="PRODUCTS")
public class Product {
	@Id
	@Column(name="PRODUCT_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long productId;
	@Column(name="PRODUCT_NAME")
	private String productName;
	@Column(name="PRICE")
	private float price;

	public Product() {
		super();
	}

	public Product(Long productId, String productName, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public float getPrice() {
		return price;
	}

	public Long getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
