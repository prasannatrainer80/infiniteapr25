package com.java.gen;

class Data<T> {
	
	public void swap(T a, T b) {
		T t;
		t = a;
		a = b;
		b = t;
		System.out.println("A value "+a+ " B value " +b);
	}
	
}

public class GenEx {
	public static void main(String[] args) {
		Employ employ1 = new Employ(1, "Harsh", 99252.22);
		Employ employ2 = new Employ(3, "Nirmalya", 99772.22);
		int a=12, b=13;
		Data data = new Data();
		data.swap(a, b);
		String s1="Sandhan", s2="Sourav";
		data.swap(s1, s2);
		boolean b1 = true, b2 = false;
		data.swap(b1, b2);
		data.swap(employ1, employ2);
	}
}
