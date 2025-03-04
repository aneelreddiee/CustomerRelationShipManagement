package com.CustomerRelationshipManagement.service;


import com.CustomerRelationshipManagement.entity.Customer;

import java.util.List;
public interface CustomerService {
	String insertCustomer(Customer customer);
	List<Customer> getCustomerList();
	Customer getCustomerById(int id);
	String customerUpdate(Customer customer);
	String deleteCustomerById(int id);
	String insertMultipleCustomers(List<Customer> customers);
	List<Customer> getCustomersByFirstName(String firstName);
	List<Customer> getCustomerByLessThanAge(int age);
	List<Customer> getCustomerByAge(int age);
	List<Customer> getCustomersByLastName(String lastName);
	List<Customer> getCustomersByEmail(String email);
	List<Customer> getCustomersByMobileNumber(String mobileNumber);
	
	String updateFirstName(int id, String firstName);
	String updateLastName(int id, String lastName);
	String updateEmailId(int id,String emailId);
	String updateMobileNumber(int id,String mobileNumber);
	String updateAge(int id,int age);
	List<String> getCustomerFirstNames();	
	
}
