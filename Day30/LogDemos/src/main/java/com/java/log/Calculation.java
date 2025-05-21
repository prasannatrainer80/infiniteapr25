package com.java.log;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.log4j.Logger;

public class Calculation {
	private static final Logger log = Logger.getLogger("com.java.log.Calculation");
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 Numbers   ");
		try {
			a = sc.nextInt();
			b = sc.nextInt();
			c = a / b;
			System.out.println("Division  " + c);
			log.info("Program Executed with no Exceptions");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero not possible...");
			log.error("Customer Error Division By Zero Not Possible...");
		} catch (InputMismatchException e) {
			System.out.println("String cannot be Converted as integer");
			log.error("Custom Error String cannot be Converted as integer");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
