package com.bridgelabz.EmployeeWage;
import java.util.Random;

public class EmpWagesMonth {
	 public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS =20;

		public static void main(String[] args) {
			System.out.println("Welcome to Employee wage computation program");
			
			int empHour = 0;
			int empWage = 0;
			int totalEmpWage = 0;
			
			for(int day = 0; day <= 20; day ++) {
			Random random = new Random();
			int attendance = random.nextInt(2);
			
			switch(attendance) { 
			case IS_PART_TIME  :
			     	empHour = 4;
			     	System.out.println("Day"+ day+"part time");
				break;
			
			case IS_FULL_TIME :
				empHour = 8;
				System.out.println("Day"+ day +" full time");
				break;
				
		    default: 
				empHour = 0;
				System.out.println("Day"+day+" Absent");
			}
			empWage = empHour * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Day "+ day +"Emp wage: "+ empWage);
			}
			System.out.println("Total Employee wage:" + totalEmpWage);
		}
}
