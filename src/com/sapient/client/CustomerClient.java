/**
 * 
 */
package com.sapient.client;

import com.sapient.service.CustomerInterface;
import com.sapient.service.CustomerService;

/**
 * @author prasingh40
 *
 */
public class CustomerClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the instance of interface
		
		CustomerInterface client=new CustomerService();
		client.createCustomer();
		client.listCustomer();
//		client.updateCustomer();
//		client.deleteCustomer();
	}

}
