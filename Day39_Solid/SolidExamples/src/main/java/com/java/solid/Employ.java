package com.java.solid;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employ {

	private int empno;
	private String name;
	private double basic;
	
	static List<Employ> employList;
	
	static {
		employList = new ArrayList<Employ>();
	}
	
	public List<Employ> showEmploy() {
		return employList;
	}
	
	public String addEmploy(Employ employ) {
		employList.add(employ);
		return "Employ Record Added...";
	}
}
