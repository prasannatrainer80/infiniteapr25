package com.java.p1;

public class Demo {

	private String privateStr="Hello";
	public String publicStr="Java";
	protected String protectedStr="Infinite";
	String friendStr="Testing";
	
	public void show() {
		System.out.println(privateStr);
		System.out.println(publicStr);
		System.out.println(protectedStr);
		System.out.println(friendStr);
	}
}
