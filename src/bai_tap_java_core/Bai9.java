package bai_tap_java_core;

import java.util.Scanner;

public class Bai9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int a1 = a%10, a2 = a/10;
		int b1 = b%10, b2 = b/10;
		if(a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2 )
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
