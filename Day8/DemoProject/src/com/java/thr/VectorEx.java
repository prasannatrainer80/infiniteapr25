package com.java.thr;

import java.util.Vector;

public class VectorEx implements Runnable {
	@Override
	public void run() {
		Vector<String> vector = new Vector<String>();
		vector.addElement("Premjeet");
		vector.addElement("Swati");
		vector.addElement("Nirmalya");
		vector.addElement("Anshu");
		vector.addElement("Usha");
		
		for (String string : vector) {
			System.out.println("Vector Data " +string);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
