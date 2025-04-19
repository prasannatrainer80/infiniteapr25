package com.java.thr;

public class Ishani implements Runnable {

	Resource resource;
	
	Ishani(Resource resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		resource.showMsg("Ishani");
	}

}
