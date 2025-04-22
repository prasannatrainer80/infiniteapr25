package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class FilteredExample1 {
	
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Avesh", 48234));
		employList.add(new Employ(2, "Lata", 90323));
		employList.add(new Employ(3, "Chetan", 77423));
		employList.add(new Employ(4, "Subodh", 46533));
		employList.add(new Employ(5, "Azhar", 90323));
		employList.add(new Employ(6, "Priya", 49999));
		
		System.out.println("Employ List Records are Whose Sal > 75000 ");
		employList.stream().filter(x -> 
			x.getBasic() >= 75000).forEach(System.out::println);
		
		System.out.println("Employ List whose name starts with 'A'  ");
		employList.stream().filter(x -> x.getName().startsWith("A"))
		.forEach(System.out::println);
	}
}
