package com.java.solid;

public class JavaTrgInfo {
	private JavaTrg javaTrg;

	public JavaTrgInfo(JavaTrg javaTrg) {
		this.javaTrg = javaTrg;
	}
	
	public void details() {
		javaTrg.trainerName();
		javaTrg.city();
	}
}
