package quanlyxe;

public class Xe {
	protected String bienSoXe;
	protected String taiXe;
	protected String tuyenDi;
	protected int banhXe;
	protected double doanhThu;
	protected String phamViHoatDong;

	public String getBienSoXe() {
		return bienSoXe;
	}

	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}

	public String getTaiXe() {
		return taiXe;
	}

	public void setTaiXe(String taiXe) {
		this.taiXe = taiXe;
	}

	public String getTuyenDi() {
		return tuyenDi;
	}

	public void setTuyenDi(String tuyenDi) {
		this.tuyenDi = tuyenDi;
	}

	public int getBanhXe() {
		return banhXe;
	}

	public void setBanhXe(int banhXe) {
		this.banhXe = banhXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	public String getPhamViHoatDong() {
		return phamViHoatDong;
	}

	public void setPhamViHoatDong(String phamViHoatDong) {
		this.phamViHoatDong = phamViHoatDong;
	}

	public void lanBanh() {
		System.out.println("Xe dang lan banh");
	}

}
