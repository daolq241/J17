package buoi1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arrayNumber = {1, 3, 4, 2, 5};
		int[] arrN = new int[] {1,2,3};
		
		System.out.println(Arrays.toString(arrayNumber));
		
		String[] arrayString = {"a","b","c", "d"};
		for (int i : arrayNumber) {
			System.out.println(i);
		}
		String[] arrS = new String[3];
		System.out.println(Arrays.toString(arrS));
		int[] arrCopy = Arrays.copyOf(arrayNumber, 3);
		System.out.println(Arrays.toString(arrCopy));
		
		//=====================
		String s1 = "Dao";
		String s2 = "dao";
		String result = (s1==s2)? "Bang nhau" : "Khac nhau";
		System.out.println(result);
		
		//=========================
		float x = 8;
		double y = 2.5d;
		System.out.println(x + " " + y);
		
		//================
		int a = 5;
		String s = "";
		System.out.println(s+=a);
		
	}
}
