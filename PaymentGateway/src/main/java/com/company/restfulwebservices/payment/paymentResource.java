package com.company.restfulwebservices.payment;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class paymentResource {

	@Autowired
	private PaymentService service;

	@GetMapping("/allTransactions")
	public List<PaymentData> retrieveAllUsers() {
		return service.findAll();
	}
	@PostMapping("/addTransaction")
	public ResponseEntity<Object> createUser(@RequestBody PaymentData paymentData){
		PaymentData savedData = service.save(paymentData);
		
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(savedData.getId()).toUri();
		
		return ResponseEntity.created(location).build();
	}
	
}









