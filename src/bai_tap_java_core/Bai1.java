package bai_tap_java_core;

public class Bai1 {
	public static void starEqual1() {
		System.out.println("* * * * * * ==========================\n"
				+		 " * * * * *  ==========================");
	}
	public static void starEqual2() {
		System.out.println("* * * * * * ==========================");
	}
	
	public static void equal() {
		System.out.println("======================================");
	}
	public static void main(String[] args) {
		starEqual1();
		starEqual1();
		starEqual1();
		starEqual2();
		equal();
		equal();
		equal();
		equal();
		equal();
		equal();
	}
}
