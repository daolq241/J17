package bai_tap_oop;

import java.util.Scanner;

public class Student {
	private String code;
	private String name;
	private double mathPoint;
	private double physicPoint;
	private double chemistryPoint;
	private double average;
	
	public Student() {
			
	}
	
	
	public Student(String code, String name, double mathPoint, double physicPoint, double chemistryPoint) {
		super();
		this.code = code;
		this.name = name;
		this.mathPoint = mathPoint;
		this.physicPoint = physicPoint;
		this.chemistryPoint = chemistryPoint;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMathPoint() {
		return mathPoint;
	}
	public void setMathPoint(double mathPoint) {
		this.mathPoint = mathPoint;
	}
	public double getPhysicPoint() {
		return physicPoint;
	}
	public void setPhysicPoint(double physicPoint) {
		this.physicPoint = physicPoint;
	}
	public double getChemistryPoint() {
		return chemistryPoint;
	}
	public void setChemistryPoint(double chemistryPoint) {
		this.chemistryPoint = chemistryPoint;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
	

	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", mathPoint=" + mathPoint + ", physicPoint=" + physicPoint
				+ ", chemistryPoint=" + chemistryPoint + "]";
	}
	
	
	
	
	
}
