package bai_tap_oop_qlns;

import java.util.Scanner;

public class Director extends Staff {
	static int SALARY_DAY = 300;
	private double share;
	private String role = "director";

	
	public Director() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Director(String code, String name, String phone, int workingDay, double salary, double share) {
		super(code, name, phone, workingDay);
		// TODO Auto-generated constructor stub
		this.share = share;
	}
	
	
	public double getShare() {
		return share;
	}

	public void setShare(double share) {
		this.share = share;
	}
	
	@Override
	public void inStaff(Scanner sc) {
		// TODO Auto-generated method stub
		super.inStaff(sc);
		System.out.println("Share: ");
		this.share = Double.parseDouble(sc.nextLine());
	}

	@Override
	public void calcSalary() {
		this.salary = workingDay * SALARY_DAY;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Role: " + role + ", Share: " + share;
	}

	
	
	
}
