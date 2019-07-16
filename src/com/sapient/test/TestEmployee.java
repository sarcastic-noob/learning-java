/**
 * 
 */
package com.sapient.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author prasingh40
 *
 */
public class TestEmployee {
	Employee employee=new Employee();
	EmployeeService empBusinessLogic = new EmployeeService();


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	 @Test
	   public void testCalculateAppriasal() {
	      employee.setName("Amit");
	      employee.setAge(25);
	      employee.setSalary(8000);
			
	      double appraisal = empBusinessLogic.calculateAppraisal(employee);
	      assertEquals(500, appraisal, 0.0);
	   }

	   // test to check yearly salary
	   @Test
	   public void testCalculateYearlySalary() {
	      employee.setName("Amit");
	      employee.setAge(25);
	      employee.setSalary(8000);
			
	      double salary = empBusinessLogic.calculateYearlySalary(employee);
	      assertEquals(96000, salary, 0.0);
	   }

}
