package bai_tap_oop_qlns;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Staff> listStaff = new ArrayList<>();
	static ArrayList<Employee> listEmployee = new ArrayList<>();
	static ArrayList<Manager> listManager = new ArrayList<>();

	public static void main(String[] args) {
		// Create list staff
		Employee e1 = new Employee("E1", "Dao", "0943", 26);
		Employee e2 = new Employee("E2", "Dat", "0943", 24);
		Employee e3 = new Employee("E3", "Hien", "0943", 30);

		Manager m1 = new Manager("M1", "Be", "0123", 26);
		Manager m2 = new Manager("M2", "Thuy", "0123", 26);

		listEmployee.add(e1);
		listEmployee.add(e2);
		listEmployee.add(e3);
		listManager.add(m1);
		listManager.add(m2);

		boolean check = true;
		while (true) {
			System.out.println("<-------------MENU------------->");
			System.out.println("1. Enter infor company");
			System.out.println("2.Allocate staff to manager ");
			System.out.println("3. Add/Delete staff ");
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: {
				inCompany();
				break;
			}
			case 2: {
				// View list E
				System.out.println("List Employee: ");
				for (Employee e : listEmployee) {
					System.out.println(e.toString());
				}

				// View list M
				System.out.println("List Manager: ");
				for (Manager m : listManager) {
					System.out.println(m.toString());
				}

				System.out.println("Choice code employee: ");
				String choiceE = sc.nextLine();
				System.out.println("Choice code manager: ");
				String choiceM = sc.nextLine();

				for (Manager manager : listManager) {
					for (Employee employee : listEmployee) {
						if (manager.getCode().equals(choiceM) && employee.getCode().equals(choiceE)) {
							manager.incrementTotalEmp();
							employee.setManager(manager);
						}
					}

				}

				System.out.println("List Manager Added Employee: ");
				for (Manager m : listManager) {
					System.out.println(m.toString());
				}

				break;

			}
			
			case 3: {
				
				System.out.println("1. Add staff");
				System.out.println("2. Delete staff");
				System.out.println("Choice option: ");
				String choice2 = sc.nextLine();
				
				
			}
			}
		}

	}

	private static void inCompany() {
		Company c = new Company();
		System.out.println("Name");
		c.setName(sc.nextLine());
		System.out.println("Tax Code");
		c.setTaxCode(sc.nextLine());
		System.out.println("Income");
		c.setIncome(Double.parseDouble(sc.nextLine()));

		System.out.println("Added: " + c.toString());
	}

}
