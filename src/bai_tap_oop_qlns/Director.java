package bai_tap_oop_qlns;

public class Director extends Staff {
	static int SALARY_DAY = 300;
	private double share;
	
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
	public void calcSalary() {
		this.salary = workingDay * SALARY_DAY;
	}

	
	
	
}
