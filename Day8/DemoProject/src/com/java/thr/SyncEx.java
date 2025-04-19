package com.java.thr;

public class SyncEx {
	public static void main(String[] args) {
		Resource resource = new Resource();
		Ravi ravi = new Ravi(resource);
		Ishani ishani = new Ishani(resource);
		Sandhan sandhan = new Sandhan(resource);
		
		new Thread(ravi).start();
		new Thread(ishani).start();
		new Thread(sandhan).start();
	}
}
