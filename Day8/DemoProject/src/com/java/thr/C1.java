package com.java.thr;

public class C1 {

	public void show(String str) {
		System.out.print("Welcome to " +str);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" How are You...");
	}
}
