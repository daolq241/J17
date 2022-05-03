package bai_tap_oop_qlns;

import java.util.Scanner;

public class Employee extends Staff {
	static int SALARY_DAY = 100;
	private Manager manager;
	private String role = "employee";

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String code, String name, String phone, int workingDay) {
		super(code, name, phone, workingDay);
		// TODO Auto-generated constructor stub
	
	}
	

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	@Override
	public void inStaff(Scanner sc) {
		// TODO Auto-generated method stub
		super.inStaff(sc);
	}
	

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		this.salary = this.workingDay * SALARY_DAY;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ " Role: " + role +", Manager: " + manager;
	}
	
	
	
	
}
