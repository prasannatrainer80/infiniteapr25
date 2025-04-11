package com.java.p2;

import com.java.p1.Demo;

public class Training extends Demo {

	public void show() {
		Training training = new Training();
		System.out.println(training.protectedStr);
		System.out.println(training.publicStr);
	}
}
