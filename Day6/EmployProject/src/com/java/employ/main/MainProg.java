package com.java.employ.main;

import java.util.List;
import java.util.Scanner;

import com.java.employ.bal.EmployBal;
import com.java.employ.exception.EmployException;
import com.java.employ.model.Employ;
import com.java.employ.model.Gender;

public class MainProg {

	static Scanner sc;
	static EmployBal employBal;
	
	static {
		sc = new Scanner(System.in);
		employBal = new EmployBal();
	}
	
	public static void main(String[] args) {
		int choice = 0;
		do {
			System.out.println("1. Add Employ");
			System.out.println("2. Show Employ");
			System.out.println("3. Search Employ");
			System.out.println("4. Delete Employ");
			System.out.println("5. Update Employ");
			System.out.println("6. Exit");
			System.out.println("Enter Your Choice  ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				try {
					addEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 2 : 
				showEmployMain();
				break;
			case 3 : 
				searchEmployMain();
				break;
			case 4 : 
				deleteEmployMain();
				break;
			case 5 : 
				try {
					updateEmployMain();
				} catch (EmployException e) {
					System.err.println(e.getMessage());
				}
				break;
			case 6 : 
				return;
			}
		} while(choice!=6);
	}
	
	public static void updateEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		System.out.println(employBal.updateEmployBal(employ));
	}
	
	public static void deleteEmployMain() {
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		System.out.println(employBal.deleteEmployBal(empno));
	}
	
	public static void searchEmployMain() {
		int empno;
		System.out.println("Enter Employ Number   ");
		empno = sc.nextInt();
		Employ employFound = employBal.searchEmployBal(empno);
		if (employFound != null) {
			System.out.println(employFound);
		} else {
			System.out.println("*** Employ Record Not Found ***");
		}
	}
	
	public static void showEmployMain() {
		List<Employ> employList = employBal.showEmployBal();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
	
	public static void addEmployMain() throws EmployException {
		Employ employ = new Employ();
		System.out.println("Enter Employ No  ");
		employ.setEmpno(sc.nextInt());
		System.out.println("Enter Name  ");
		employ.setName(sc.next());
		System.out.println("Enter Gender (MALE/FEMALE)  ");
		employ.setGender(Gender.valueOf(sc.next()));
		System.out.println("Enter Department  ");
		employ.setDept(sc.next());
		System.out.println("Enter Designation  ");
		employ.setDesig(sc.next());
		System.out.println("Enter Basic  ");
		employ.setBasic(sc.nextDouble());
		System.out.println(employBal.addEmployBal(employ));
	}
}
