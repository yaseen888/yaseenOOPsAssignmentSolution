package com.yaseen.services;

public class TechnicalDepartment extends SuperDepartment {

	//@override departmentName
	//Method return type is String and do not pass any parameters
	public String departmentName()
	{
		return "Welcome to Tech Department";

	}

	//@override getTodaysWork
	//Method return type is String and don't pass any parameters
	public String getTodaysWork()
	{
		return "Complete coding of Module 1";
	}

	//@override getWorkDeadline
	//Method return type is String and don't pass any parameters
	public String getWorkDeadline()
	{
		//calling method of SuperDepartment class
		super.isTodayAHoliday();
		return "Complete by EOD";
	}

	//Method return type is String and don't pass any parameters
	public String getTechStackInformation()
	{
		return "Core Java";
	}

}