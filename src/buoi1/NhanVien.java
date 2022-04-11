package buoi1;

public class NhanVien {
	private String 	hoTen;
	private String maNhanVien;
	private String cccd;
	private String email;
	private String sdt;
	private String gioiTinh;
	
	
	//Phuong thuc khoi tao rong
	public NhanVien() {
		
	}

	// Phuong thuc khoi tao
	public NhanVien(String hoTen, String maNhanVien, String cccd, String email, String sdt, String gioiTinh) {
		this.hoTen = hoTen;
		this.maNhanVien = maNhanVien;
		this.cccd = cccd;
		this.email = email;
		this.sdt = sdt;
		this.gioiTinh = gioiTinh;
	}
	
	public void tinhLuong() {
		System.out.println("Day la ham tinh luong");
	}
	public void tongGioLam() {
		System.out.println("Day la ham tinh tong gio lam");
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}



	
	
	
	
}
