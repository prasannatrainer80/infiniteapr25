package com.java.thr;

public class Resource {

	synchronized void showMsg(String name) {
		System.out.print("Hello " +name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(" How are You...");
	}
}
