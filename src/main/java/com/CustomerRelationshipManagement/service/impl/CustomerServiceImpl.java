package com.CustomerRelationshipManagement.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;


import com.CustomerRelationshipManagement.dao.CustomerDao;
import com.CustomerRelationshipManagement.entity.Customer;
import com.CustomerRelationshipManagement.service.CustomerService;


@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;
	
		
	public CustomerServiceImpl(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public String insertCustomer(Customer customer){
		// TODO Auto-generated method stub

		
		
		String msg = customerDao.insertCustomer(customer);
		return msg;
	}

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		List<Customer> list=customerDao.getCustomerList();
		
		return list;
		
	}
	
	public Customer getCustomerById(int id) {
		Customer customer=customerDao.getCustomerById(id);
		return customer;
	}

	@Override
	public String customerUpdate(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.updateCustomer(customer);
	}

	@Override
	public String deleteCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerDao.deleteCustomerById(id);
	}

	@Override
	public String insertMultipleCustomers(List<Customer> customers) {
		// TODO Auto-generated method stub
		return customerDao.insertMultipleCustomers(customers);
	}

	@Override
	public List<Customer> getCustomersByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return customerDao.getCustomersByFirstName(firstName);
	}

	@Override
	public List<Customer> getCustomerByLessThanAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByLessThanAge(age);
	}

	@Override
	public List<Customer> getCustomerByAge(int age) {
		// TODO Auto-generated method stub
		return customerDao.getCustomerByAge(age);
	}

	@Override
	public List<Customer> getCustomersByLastName(String lastName) {
		// TODO Auto-generated method stub
		return customerDao.getCustomersByLastName(lastName);
	}

	@Override
	public List<Customer> getCustomersByEmail(String email) {
		// TODO Auto-generated method stub
		return customerDao.getCustomersByEmail(email);
	}

	@Override
	public List<Customer> getCustomersByMobileNumber(String mobileNumber) {
		// TODO Auto-generated method stub
		return customerDao.getCustomersByMobileNumber(mobileNumber);
	}

	@Override
	public String updateFirstName(int id, String firstName) {
		// TODO Auto-generated method stub
		return customerDao.updateFirstName(id, firstName);
	}

	@Override
	public String updateLastName(int id, String lastName) {
		// TODO Auto-generated method stub
		return customerDao.updateLastName(id, lastName);
	}

	@Override
	public String updateEmailId(int id, String emailId) {
		// TODO Auto-generated method stub
		return customerDao.updateEmailId(id, emailId);
	}

	@Override
	public String updateMobileNumber(int id, String mobileNumber) {
		// TODO Auto-generated method stub
		return customerDao.updateMobileNumber(id, mobileNumber);
	}

	@Override
	public String updateAge(int id, int age) {
		// TODO Auto-generated method stub
		return customerDao.updateAge(id, age);
	}

	@Override
	public List<String> getCustomerFirstNames() {
		// TODO Auto-generated method stub
		return customerDao.getCustomerFirstNames();
	}
}
