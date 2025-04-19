package com.java.thr;

public class WaitExample {

	public static void main(String[] args) {
		CommonData commonData = new CommonData();
		DataProducer producer = new DataProducer(commonData);
		DataConsumer consumer = new DataConsumer(commonData);
		Thread t1 = new Thread(producer);
//		Thread t2 = new Thread(consumer);
		t1.start();
//		t2.start();
	}
}
