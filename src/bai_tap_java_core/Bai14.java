package bai_tap_java_core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		ArrayList<Integer> arrList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			arrList.add(arr[i]);
		}

		ArrayList<Integer> arrTemp = new ArrayList<>();
		for (int i = 0; i < arrList.size(); i++) {
			if (!arrTemp.contains(arrList.get(i))) {
				arrTemp.add(arrList.get(i));
			}
		}
		System.out.println(arrTemp);
	}
}
