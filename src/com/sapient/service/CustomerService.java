/**
 * 
 */
package com.sapient.service;

import com.sapient.bean.Customer;

import java.util.*;

/**
 * @author prasingh40
 *
 */
public class CustomerService implements CustomerInterface{

	List<Customer> customers=new ArrayList<Customer>();
	public void createCustomer() {
		// TODO Auto-generated method stub
		
		Customer c1=new Customer();
		Customer c2=new Customer();

		c1.setCustId(101);
		c1.setCustName("Ganesh Gaitonde");
		c1.setAddress("Bambai");
		c2.setCustId(102);
		c2.setCustName("Bunty");
		c2.setAddress("Mumbai");
		customers.add(c1);
		customers.add(c2);
		System.out.println("customer created");
		
		
	}

	@Override
	public void listCustomer() {
		// TODO Auto-generated method stub
		for(Customer cust: customers) {
			System.out.println("details of customers "+cust.getCustId()+" "+cust.getCustName()+" "+cust.getAddress());
		}
		System.out.println("customer listed");
	}

	@Override
	public int deleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println("customer deleted");
		return 0;
	}

	@Override
	public void updateCustomer() {
		// TODO Auto-generated method stub
		System.out.println("customer updated");
		
	}
	

}
