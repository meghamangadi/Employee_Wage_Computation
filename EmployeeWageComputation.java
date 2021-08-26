package com.employeeWage;

public class EmployeeWageComputation {

	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int Num_Of_Working_Days = 20;

	public static void main(String[] args) {

		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;
		for (int day = 1; day <= Num_Of_Working_Days; day++) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
			case Is_Part_Time:
				empHrs = 4;
				break;
			case Is_Full_Time:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Employee_wage:" + empWage);
		}
		System.out.println("Total Employee_wage:" + totalEmpWage);
	}

}
