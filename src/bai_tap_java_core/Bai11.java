package bai_tap_java_core;

import java.util.Scanner;

public class Bai11 {
	//log a (b) = log e (b) / log e (a)
	public static double log2(int a, int b) {
		double result = 0;
		result = Math.log(b) / Math.log(a);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double rs = log2(2, n);
		System.out.println((int) (rs - 1));
	}
}
