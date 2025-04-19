package com.java.thr;

public class ThrTest {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ArrayListEx());
		Thread t2 = new Thread(new VectorEx());
		Thread t3 = new Thread(new TreeSetEx());
		
		t1.start();
		t2.start();
		t3.start();
	}
}
