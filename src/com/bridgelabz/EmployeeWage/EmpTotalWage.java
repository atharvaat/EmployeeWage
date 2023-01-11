package com.bridgelabz.EmployeeWage;
import java.util.Random;

public class EmpTotalWage {
	   public static final int IS_FULL_TIME = 1;
		public static final int IS_PART_TIME = 2;
		public static final int EMP_RATE_PER_HOUR = 20;
		public static final int NUM_OF_WORKING_DAYS = 20;
		public static final int MAX_HOURS_IN_MONTH = 100;

		public static void main(String[] args) {
			System.out.println("Welcome to Employee wage computation program");
			
			int empHour = 0;
			int totalEmpHours = 0;
			int totalWorkingDays = 0;
			
		    while(totalEmpHours <= 100 && totalWorkingDays < 20) {
		    	totalWorkingDays++;
		    	
			Random random = new Random();
			int attendance = random.nextInt(2);
			
			switch(attendance) { 
			case IS_PART_TIME  :
			     	empHour = 4;
			     	System.out.println("part time");
				break;
			
			case IS_FULL_TIME :
				empHour = 8;
				System.out.println(" full time");
				break;
				
		    default: 
				empHour = 0;
				System.out.println(" Absent");
			}
			totalEmpHours += empHour;
			System.out.println("Day: "+totalWorkingDays+"=>" +" Emp Hours= "+ empHour);
			}
		    int totalEmpWage = totalEmpHours *  EMP_RATE_PER_HOUR;
			System.out.println("Total Employee wage:" + totalEmpWage);
		}
}
