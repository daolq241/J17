package buoi1;

public class TestPrintTable {
	public static void main(String[] args) {
		 System.out.println("-----------------------------------------------------------------------------");
	        System.out.printf("%10s %20s %5s %5s", "STUDENT ID", "NAME", "AGE", "GRADE");
	        System.out.println();
	        System.out.println("-----------------------------------------------------------------------------");
	        System.out.format("%10s %20s %5d %5c","D16", "Le Quang Dao", 24, 12);
	}
}
