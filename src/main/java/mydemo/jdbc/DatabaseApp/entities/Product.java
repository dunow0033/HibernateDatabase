package mydemo.jdbc.DatabaseApp.entities;
import jakarta.persistence.*;

@Entity
@Table(name="ProductData")
public class Product {
	@Id
	@Column(name="Productid")
	private int productid;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Column(name="productname")
	private String productname;
	@Column(name="ProductPrice")
	private double price;
	@Column(name="Quantity")
	private int quantity;
}
