package com.java.solid;

public class DotnetTrgInfo {
	private DotnetTrg dotnetTrg;

	public DotnetTrgInfo(DotnetTrg dotnetTrg) {
		this.dotnetTrg = dotnetTrg;
	}
	
	public void details() {
		dotnetTrg.trainerName();
		dotnetTrg.city();
	}
}
