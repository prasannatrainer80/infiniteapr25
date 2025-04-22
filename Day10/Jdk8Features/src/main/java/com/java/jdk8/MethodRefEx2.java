package com.java.jdk8;

class StrOps {
	
	public int strLen(String str) {
		int len =0;
		char[] ch = str.toCharArray();
		for (char c : ch) {
			len++;
		}
		return len;
	}
}

public class MethodRefEx2 {
	public static void main(String[] args) {
		StrOps obj = new StrOps();
		IStrEx ex1 = obj::strLen;
		System.out.println("Length  " +ex1.length("Welcome to Java"));
	}
}
