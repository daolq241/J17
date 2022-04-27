package bai_tap_oop_qlns;

public class Staff {
	protected String code;
	protected String name;
	protected String phone;
	protected int workingDay;
	protected  double salary;
	
	public Staff() {
		
	}
	
	public Staff(String code, String name, String phone, int workingDay) {
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.workingDay = workingDay;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void calcSalary() {
		this.salary = 0;
	}

	@Override
	public String toString() {
		return "Staff [code=" + code + ", name=" + name + ", phone=" + phone + ", workingDay=" + workingDay
				+ ", salary=" + salary + "]";
	}
	
	
	
	
}

