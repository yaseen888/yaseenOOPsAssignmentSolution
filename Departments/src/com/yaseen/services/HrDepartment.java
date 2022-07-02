package com.yaseen.services;

public class HrDepartment extends SuperDepartment {

	//@override departmentName
	//Method return type is String and do not pass any parameters
	public String departmentName() 
	{
		return "Welcome to HR Department";

	}

	//@override getTodaysWork
	//Method return type is String and don't pass any parameters
	public String getTodaysWork()
	{
		return "Fill today's timesheet and mark your attendance";
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
	public String doActivity()
	{
		return "Team Launch";
	}


}