package com.java.files;

import java.io.File;

public class FileExample1 {

	public static void main(String[] args) {
		File file = new File("C:/JavaTraining_Infinite/Day6/EmployProject/src/com/java/employ/model/Employ.java");
		System.out.println("File Name  " +file.getName());
		System.out.println("Parent  " +file.getParent());
		System.out.println("Path  " +file.getPath());
	}
}
