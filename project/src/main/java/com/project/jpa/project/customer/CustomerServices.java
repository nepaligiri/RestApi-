package com.project.jpa.project.customer;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServices {
	
	@Autowired
	private CustomerRepository customerRepository;
	

	
	public List <Customer> getAllCustomer( String productId){
		List<Customer>customers = new ArrayList<>();
	customerRepository.findByProductProductId(productId).forEach(customers::add);
	return customers;
		
	
	}
	
	public Optional<Customer> getCustomer(String name) {
		
		 return  customerRepository.findById(name) ;
		 
		// return customers.stream().filter(p->p.getName().equals(name)).findFirst().get();
	}

	public void  addCustomer(Customer product) {
	customerRepository.save(product);
		
	}

	public void updateCustomer(Customer product) {

	customerRepository.save(product)	;
	
		
	}

	public void deleteCustomer(String name) {
		customerRepository.deleteById(name);
	
	}


}
