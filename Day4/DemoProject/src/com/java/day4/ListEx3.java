package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List employs = new ArrayList();
		employs.add(new Employ(1, "Zainab", 99234.22));
		employs.add(new Employ(2, "Nirmalya", 88899.22));
		employs.add(new Employ(3, "Abhishek", 91124.22));
		employs.add(new Employ(4, "Purnendu", 89024.22));
		employs.add(new Employ(5, "Harsh", 90662.22));
		System.out.println("Employ List  ");
		for (Object object : employs) {
			Employ employ = (Employ)object;
			System.out.println(employ);
		}
		
	}
}
