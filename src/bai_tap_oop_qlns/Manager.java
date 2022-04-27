package bai_tap_oop_qlns;

import java.util.ArrayList;

public class Manager extends Staff {
	static int SALARY_DAY = 200;
	private int totalEmployee;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String code, String name, String phone, int workingDay) {
		super(code, name, phone, workingDay);
		// TODO Auto-generated constructor stub
	}
	
	

	public int getTotalEmployee() {
		return totalEmployee;
	}

	public void setTotalEmployee(int totalEmployee) {
		this.totalEmployee = totalEmployee;
	}
	
	public void incrementTotalEmp() {
		this.totalEmployee ++;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Total Employee: " + totalEmployee;
	}

	
	
	
	

	

	
	
	

}
