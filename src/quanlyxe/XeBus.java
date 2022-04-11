package quanlyxe;

public class XeBus extends Xe implements ActionCuaImp {
	@Override
	public void dongCua() {
		// TODO Auto-generated method stub
		System.out.println("Dong 2 cua");

	}

	@Override
	public void moCua() {
		// TODO Auto-generated method stub
		System.out.println("Mo 2 cua");

	}

	private String nguoiSoatVe;

	public String getNguoiSoatVe() {
		return nguoiSoatVe;
	}

	public void setNguoiSoatVe(String nguoiSoatVe) {
		this.nguoiSoatVe = nguoiSoatVe;
	}

}
