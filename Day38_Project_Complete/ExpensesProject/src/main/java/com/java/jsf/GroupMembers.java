package com.java.jsf;

public class GroupMembers {
	
	private int gmId;
	private int groupId;
	private int userId;
	private double amountCollected;
	
	public int getGmId() {
		return gmId;
	}
	public void setGmId(int gmId) {
		this.gmId = gmId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public double getAmountCollected() {
		return amountCollected;
	}
	public void setAmountCollected(double amountCollected) {
		this.amountCollected = amountCollected;
	}
	public GroupMembers() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GroupMembers [gmId=" + gmId + ", groupId=" + groupId + ", userId=" + userId + ", amountCollected="
				+ amountCollected + "]";
	}
	
	
}
