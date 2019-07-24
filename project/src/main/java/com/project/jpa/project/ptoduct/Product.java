package com.project.jpa.project.ptoduct;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "product")
public class Product {
	@Id
	private String productId;
	private int price;
	private  String description;
	private int product_no;
	
	 public Product() {
		 
	 }
	
	public Product(String productId, int price, String description, int product_no) {
		super();
		this.productId = productId;
		this.price = price;
		this.description = description;
		this.product_no = product_no;
	}

	public String getProductId() {
		return productId;
	}

	public void setName(String productId) {
		this.productId= productId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	@Override
	public String toString() {
		return "Product [name=" + productId + ", price=" + price + ", description=" + description + ", product_no="
				+ product_no + "]";
	}
	
	
	
	
	
	

}
