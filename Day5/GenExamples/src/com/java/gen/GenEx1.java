package com.java.gen;

class Demo<T, V> {
	
	T t;
	V v;
	
	public Demo(T t, V v) {
		super();
		this.t = t;
		this.v = v;
	}

	@Override
	public String toString() {
		return "Demo [t=" + t + ", v=" + v + "]";
	}
}

public class GenEx1 {
	public static void main(String[] args) {
		Employ employ1 = new Employ(1, "Zainab", 99252.22);
		Demo demo1 = new Demo(1, "Sulekha");
		System.out.println(demo1);
		Demo demo2 = new Demo("SatyaPrakash", 88884.22);
		System.out.println(demo2);
		Demo demo3 = new Demo(5, employ1);
		System.out.println(demo3);
	}
}
