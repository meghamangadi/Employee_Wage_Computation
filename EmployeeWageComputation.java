package com.employeeWage;

public class EmployeeWageComputation {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
       
		int isFullTime = 1;
    	int empCheck = (int) Math.floor(Math.random() * 10) % 2;
    	if(empCheck == isFullTime)
            System.out.println( "Employee is present");
    	else
    		System.out.println("Employee is absent");
	}
	

}
