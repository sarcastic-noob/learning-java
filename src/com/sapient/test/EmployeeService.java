/**
 * 
 */
package com.sapient.test;

/**
 * @author prasingh40
 *
 */
public class EmployeeService {
	// Calculate the yearly salary of employee
	   public double calculateYearlySalary(Employee employee) {
	      double yearlySalary = 0;
	    
	      yearlySalary = employee.getSalary() * 12;
	      
	      return yearlySalary;
	   }
		
	   
	   // Calculate the appraisal amount of employee
	   public double calculateAppraisal(Employee employeeDetails) {
	      double appraisal = 0;
			
	      if(employeeDetails.getSalary() < 10000){
	         appraisal = 500;
	      }else{
	         appraisal = 1000;
	      }
			
	      return appraisal;
	   }

}
