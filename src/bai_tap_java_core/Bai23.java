package bai_tap_java_core;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = s.length();
		s = " " + s;
		boolean f[][] = new boolean[1000][1000];
		for (int i = 0; i <= n; i++) {
			f[i][i] = true;
		}
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i < j; i++) {
				if (s.charAt(i) == s.charAt(j) && i != j - 1) {
					f[i][j] = f[i + 1][j - 1];
				} else if (s.charAt(i) == s.charAt(j) && i == j - 1) {
					f[i][j] = true;
				} else
					f[i][j] = false;
			}
		}

		ArrayList<String> listPalindromic = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (f[i][j] == true)
					listPalindromic.add(s.substring(i, j));
			}
		}

		int arr[] = new int[listPalindromic.size()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = listPalindromic.get(i).length();
		}

		System.out.println(listPalindromic.get(getMaxPosition(arr)));

	}

	static int maxElement(int a[]) {
		int maxValue = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
		}
		return maxValue;
	}

	public static int getMaxPosition(int a[]) {
		int maxValue = maxElement(a);
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == maxValue) {
				index = i;
			}
		}
		return index;
	}
}
