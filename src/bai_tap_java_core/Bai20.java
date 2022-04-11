package bai_tap_java_core;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listLe = new ArrayList<Integer>();
		ArrayList<Integer> listChan = new ArrayList<Integer>();
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] % 2 == 0)
				listChan.add(arr[i]);
			else
				listLe.add(arr[i]);
		}

		System.out.println("Mang chan: " + listChan);
		System.out.println("Mang le: " + listLe);

	}
}
