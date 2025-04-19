package com.java.thr;

public class ThrEx {

	public static void main(String[] args) {
		Thread t1 = new Thread(new First());
		Thread t2 = new Thread(new Second());
		Thread t3 = new Thread(new Third());
		
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
	}
}
