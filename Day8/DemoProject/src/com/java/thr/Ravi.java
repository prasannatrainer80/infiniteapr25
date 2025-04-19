package com.java.thr;

public class Ravi implements Runnable {

	Resource resource;
	Ravi(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		resource.showMsg("Ravi");
	}

}
