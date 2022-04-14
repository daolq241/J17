package buoi1;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 100; int y = 200;
		int temp = x;
		x = y;
		y = temp;
		 System.out.println("X = " + x + " Y = " + y);
		
//		System.out.println("x dau  = " + x);
//		giamMot(x);
//		System.out.println("x sau  = " + x);
	}

	public static int giamMot(int x) {

		return(x-=1);
		
	}
}
