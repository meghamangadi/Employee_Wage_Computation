package com.employeeWage;

public class EmployeeWageComputation {

	public static final int Is_Part_Time = 1;
	public static final int Is_Full_Time = 2;
	public static final int EMP_RATE_PER_HOUR = 20;
	public static final int Num_Of_Working_Days = 20;
	public static final int Max_Hrs_In_Month = 100;

	public static void main(String[] args) {

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		int totalEmpWage = 0;
		
		while (totalEmpHrs<=Max_Hrs_In_Month && totalWorkingDays<Num_Of_Working_Days ){
			totalWorkingDays++ ;
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
			totalEmpHrs += empHrs;
			
			System.out.println("Day#: " + totalWorkingDays + "Employee Hr: " +empHrs);
		}
		
		int totalEmpWage1 = totalEmpHrs * EMP_RATE_PER_HOUR;
		System.out.println("Total Employee Wage: "+  totalEmpWage1 );
	}
}
