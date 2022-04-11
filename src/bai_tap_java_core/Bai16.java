package bai_tap_java_core;

import java.util.Scanner;

public class Bai16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		if((year - 2020)%4==0) {
			System.out.println("Năm " + year + " là năm nhuận");
		}
		else 
			System.out.println("Năm " + year + " không phải năm nhuận");
			
	}
}
