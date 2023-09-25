package com.assignment1.model;

public class TechDept extends SuperDept {
	
	@Override
	public String departmentName() {
		return "Tech Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1";
	}
	
	@Override	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return super.isTodayAHoliday();
	}

	public String getTechStackInformation() {
		return "Core Java";
	}

}
