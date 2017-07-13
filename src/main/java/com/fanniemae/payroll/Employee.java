package com.fanniemae.payroll;

public abstract class Employee {

	float yearlySalary = 0; 
	
	public Employee (float yearlySalary){
	this.yearlySalary = yearlySalary;
		
	}
	
	public float getYearlySalary() {
		return yearlySalary;
	}
	
	
	public float getWeeklySalary () {
		return yearlySalary/52;
	}
	
	/* The objective is to find the monthly salary.  Create method call getMonthlySalary;
	 */
	
	public float getMonthlySalary () {
		return yearlySalary/12;
		
	}
	
	// Create a method called getHourlyWage based on a 40 hour week.
	
	public float getHourlyWage () {
		return yearlySalary/52/40;
		
	}

	public float getOverTimeHourlyWage() {
		return 0;
	}
	
}
