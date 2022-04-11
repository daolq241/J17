package bai_tap_java_core;

import java.util.Scanner;

public class Bai10 {
	public static boolean isNguyenTo(int n) {
		if (n == 2)
			return true;
		 if (n > 2) {
			 int count = 0;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) count++;
			}
			if (count == 0) return true;
			else return false;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 2;
		for (int i = 3; i <= n; i++) {
			if (isNguyenTo(i)) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
