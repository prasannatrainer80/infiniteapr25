package com.java.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadEx {

	public static void main(String[] args) {
		File file = 
				new File("C:/JavaTraining_Infinite/Day6/EmployProject/src/com/java/employ/model/Employ.java");
		try {
			FileReader fr = new FileReader(file);
			int ch;
			while((ch=fr.read()) != -1) {
				System.out.print((char)ch);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
