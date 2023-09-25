package com.assignment1.model;

public class HrDept extends SuperDept {
	
	@Override
	public String departmentName() {
		return "HR Department";
	}
	
	@Override
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}
	
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	public String doActivity() {
		return "team Lunch";
	}

	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return super.isTodayAHoliday();
	}

}
