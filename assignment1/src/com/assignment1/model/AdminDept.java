package com.assignment1.model;

public class AdminDept  extends SuperDept{

	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return super.isTodayAHoliday();
	}
	
	@Override
	public String departmentName() {
		return "Admin Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}	

}
