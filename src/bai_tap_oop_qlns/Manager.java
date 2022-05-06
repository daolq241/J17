package bai_tap_oop_qlns;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Staff {
	static int SALARY_DAY = 200;
	private int totalEmployee;
	private String role = "manager";

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
	
	public void decrementTotalEmp() {
		this.totalEmployee --;
	}
	
	@Override
	public void inStaff(Scanner sc) {
		// TODO Auto-generated method stub
		super.inStaff(sc);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Role: " + role + ", Total Employee: " + totalEmployee ;
	}

	
	
	
	

	

	
	
	

}
