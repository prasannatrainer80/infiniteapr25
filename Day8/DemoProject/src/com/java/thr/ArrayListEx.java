package com.java.thr;

import java.util.ArrayList;

public class ArrayListEx implements Runnable {

	@Override
	public void run() {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Harsh");
		names.add("Sulekha");
		names.add("Abhishek");
		names.add("Saurabh");
		names.add("Ravikanth");
		for (String string : names) {
			System.out.println("ArrayList Data  " +string);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
