package com.java.day4;

public class Customer implements Comparable {
	int custId;
	String custName;
	String city;
	double billAmount;
	public Customer() {

	}
	public Customer(int custId, String custName, String city, double billAmount) {
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", billAmount=" + billAmount
				+ "]";
	}
	@Override
	public int compareTo(Object o) {
		Customer customer = (Customer)o;
		return custName.compareTo(customer.custName);
	}
}
