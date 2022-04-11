package bai_tap_java_core;

import java.util.Arrays;
import java.util.Scanner;

public class Bai8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		s = sc.nextLine();
		String[] s1 = s.split(" ");
//		System.out.println(Arrays.toString(s1));
//		String s3 = "";
		String s2 = "";
		for (int i = 0; i < s1.length; i++) {
			s2 += String.valueOf(s1[i].charAt(0)).toUpperCase() + String.valueOf(s1[i].substring(1).toLowerCase());
			if (i < s1.length - 1)
				s2 += " ";
		}
		System.out.println(s2);
	}
}
