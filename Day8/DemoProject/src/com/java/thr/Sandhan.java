package com.java.thr;

public class Sandhan implements Runnable {

	Resource resource;
	
	Sandhan(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		resource.showMsg("Sandhan");
	}

}
