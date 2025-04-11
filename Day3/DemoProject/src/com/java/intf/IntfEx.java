package com.java.intf;

public class IntfEx {

	public static void main(String[] args) {
		ITraining[] arr = new ITraining[] {
			new Adyashree(),
			new Ravi(),
			new Sandhan()
		};
		
		for (ITraining i : arr) {
			i.name();
			i.email();
		}
	}
}
