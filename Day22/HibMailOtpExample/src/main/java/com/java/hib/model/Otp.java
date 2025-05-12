package com.java.hib.model;

public class Otp {

	private int otpId;
	private String userName;
	private int otpNo;
	private String nPassword;
	private String status;
	public int getOtpId() {
		return otpId;
	}
	public void setOtpId(int otpId) {
		this.otpId = otpId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getOtpNo() {
		return otpNo;
	}
	public void setOtpNo(int otpNo) {
		this.otpNo = otpNo;
	}
	public String getnPassword() {
		return nPassword;
	}
	public void setnPassword(String nPassword) {
		this.nPassword = nPassword;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Otp(int otpId, String userName, int otpNo, String nPassword, String status) {
		super();
		this.otpId = otpId;
		this.userName = userName;
		this.otpNo = otpNo;
		this.nPassword = nPassword;
		this.status = status;
	}
	public Otp() {

	}
	
	
}
