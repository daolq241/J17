/**
 * 
 */
package bai_tap_oop_qlns;

import java.util.Scanner;

public class Company {
	private String name;
	private String taxCode;
	private double income;
	
	
	public Company() {
		
	}
	
	public Company(String name, String taxCode, double income) {
		this.name = name;
		this.taxCode = taxCode;
		this.income = income;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", taxCode=" + taxCode + ", income=" + income + "]";
	}
	
	
	
	
}
