package bai_tap_oop;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Student> listStudent = new ArrayList<>();
	public static void main(String[] args) {
		boolean check = true;
		while(check) {
			System.out.println(">>>>>>>>MENU>>>>>>>>");
			System.out.println("1. Enter info student");
			System.out.println("2. Show all student");
			System.out.println("3. Calculator average student");
			System.out.println("4. Show evaluation");
			System.out.println("5. Show student has max average point");
			System.out.println("6. Show student has evaluation poor");
			System.out.println("7. Search student by name");
			System.out.println("8. Search student by code");
			System.out.println("0. Exit");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1: {
				inStudent();
				break;
			}
			case 2 : {
				showStudent();
				break;
			}
			case 3 : {
				System.out.println("Calculation Average Student: ");
				for(int i = 0; i < listStudent.size(); i++) {
					Student s = listStudent.get(i);
					s.setAverage(calcAverage(s));
					System.out.println("Name: " + s.getName() + "\t" +  "Average point: " + s.getAverage());
				}
				break;
			}
			
			case 4 : {
				System.out.println("Evaluation Student: ");
				for (Student s : listStudent) {
						System.out.println("Name: " + s.getName() + "\t" + "Rank: " + rank(s.getAverage()));
				}
				break;
			}
			
			case 5 : {
				System.out.println("List student has max average point: ");
				double maxAvg = listStudent.get(0).getAverage();
				for (Student s : listStudent) {
					if(s.getAverage() > maxAvg)
						maxAvg = s.getAverage();
				}
				for (Student s : listStudent) {
					if(s.getAverage() == maxAvg) 
						System.out.println("Name: " + s.getName() + "\t" + "Average: " + s.getAverage());
				}
				break;
			}
			
			case 6:  {
			System.out.println("List student has evaluation Poor: ");
				for (Student s : listStudent) {
					if(s.getAverage() < 5.0) 
						System.out.println("Name: " + s.getName());
				}	
			}
			
			case 7: {
				System.out.println("Search student by name: ");
				String name = sc.nextLine();
				System.out.println("Result:");
				for (Student s : listStudent) {
					if(s.getName().contains(name)) {
						System.out.println(s.getName());
					}
				}
				break;
			}
			
			case 8: {
				System.out.println("Search student by code: ");
				String code = sc.nextLine();
				System.out.println("Result:");
				for (Student s : listStudent) {
					if(s.getName().contains(code)) {
						System.out.println(s.getCode());
					}
				}
				break;
			}
			
			case 9: {
				System.out.println("Delete student by code: ");
				String code = sc.nextLine();
				System.out.println("Result:");
				for (Student s : listStudent) {
					if(s.getName().contains(name)) {
						System.out.println(s.getName());
					}
				}
			}
				
			case 0 : {
				check = false;
				break;
			}
			}
			
			
		}
		
		
	}
	public static  void inStudent() {
		System.out.println("Enter quantity student: ");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			Student s = new Student(sc.nextLine(),sc.nextLine(), sc.nextDouble() , sc.nextDouble(), sc.nextDouble());
			listStudent.add(s);
			sc.nextLine();
		}
		System.out.println("Added " + n + " students");
		
	}
	public static void showStudent() {
		for(int i =0; i<listStudent.size(); i++) {
			System.out.println(listStudent.get(i).toString());
		}
	}
	public static double calcAverage(Student s) {
		return ((s.getMathPoint() + s.getPhysicPoint() + s.getChemistryPoint())/3);
	}
	
	public static String rank(double average) {
		if(average >= 9.0 && average <= 10.0)
			return "Excellent";
		if(average >= 8.0 && average < 9.0)
			return "VeryGood";
		if(average >= 6.5 && average< 8.0)
			return "Good";
		if(average >= 5.0 && average< 6.5)
			return "Average";
		return "Poor";
	}
	
}
