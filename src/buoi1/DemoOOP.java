package buoi1;

import java.util.Scanner;

public class DemoOOP {
	public static void main(String[] args) {
//		NhanVien nhanVienA = new NhanVien("Nhan vien A", "MS001", "036098", "qdao98nd@gmail.com", "0943824198", "Nam");
//		System.out.println("Nhan vien A: " + nhanVienA.hoTen);
//		NhanVien nhanVienB = new NhanVien();
//		nhanVienB.hoTen = "Nhan Vien B";
//		System.out.println("Nhan vien B: " + nhanVienB.hoTen);
		
		System.out.println("Nhập điểm TB: ");
		Scanner sc = new Scanner(System.in);
		float diemToan = sc.nextFloat();
		float diemLy = sc.nextFloat();
		float diemHoa = sc.nextFloat();
		Student student = new Student();
		student.setDiemToan(diemToan);
		student.setDiemHoa(diemHoa);
		student.setDiemLy(diemLy);
		System.out.println("Xếp loại: " + student.rank(student.calAverage()));
		
		
	}
	
}
