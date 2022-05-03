package bai_tap_oop_qlns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import bai_tap_oop_qlns.Staff;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Staff> listStaffs = new ArrayList<>();
	static ArrayList<Employee> listEmployees = new ArrayList<>();
	static ArrayList<Manager> listManagers = new ArrayList<>();
	static ArrayList<Director> listDirectors = new ArrayList<>();

	public static void main(String[] args) {
		// Create list staff
		Employee e1 = new Employee("E1", "Dao", "0943", 26);
		Employee e2 = new Employee("E2", "Dat", "0943", 24);
		Employee e3 = new Employee("E3", "Hien", "0943", 30);
		listEmployees.add(e1);
		listEmployees.add(e2);
		listEmployees.add(e3);

		Manager m1 = new Manager("M1", "Be", "0123", 26);
		Manager m2 = new Manager("M2", "Thuy", "0123", 26);
		listManagers.add(m1);
		listManagers.add(m2);

		boolean check = true;
		while (true) {
			System.out.println("<-------------MENU------------->");
			System.out.println("1. Enter infor company");
			System.out.println("2. Allocate staff to manager ");
			System.out.println("3. Add/Delete staff ");
			System.out.println("4. Show all staff in company");
			System.out.println("5. Show total salary all staff");
			System.out.println("6. Find employee has max salary");
			System.out.println("7. Find manager has max employee");
			System.out.println("8. Sort all staff for name");
			System.out.println("9. Sort all staff for decrease salary ");
			System.out.println("10. Find director  ");
			
			System.out.println("0. Exit");
			
			int choice = Integer.parseInt(sc.nextLine());
			switch (choice) {
			case 1: {
				inCompany();
				break;
			}
			case 2: {
				// View list E
				System.out.println("List Employee: ");
				for (Employee e : listEmployees) {
					System.out.println(e.toString());
				}

				// View list M
				System.out.println("List Manager: ");
				for (Manager m : listManagers) {
					System.out.println(m.toString());
				}

				System.out.println("Choice code employee: ");
				String choiceE = sc.nextLine();
				System.out.println("Choice code manager: ");
				String choiceM = sc.nextLine();

				for (Manager manager : listManagers) {
					for (Employee employee : listEmployees) {
						if (manager.getCode().equals(choiceM) && employee.getCode().equals(choiceE)) {
							manager.incrementTotalEmp();
							employee.setManager(manager);
						}
					}

				}

				System.out.println("List Manager Added Employee: ");
				for (Manager m : listManagers) {
					System.out.println(m.toString());
				}

				break;

			}
			
			case 3: {
				boolean check3 = true;
				while(check3) {
				
						System.out.println("<----------Add / Delete Staff -------->");
						System.out.println("1. Add Employee");
						System.out.println("2. Add Manager");
						System.out.println("3. Add Director");
						System.out.println("4. Delete Staff ");
						System.out.println("0. Back");
						System.out.println("Choice option: ");
						int choiceAddDel = Integer.parseInt(sc.nextLine());
						switch (choiceAddDel) {
						case 1: {
							Employee e = new Employee();
							e.inStaff(sc);
							listEmployees.add(e);
							System.out.println(e.toString());
							listStaffs.add(e);
							break;
						}
						
						case 2: {
							Manager m = new Manager();
							m.inStaff(sc);
							listManagers.add(m);
							System.out.println(m.toString());
							listStaffs.add(m);
							break;
						}
						
						
						case 3: {
							Director d = new Director();
							d.inStaff(sc);
							listDirectors.add(d);
							System.out.println(d.toString());
							listStaffs.add(d);
//							System.out.println(listStaffs);
							break;
							
						}
						case 4: {
							System.out.println("Choose staff code need delete: ");
							String staffCode = sc.nextLine();
							if(isStaffExists(staffCode, listStaffs)) {
								
								// Delete Employee
								if(isEmployee(staffCode, listEmployees)) {
									for (int i = 0; i < listEmployees.size(); i++) {
										if(listEmployees.get(i).getCode().equals(staffCode)) {
											Manager m = listEmployees.get(i).getManager();
											if(m != null) {
												m.decrementTotalEmp();
											}
											listEmployees.remove(listEmployees.get(i));
										}
									}
								}
								
								// Delete Director
								if (isDirector(staffCode, listDirectors)) {
									for(int i =0; i<listDirectors.size(); i++) {
										if(listDirectors.get(i).getCode().equals(staffCode)) {
											listDirectors.remove(listDirectors.get(i));
										}
									}
								}
								
								// Delete Manager
								if(isManager(staffCode, listManagers)) {
									for(int i =0; i<listManagers.size();i++) {
										Manager m = listManagers.get(i);
										if(m.getCode().equals(staffCode)) {
											for(int j = 0; j < listEmployees.size(); j++) {
												Employee e = listEmployees.get(i);
												if(e.getManager() != null) {
//													if()
												}
											}
										}
									}
								}
								
							}
							break;
						}
						
						case 0: {
							check3 = false;
							break;
						}

						}
					
					}
				}
				
			
			case 0:
				check = false;
				break;
			
			
			}
		}

	}

	private static boolean isManager(String staffCode, ArrayList<Manager> listManagers) {
		// TODO Auto-generated method stub
		for (Manager manager : listManagers) {
			if(manager.getCode().equals(staffCode)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isEmployee(String staffCode, ArrayList<Employee> listEmployees) {
		// TODO Auto-generated method stub
		for (Employee employee : listEmployees) {
			if(employee.getCode().equals(staffCode)) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean isDirector(String staffCode, ArrayList<Director> listDirectors) {
		// TODO Auto-generated method stub
		for (Director director : listDirectors) {
			if(director.getCode().equals(staffCode)) {
				return true;
			}
		}
		return false;
	}

	private static boolean isStaffExists(String code, ArrayList<Staff> listStaffs) {
		// TODO Auto-generated method stub
		for (Staff staff : listStaffs) {
			if(staff.getCode().equals(code)) {
				return true;
			}
		}
		return false;
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
