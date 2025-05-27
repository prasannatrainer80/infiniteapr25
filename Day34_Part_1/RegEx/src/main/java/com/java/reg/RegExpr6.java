package com.java.reg;

import java.util.regex.Pattern;

public class RegExpr6 {

	public static void main(String[] args) {
		// Checking all the strings using regex
		        System.out.println(Pattern.matches("[b-z]?",
		                                           "a"));
		        // Check if all the elements are in range a to z
		        // or A to Z
		        System.out.println(Pattern.matches("[a-zA-Z]+",
		                                           "GfgTestCase"));
		        // Check if elements is not in range a to z
		        System.out.println(Pattern.matches("[^a-z]?",
		                                           "g"));
		        // Check if all the elements are either g,e,k or s
		        System.out.println(Pattern.matches("[geks]*",
		                                           "geeksgeeks"));

		        System.out.println(Pattern.matches("[nit]*",
                        "niit"));
		        System.out.println(Pattern.matches("[infte]*", "infinite"));
	}
}
