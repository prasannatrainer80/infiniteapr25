package com.java.jsf;

import java.util.Date;

public class TravelGroup {

	private int groupId;
	private int createdBy;
	private String groupName;
	private Date startDate;
	private Date endDate;
	private double initialAmount;
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public double getInitialAmount() {
		return initialAmount;
	}
	public void setInitialAmount(double initialAmount) {
		this.initialAmount = initialAmount;
	}
	public TravelGroup(int groupId, int createdBy, String groupName, Date startDate, Date endDate,
			double initialAmount) {
		this.groupId = groupId;
		this.createdBy = createdBy;
		this.groupName = groupName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.initialAmount = initialAmount;
	}
	@Override
	public String toString() {
		return "TravelGroup [groupId=" + groupId + ", createdBy=" + createdBy + ", groupName=" + groupName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", initialAmount=" + initialAmount + "]";
	}
	public TravelGroup() {
		// TODO Auto-generated constructor stub
	}
	
	
}
