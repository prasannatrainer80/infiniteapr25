package com.java.files;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutEx {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("c:/files/dataout.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(23);
			dout.writeUTF("Hello");
			dout.writeBoolean(true);
			dout.writeDouble(88882.44);
			dout.close();
			fout.close();
			System.out.println("Data Stored");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
