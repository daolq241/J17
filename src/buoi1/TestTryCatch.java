package buoi1;

public class TestTryCatch {
	public static void main(String[] args) {
		int t = 5;
		try {
				System.out.println(t/0);
		// bat dc ngoai le, thoat try ngay lap tuc
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		System.out.println("finished");
	
	}

}
