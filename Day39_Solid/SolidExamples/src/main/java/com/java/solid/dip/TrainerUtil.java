package com.java.solid.dip;

public class TrainerUtil {
	
	private ITrainerData iTrainerData;

	public TrainerUtil(ITrainerData iTrainerData) {
		this.iTrainerData = iTrainerData;
	}
	
	public void showTrainerInfo() {
		iTrainerData.name();
		iTrainerData.city();
		iTrainerData.email();
	}
}
