package com.project.jpa.project.customer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.elasticsearch.annotations.Document;

import com.project.jpa.project.ptoduct.Product;

@Entity
@Table(name = "customers")
public class Customer {
	@Id
	private String name;
	private int price;
	private  String description;
	

	private int product_no;
	
	@ManyToOne
	private  Product product;
	 
	 public Customer() {
		 
	 }
	
	public Customer(String name, int price, String description, int product_no,String productId ) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
		this.product_no = product_no;
		this.product = new Product(productId,0,"" ,0);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", description=" + description + ", product_no="
				+ product_no + "]";
	}
	
	
	
	
	
	

}
