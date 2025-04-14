package com.java.prop;

public class PropEx3 {

	private int empno;
	private String sname;
	private double basic;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public static void main(String[] args) {
		PropEx3 obj = new PropEx3();
		obj.setEmpno(1);
		obj.setSname("Sulekha");
		obj.setBasic(88772.44);
		System.out.println("Employ No  " +obj.getEmpno());
		System.out.println("Employ Name  " +obj.getSname());
		System.out.println("Basic  " +obj.getBasic());
	}
}
