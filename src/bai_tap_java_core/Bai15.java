package bai_tap_java_core;

import java.util.Scanner;

public class Bai15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		System.out.println(s.length());
		System.out.println("Nhập vị trí kí tự: ");
		int viTri = sc.nextInt();
		System.out.println(s.charAt(viTri - 1));
		if(s.contains("abcdef")) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}
