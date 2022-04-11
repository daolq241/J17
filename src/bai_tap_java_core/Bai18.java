package bai_tap_java_core;

import java.util.Scanner;

public class Bai18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tiền hiện có, giá oto và lãi suất % hàng năm");
		double tienHienTai = sc.nextDouble();
		double giaOto = sc.nextDouble();
		double laiSuatNam = sc.nextDouble();
		
		// tienHIenTai *(1+ laiSuatNam/100)^n = giaOto
		// a^n = b => n = log a (b) = log (e) b / log (e) a;
		 double year = Math.log(giaOto/tienHienTai) / Math.log((laiSuatNam/100 + 1));
		 System.out.println(year);
		//		Test:
		//		 100
		//		 300
		//		 6
		//		 18.85417667910728
		
	}
}
