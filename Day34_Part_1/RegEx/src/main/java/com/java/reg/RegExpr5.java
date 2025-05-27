package com.java.reg;

import java.util.regex.Pattern;

public class RegExpr5 {
	public static void main(String[] args) {
        // Checks if the string matches with the regex11
        // Should be single character a to z12
        System.out.println(Pattern.matches("[a-z]","g"));
        // Check if the element is range a to z or A to Z
        System.out.println(Pattern.matches("[a-zA-Z]",
                                           "Gfg"));

	}
	
}
