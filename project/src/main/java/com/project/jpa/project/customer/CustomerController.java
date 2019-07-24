package com.project.jpa.project.customer;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpa.project.ptoduct.Product;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerServices service;
	
	@RequestMapping("products/{productId}/customers")
	public List<Customer> getAll(@PathVariable String productId) {
		return service.getAllCustomer(productId);			
					
	}
	
	@RequestMapping("/products/{productId}/customers/{name}")
	 public Optional<Customer> GetoneProduct( @PathVariable String name) {
		 return service.getCustomer(name);
		 
	 }
	@RequestMapping(method=RequestMethod.POST, value ="/products/{productId}/customers")
	public void addCustomer(@RequestBody Customer customer, @PathVariable String productId) {
		customer.setProduct(new Product(productId, 0,"",0));
		service.addCustomer(customer);
		
		
	}
	@RequestMapping(method=RequestMethod.PUT, value ="/products/{productId}/customers/{name}")
	public void updateCustomer(@RequestBody Customer customer,@PathVariable String productId, @PathVariable String name) {
		customer.setProduct(new Product(productId,0,"",0));

		service.updateCustomer(customer);
		
		
	}
	@RequestMapping(method=RequestMethod.DELETE, value ="/products/{productId}/customers/{name}")
	public void deleteCustomer( @PathVariable String name) {
		service.deleteCustomer(name);
		
		
	}

}
