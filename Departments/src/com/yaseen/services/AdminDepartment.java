package com.yaseen.services;

public class AdminDepartment extends SuperDepartment {

	//@override departmentName
	//Method return type is String and do not pass any parameters
	public String departmentName()
	{
		return "Welcome to Admin Department";

	}

	//@override getTodaysWork
	//Method return type is String and don't pass any parameters

	public String getTodaysWork()
	{
		return "Complete your documents submission";
	}

	//@override getWorkDeadline
	//Method return type is String and don't pass any parameters
	public String getWorkDeadline()
	{
		// calling method of SuperDepartment class
		super.isTodayAHoliday(); 

		return "Complete by EOD";

	}

}

