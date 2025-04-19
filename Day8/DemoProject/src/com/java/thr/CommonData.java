package com.java.thr;

class DataConsumer implements Runnable {

	CommonData commonData;
	
	DataConsumer(CommonData commonData) {
		this.commonData = commonData;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			commonData.consume(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}

class DataProducer implements Runnable {

	CommonData commonData;
	DataProducer(CommonData commonData) {
		this.commonData = commonData;
	}
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			commonData.produce(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class CommonData {

	private int result;
	private boolean flag = false;
	
	public synchronized void produce(int value) {
		while(flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		result = value;
		flag = true;
		System.out.println("Producer  " +result);
		notify();
	}
	
	public synchronized void consume(int value) {
		while(!flag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		result = value;
		flag = false;
		System.out.println("Consumer  " +result);
		notify();
	}
}
