package com.java.thr;

public class Third extends Thread {

	@Override
	public void run() {
		int f = 1;
		for(int i=1;i<=8;i++) {
			f = f * i;
			System.out.println("Factorial Value  " +f);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
