package apoteka.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="products")
public class Products {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="productID")
	private int productID;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productDescription")
	private String productDescription;
	
	@Column(name="price")
	private float price;
	
	
	@Column(name="availability")
	private boolean availability;
	
	@Column(name="prescription")
	private boolean prescription;
	
	@Column(name="supplierID")
	private int supplierID;
	
	
	public Products() {
		
	}





	public int getProductID() {
		return productID;
	}





	public void setProductID(int productID) {
		this.productID = productID;
	}





	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public float getPrice() {
		return price;
	}


	public void setPrice(float price) {
		this.price = price;
	}

	




	public boolean getAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}


	public boolean getPrescription() {
		return prescription;
	}


	public void setPrescription(boolean prescription) {
		this.prescription = prescription;
	}


	public int getSupplierID() {
		return supplierID;
	}


	public void setSupplierID(int supplierID) {
		this.supplierID = supplierID;
	}


	@Override
	public String toString() {
		return "Products [productID=" + productID + ", productName=" + productName + ", productDescription="
				+ productDescription + ", price=" + price +  ", availability="
				+ availability + ", prescription=" + prescription + ", supplierID=" + supplierID + "]";
	}
	
	
	
}
