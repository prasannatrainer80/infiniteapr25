package com.java.solid.ocp;

public class NetBanking implements IElectricity {

	@Override
	public String payment(double billAmount) {
		return "Your Bill AMount is " +billAmount +" through payment NetBanking...";
	}

}
