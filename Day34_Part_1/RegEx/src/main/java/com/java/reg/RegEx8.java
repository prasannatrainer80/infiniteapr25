package com.java.reg;

import java.util.regex.Pattern;

public class RegEx8 {
	public static void main(String[] args) {
		String expr1 ="^infinite";
		String expr2 = "[a-z]+nite$";
		String expr3 ="[a-z]+te$";
		System.out.println(Pattern.matches(expr1,"infinite")); // true
		System.out.println(Pattern.matches(expr2,"infinite")); // true
		System.out.println(Pattern.matches(expr3,"infinite")); // true
		System.out.println(Pattern.matches(expr2, "INFINITE"));
		String expr4="[a-zA-Z]+TE$";
		System.out.println(Pattern.matches(expr4, "INFINITE"));
		String expr5="^[a][a-z]+";
		System.out.println(Pattern.matches(expr5, "ananth"));
		System.out.println(Pattern.matches(expr5, "sandhan"));
		String expr6="[a-zA-Z0-9]+";
		System.out.println(Pattern.matches(expr6, "Prasanna123"));
		String expr7="[0-9]{10}";
		System.out.println(Pattern.matches(expr7, "9987788991"));
		String expr8="[+][9][1][0-9]{10}";
		System.out.println(Pattern.matches(expr8, "+919987788991"));
		String expr9="[789][0-9]{9}";
		System.out.println(Pattern.matches(expr9, "9987788991"));
		System.out.println(Pattern.matches(expr9, "6987788991"));
		String expr10="[^a][a-z]+";
		System.out.println(Pattern.matches(expr10, "ananth"));
		System.out.println(Pattern.matches(expr10, "sandhan"));
		
	}
}
