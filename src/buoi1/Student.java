package buoi1;

public class Student {
	private float diemToan;
	private float diemLy;
	private float diemHoa;
	
	public Student() {
	}
	

	public float calAverage() {
		return (this.diemToan + this.diemHoa + this.diemLy) / 3;
	}


	public String rank(float calAverage) {
		if(calAverage >= 9.0 && calAverage() <= 10.0)
			return "Xuat sac";
		if(calAverage >= 8.0 && calAverage() < 9.0)
			return "Gioi";
		if(calAverage >= 6.0 && calAverage() < 8.0)
			return "Kha";
		return "Trung Binh";
	}



	public float getDiemToan() {
		return diemToan;
	}



	public void setDiemToan(float diemToan) {
		this.diemToan = diemToan;
	}



	public float getDiemLy() {
		return diemLy;
	}



	public void setDiemLy(float diemLy) {
		this.diemLy = diemLy;
	}



	public float getDiemHoa() {
		return diemHoa;
	}



	public void setDiemHoa(float diemHoa) {
		this.diemHoa = diemHoa;
	}



	
	
	
	
	
}
