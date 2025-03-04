package com.CustomerRelationshipManagement.controller;


import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api/customers")
public class CustomerController {

	CustomerService customerService;
	

	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}
	
	@PostMapping("/insert")
	public String insertCustomer(@RequestBody Customer customer)  {
		
		String msg=customerService.insertCustomer(customer);
		return msg;
		
	}
	@GetMapping
	public List<Customer> getCustomersList(){
		List<Customer> list=customerService.getCustomerList();
		return list;
	}
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return customerService.getCustomerById(id);
	}
	@PutMapping
	public String customerUpdate(@RequestBody Customer customer) {
		return customerService.customerUpdate(customer);
		
	}
	@DeleteMapping("/{id}")
	public String deleteCustomerById(@PathVariable int id) {
		return customerService.deleteCustomerById(id);
	}
	
	@PostMapping
	public String insertMultipleCustomers(@RequestBody List<Customer> customers) {
		return customerService.insertMultipleCustomers(customers);
	}
	
	@GetMapping("/byname/{firstName}")
	public List<Customer> getCustomerByFirstName(@PathVariable String firstName){
		return customerService.getCustomersByFirstName(firstName);
	}
	
	@GetMapping("/bylessthanage/{age}")
	public List<Customer> getCustomerByLessThanAge(@PathVariable int age){
		return customerService.getCustomerByLessThanAge(age);
	}
	
	@GetMapping("/byage/{age}")
	public List<Customer> getCustomerByAge(@PathVariable int age){
		return customerService.getCustomerByAge(age);
	}
	
	@GetMapping("/bylastname/{lastName}")
	public List<Customer> getCustomersByFirstName(@PathVariable String lastName){
		return customerService.getCustomersByLastName(lastName);
	}
	
	@GetMapping("/byemail/{email}")
	public List<Customer> getCustomersByEmail(@PathVariable String email){
		return customerService.getCustomersByEmail(email);
	}
	
	@GetMapping("/bymobilenumber/{mobileNumber}")
	public List<Customer> getCustomersByMobileNumber(@PathVariable String mobileNumber){
		return customerService.getCustomersByMobileNumber(mobileNumber);
	}
	
	
	@PutMapping("/fname/{id}")
	public String updateFirstName(@PathVariable int id,@RequestBody Map<String,String> request) {
		String firstName=request.get("firstName");
		return customerService.updateFirstName(id, firstName);
		
	}
	
	@PutMapping("/lname/{id}")
	public String updateLastName(@PathVariable int id, @RequestBody Map<String, String> request ) {
		String lastName=request.get("lastName");
		return customerService.updateLastName(id, lastName);
	}
	
	@PutMapping("/email/{id}")
	public String updateEmail(@PathVariable int id,@RequestBody Map<String,String> request) {
		String emailId=request.get("EmailId");
		return customerService.updateEmailId(id,emailId);
	}
	
	@PutMapping("/mobile/{id}")
	public String updateMobileNumber(@PathVariable int id,@RequestBody Map<String,String> request) {
		String mobileNumber=request.get("mobileNumber");
		return customerService.updateMobileNumber(id, mobileNumber);
	}
	
	@PutMapping("/age/{id}")
	public String updateAge(@PathVariable int id,@RequestBody Map<String, Integer> request) {
		int age=request.get("age");
		return customerService.updateAge(id, age);
		
	}
	
	@GetMapping("/firstNames")
	public List<String> getFirstNames(){
		return customerService.getCustomerFirstNames();
	}
}
