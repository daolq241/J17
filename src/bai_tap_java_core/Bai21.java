package bai_tap_java_core;

import java.util.Scanner;

public class Bai21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int v1 = sc.nextInt();
		int x2 = sc.nextInt();
		int v2 = sc.nextInt();

		boolean check = false;
		for (int i = x1; i < 10000; i += v1) {
			for (int j = x2; j < 10000; j += v2) {
				if (i == j)
					check = true;
			}
		}

		if (check)
			System.out.println("2 con se gap nhau");
		else
			System.out.println("2 con khong gap nhau");

	}

}
