package buoi1;

import java.util.Scanner;

public class TestSwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean check = true;
		while (check) {
			System.out.println("0. thoat");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("vua chon 1");
				break;
			case 0:
				check = false;
				break;
			}
		}

	}
}
