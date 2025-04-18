package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

	public static void main(String[] args) {
		File file = 
			new File("C:/JavaTraining_Infinite/Day6/EmployProject/src/com/java/employ/model/Employ.java");
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
