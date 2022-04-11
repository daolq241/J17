package bai_tap_java_core;

import java.util.Scanner;

public class Bai19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean check = true;
		while (check) {
			System.out.println("============= MENU ============");
			System.out.println("Chọn chức năng:");
			System.out.println("1. Giải phương trình bậc 1");
			System.out.println("2. Giải phương trình bậc 2");
			System.out.println("0. Thoat");

			int chon = sc.nextInt();
			switch (chon) {
			case 1:
				boolean checkPT1 = true;
				while (checkPT1) {
					System.out.println("----- PHƯƠNG TRÌNH AX + B = 0 --------");
					System.out.println("1. Nhập a và b: ");
					System.out.println("0. Thoat");
					int choicePT1 = sc.nextInt();
					switch (choicePT1) {
					case 1:
						System.out.println("a = ");
						int a = sc.nextInt();
						System.out.println("b = ");
						int b = sc.nextInt();
						System.out.println("Nghiệm của phương trình là: " + (float) (-b / a));
						break;

					case 0:
						checkPT1 = false;
						break;

					}

				}
			case 2:

				boolean checkPT2 = true;
				while (checkPT2) {
					System.out.println("----- PHƯƠNG TRÌNH AX^2 + BX + C = 0 --------");
					System.out.println("1. Nhập a, b, c ");
					System.out.println("0. Thoat");
					int choicePT2 = sc.nextInt();
					switch (choicePT2) {
					case 1:
						System.out.println("a = ");
						int a = sc.nextInt();
						System.out.println("b = ");
						int b = sc.nextInt();
						System.out.println("c = ");
						int c = sc.nextInt();
						giaiPT2(a, b, c);
						break;

					case 0:
						checkPT2 = false;
						break;

					}
				}
			case 0:
				check = false;
				break;
			}

		}

	}

	private static void giaiPT2(int a, int b, int c) {
		// TODO Auto-generated method stub
		double delta = b * b - 4 * a * c;
		if (delta < 0)
			System.out.println("PT vô nghiệm");
		if (delta == 0)
			System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (float) (-b / 2 * a));
		if (delta > 0) {
			System.out.println("Phương trình có 2 nghiệm x1 = " + (double) ((-b - Math.sqrt(delta)) / 2 * a) + " x2 = "
					+ (double) ((-b + Math.sqrt(delta)) / 2 * a));
		}

	}
}
