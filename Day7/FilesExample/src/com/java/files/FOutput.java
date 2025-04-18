package com.java.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOutput {

	public static void main(String[] args) {
		try {
			FileInputStream fin = 
			new FileInputStream("C:/JavaTraining_Infinite/Day6/EmployProject/src/com/java/employ/model/Employ.java");
			FileOutputStream fout = new FileOutputStream("c:/files/EmployNew.java");
			int ch;
			while((ch=fin.read()) != -1) {
				fout.write((char)ch);
			}
			fin.close();
			fout.close();
			System.out.println("File Copied");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
