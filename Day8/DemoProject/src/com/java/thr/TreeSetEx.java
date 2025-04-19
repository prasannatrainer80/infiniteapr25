package com.java.thr;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEx implements Runnable {

	@Override
	public void run() {
		SortedSet<String> names = new TreeSet<String>();
		names.add("Ravikanth");
		names.add("Zainab");
		names.add("Samiksha");
		names.add("Sandhan");
		names.add("Satya Prakash");
		names.add("Ravikanth");
		names.add("Zainab");
		names.add("Samiksha");
		names.add("Sandhan");
		names.add("Satya Prakash");
		names.add("Ravikanth");
		names.add("Zainab");
		names.add("Samiksha");
		names.add("Sandhan");
		names.add("Satya Prakash");
		for (String string : names) {
			System.out.println("Treeset Data " +string);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
