package com.java.solid.ocp;

public class BillOcp {
	
	public void showBillInfo(int meterId, String personName, IElectricity iElectricity) {
		System.out.println("Meter Id " +meterId);
		System.out.println("Payment from Mr/Miss/Mrs " +personName);
		System.out.println("Paymode is  " +iElectricity.payment(2000));
	}
	
	
	public static void main(String[] args) {
		IElectricity billSource;
		
		BillOcp ocp = new BillOcp();
		
		billSource = new CreditCard();
		
		ocp.showBillInfo(6624, "RamKishan", billSource);
		
		billSource = new DebitCard();
		ocp.showBillInfo(6626, "Kiran", billSource);
		
		billSource = new NetBanking();
		ocp.showBillInfo(6628, "Bala", billSource);
		
		/* Extended Code for Provision PhonePe */
		billSource = new PhonePe();
		ocp.showBillInfo(6630, "Mishra", billSource);
		
	}
}
