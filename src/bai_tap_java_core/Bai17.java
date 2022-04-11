package bai_tap_java_core;

import java.util.Scanner;

public class Bai17 {
	public static void main(String[] args) {
		double numRandom = Math.random();
		int check = (int) (numRandom * 1000 + 1);
//		System.out.println("So ramdom " + check);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		while (n != check) {
			if (n > check) {
				System.out.println("Lớn hơn số bí mật, mời nhập lại: ");
				n = sc.nextInt();
			} else {
				System.out.println("Nhỏ hơn số bí mật, mời nhập lại: ");
				n = sc.nextInt();
			}
		}
		System.out.println("Game over");

	}
}
