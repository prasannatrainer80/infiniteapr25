package com.java.thr;

public class C2 extends C1 implements Runnable {

	@Override
	public void run() {
		System.out.println("Derived Thread  ");
		show("Ananta");
	}

}
