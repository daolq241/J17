package bai_tap_java_core;

import java.util.Scanner;

public class Bai12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++){
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
