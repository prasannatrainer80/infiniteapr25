package com.java.jsf;

import java.util.Date;

public class DailyExpenses {

	private int expId;
	private int groupId;
	private Date expenseDate;
	private String expenseDescription;
	private int paidBy;
	private double amount;
	public int getExpId() {
		return expId;
	}
	public void setExpId(int expId) {
		this.expId = expId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public Date getExpenseDate() {
		return expenseDate;
	}
	public void setExpenseDate(Date expenseDate) {
		this.expenseDate = expenseDate;
	}
	public String getExpenseDescription() {
		return expenseDescription;
	}
	public void setExpenseDescription(String expenseDescription) {
		this.expenseDescription = expenseDescription;
	}
	public int getPaidBy() {
		return paidBy;
	}
	public void setPaidBy(int paidBy) {
		this.paidBy = paidBy;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public DailyExpenses(int expId, int groupId, Date expenseDate, String expenseDescription, int paidBy,
			double amount) {
		super();
		this.expId = expId;
		this.groupId = groupId;
		this.expenseDate = expenseDate;
		this.expenseDescription = expenseDescription;
		this.paidBy = paidBy;
		this.amount = amount;
	}
	public DailyExpenses() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DailyExpenses [expId=" + expId + ", groupId=" + groupId + ", expenseDate=" + expenseDate
				+ ", expenseDescription=" + expenseDescription + ", paidBy=" + paidBy + ", amount=" + amount + "]";
	}
	
}
