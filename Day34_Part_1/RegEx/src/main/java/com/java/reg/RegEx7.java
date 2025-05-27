package com.java.reg;

import java.util.regex.Pattern;

public class RegEx7 {

	public static void main(String[] args) {
        // Check if all elements are numbers
        System.out.println(Pattern.matches("\\d+", "1234"));
        // Check if all elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "1234"));
        // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg"));
        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "gfg"));

	}
}
