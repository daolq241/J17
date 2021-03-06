package bai_tap_java_core;

import java.util.Arrays;
import java.util.Scanner;

public class Bai13 {

	public static float average(float sum, int n) {
		return sum / n;
	}

	public static int findMax(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	public static int findMin(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		return min;
	}

	public static boolean kiemTraSoDuong(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				return true;
		}
		return false;
	}

	public static boolean kiemTraSoAm(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0)
				return true;
		}
		return false;
	}

	public static int duongMax(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > 0) {
				if (a[i] > max)
					max = a[i];
			}
		}
		return max;
	}

	public static int duongMin(int a[]) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > 0) {
				if (a[i] < min)
					min = a[i];
			}
		}
		return min;
	}

	public static int amMax(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < 0) {
				if (a[i] > max)
					max = a[i];
			}
		}
		return max;
	}

	public static int amMin(int a[]) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < 0) {
				if (a[i] < min)
					min = a[i];
			}
		}
		return min;
	}

	public static void inChan(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0)
				System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void inLe(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1)
				System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// Find average
		float sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Average = " + average(sum, n));

		System.out.println("Max = " + findMax(arr));
		System.out.println("Min = " + findMin(arr));

		if (kiemTraSoDuong(arr)) {
			System.out.println("Ph???n t??? d????ng l???n nh???t l??: " + duongMax(arr) + ", " + "Ph???n t??? d????ng nh??? nh???t l??: "
					+ duongMin(arr));
		} else {
			System.out.println("Kh??ng c?? s??? d????ng n??o");
		}

		if (kiemTraSoAm(arr)) {
			System.out
					.println("Ph???n t??? ??m l???n nh???t l??: " + amMax(arr) + ", " + "Ph???n t??? ??m nh??? nh???t l??: " + amMin(arr));
		} else {
			System.out.println("Kh??ng c?? s??? ??m n??o");
		}

		System.out.print("C??c ph???n t??? ch???n l??: ");
		inChan(arr);
		System.out.print("C??c ph???n t??? l??? l??: ");
		inLe(arr);

		// Them 1 phan tu theo index
		System.out.println("Nh???p v??? tr?? v?? gi?? tr??? c???n th??m: ");
		int position = sc.nextInt();
		int value = sc.nextInt();

		int[] arrAddValue = new int[arr.length + 1];
		for (int i = 0; i < arrAddValue.length; i++) {
			if (i < position - 1) {
				arrAddValue[i] = arr[i];
			}
			if (i == (position - 1)) {
				arrAddValue[i] = value;
			}
			if (i > position - 1) {
				arrAddValue[i] = arr[i - 1];
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrAddValue));

		// Xoa 1 phan tu theo index
		int positionDel = sc.nextInt();
		int[] arrDel = new int[arr.length - 1];
		for (int i = 0; i < arrDel.length; i++) {
			if (i < positionDel - 1) {
				arrDel[i] = arr[i];
			}
			if (i >= positionDel - 1) {
				arrDel[i] = arr[i + 1];
			}

		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrDel));

	}
}
