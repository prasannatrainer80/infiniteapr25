package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;

public class MaxMin {
	public static void main(String[] args) {
		List<Employ> employList = new ArrayList<Employ>();
		employList.add(new Employ(1, "Avesh", 48234));
		employList.add(new Employ(2, "Lata", 99998));
		employList.add(new Employ(3, "Chetan", 77423));
		employList.add(new Employ(4, "Subodh", 46533));
		employList.add(new Employ(5, "Azhar", 90323));
		employList.add(new Employ(6, "Priya", 49999));
		
		Employ employ1 = employList.stream().max((m1,m2) -> 
			m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println(employ1);
	
		Employ employ2 = employList.stream().min((m1,m2) -> 
			m1.getBasic() > m2.getBasic() ? 1 : -1).get();
		System.out.println(employ2);
	}
}
