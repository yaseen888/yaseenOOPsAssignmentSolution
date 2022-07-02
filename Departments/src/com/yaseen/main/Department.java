package com.yaseen.main;
import com.yaseen.services.*;

//Driver class
public class Department {

	public static void main(String[] args) {

		//creating object of admin class and calling its methods
		AdminDepartment ad = new AdminDepartment();
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();

		//creating object of hr class and calling its methods
		HrDepartment hr = new HrDepartment();
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println();
		System.out.println();


		//creating object of technical class and calling its methods
		TechnicalDepartment td= new TechnicalDepartment(); 
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(hr.isTodayAHoliday());



	}

}
