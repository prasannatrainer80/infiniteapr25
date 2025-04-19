package com.java.thr;

class Exam implements Runnable {

	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				if (i==5) {
					System.out.println("Thread is Waiting at Index  " +i);
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class ThrWait {
	public static void main(String[] args) {
		Exam exam = new Exam();
		Thread t1 = new Thread(exam);
		t1.start();
//		new Thread(new Exam()).start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		synchronized (exam) {
			System.out.println("Main Program Resuming Your Thread  ");
			exam.notify();
		}
	}
}
