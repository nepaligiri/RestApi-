package com.project.jpa.project.ptoduct;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private Services service;
	
	@RequestMapping("/products")
	public List<Product> getAll() {
		return service.getAllProduct();			
					
	}
	
	@RequestMapping("/products/{productId}")
	 public Optional<Product> GetoneProduct( @PathVariable String productId) {
		 return service.getProduct(productId);
		 
	 }
	@RequestMapping(method=RequestMethod.POST, value ="/products")
	public void addProduct(@RequestBody Product product) {
		service.addProduct(product);
		
		
	}
	@RequestMapping(method=RequestMethod.PUT, value ="/products/{productId}")
	public void updateProduct(@RequestBody Product product, @PathVariable String productId) {
		service.updateProduct(productId,product);
		
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value ="/products/{productId}")
	public void deleteProduct( @PathVariable String productId) {
		service.deleteProduct(productId);
		
		
	}

}
