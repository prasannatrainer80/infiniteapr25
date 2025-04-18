package com.java.files;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInEx {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("c:/files/dataout.txt");
			DataInputStream din = new DataInputStream(fin);
			int x = din.readInt();
			String str = din.readUTF();
			boolean flag = din.readBoolean();
			double bas = din.readDouble();
			System.out.println("X value  " +x);
			System.out.println("Str Value  " +str);
			System.out.println("Flag  " +flag);
			System.out.println("Salary " +bas);
			din.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
