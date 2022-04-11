package bai_tap_java_core;

import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = "";
		while (num > 0) {
			s+=  num%2;
			num = num/2;
		}
		s.toCharArray();
		for(int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
