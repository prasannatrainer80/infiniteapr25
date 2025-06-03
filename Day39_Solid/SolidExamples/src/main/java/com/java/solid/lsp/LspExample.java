package com.java.solid.lsp;

public class LspExample {
	public static void main(String[] args) {
		Details[] obj = new Details[] {
				new Anshu(),
				new Abhishek(),
				new Sandiya()
		};
		
		for (Details details : obj) {
			details.showInfo();
		}
	}
}
