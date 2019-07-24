package com.project.jpa.project.ptoduct;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Services {
	
	@Autowired
	private ProductRepository productRepository;
	
//	List<Product>products = new ArrayList<> (Arrays.asList(
//				new Product("shoes", 100," original shoes", 12345),
//				new Product("t-shirts", 80," original t-shirts", 12346),
//				new Product("pants", 40," original spants", 12347),				
//				new Product("glass", 50," original glass", 12348)
//				));
//	
	public List <Product> getAllProduct(){
		List<Product>products = new ArrayList<>();
	productRepository.findAll().forEach(products::add);
	return products;
		
	
	}
	
	public Optional<Product> getProduct(String productId) {
		
		 return  productRepository.findById(productId) ;
		 
		// return products.stream().filter(p->p.getName().equals(name)).findFirst().get();
	}

	public void  addProduct(Product product) {
	productRepository.save(product);
		
	}

	public void updateProduct( String productId,Product product) {

	productRepository.save(product)	;
	
		
	}

	public void deleteProduct(String productId) {
		productRepository.deleteById(productId);
	
	}


}
