package com.java.thr;

public class First extends Thread {
	@Override
	public void run() {
		for(int i=0;i<20;i+=2) {
			System.out.println("Even  " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
