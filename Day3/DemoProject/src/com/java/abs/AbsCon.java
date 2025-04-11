package com.java.abs;

public class AbsCon {
	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Swati(1, "Swati", 99992.44),
			new Purnendu(2, "Purnendu", 99992.21),
			new Premjeet(3, "Premjeet", 99922.32)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
