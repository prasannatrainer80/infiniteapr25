package com.java.day4;

import java.util.SortedSet;
import java.util.TreeSet;

public class CustomerMain {

	public static void main(String[] args) {
		SortedSet customers = new TreeSet();
		customers.add(new Customer(1, "Sambit", "Poori", 99234.22));
		customers.add(new Customer(2, "Satya", "Bhubaneshwar", 88999.22));
		customers.add(new Customer(3, "Hrudayananda", "Delhi", 98821.22));
		customers.add(new Customer(4, "Adyashree", "Pune", 90881.22));
		customers.add(new Customer(5, "Sulekha", "Mysore", 98722.22));
		
		System.out.println("Sorted Data ");
		for (Object object : customers) {
			Customer customer = (Customer)object;
			System.out.println(customer);
		}
	}
}
