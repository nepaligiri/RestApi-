package com.project.jpa.project.customer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {
	
	List<Customer> findByProductProductId(String productId);
	


}
