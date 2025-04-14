package com.java.prop;

/**
 * Write Only Properties
 */
public class PropEx2 {

	private int sno;
	private String sname;
	
	public void setSno(int sno) {
		this.sno = sno;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
	
	@Override
	public String toString() {
		return "PropEx2 [sno=" + sno + ", sname=" + sname + "]";
	}

	public static void main(String[] args) {
		PropEx2 obj = new PropEx2();
		obj.setSno(1);
		obj.setSname("Raj");
		System.out.println(obj);
	}
}
