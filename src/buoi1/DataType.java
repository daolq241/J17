package buoi1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class DataType {
//	public static boolean isGiamDan(int num1, int num2, int num3){
////		if(num1 > num2 && num2 > num3) return true;
//		return (num1 > num2 && num2 > num3) ? true : false;
//	}
//	public static boolean isTangDan(int num1, int num2, int num3){
////		if(num1 > num2 && num2 > num3) return true;
//		return (num1 < num2 && num2 < num3) ? true : false;
//	}
	public static void main(String[] args) {

		// Ex1
//		LocalDate ld = LocalDate.now();
//		System.out.println(ld);
//		LocalTime lt = LocalTime.now();
//		System.out.println(lt);

//		----------Ex2------------
//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		System.out.println(num1+num2+num3);
//		if(isTangDan(num1, num2, num3) || isGiamDan(num1, num2, num3)) {
//			System.out.println("Tang dan or Giam Dan");
//		}
//		else 
//			System.out.println("Chua dc sx");

//		---------Ex3-----------
//		Scanner sc = new Scanner(System.in);
//		int num;
//		num = sc.nextInt();
//		sc.nextLine();
//		int dem = 0;
//		System.out.println(dem);
//		while(num>0) {
//				num = num/10;
//				dem++;
//			}
//		System.out.println("so chu so la: " + dem);
//
//	}

		// ----------------Ex4----------------------
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		double flag = 1;
			while (flag <= n) {
				double tich = 1;
				for (double i = flag; i <= flag + 2; i++) {
					double temp = 1 / (1 * i);
					tich *= temp;
					System.out.println(tich);
				}
				sum += tich;
				System.out.println(sum);
				flag++;
			}
		System.out.println(sum);
	}
}
