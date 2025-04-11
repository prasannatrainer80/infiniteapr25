package com.java.sup;

class Employ {
	int empno;
	String name;
	double basic;
	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}

class Ravi extends Employ {
	public Ravi(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

class Sourav extends Employ {
	public Sourav(int empno, String name, double basic) {
		super(empno, name, basic);
	}
}

public class SupCon {
	public static void main(String[] args) {
		Employ employ1 = new Ravi(1, "Ravi", 99245.22);
		Employ employ2 = new Sourav(2, "Sourav", 99922.44);
		Employ[] arr = new Employ[] {employ1,employ2};
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
