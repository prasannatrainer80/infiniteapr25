package com.java.solid.ocp;

public class OpenClosedExample {
	
	public void showInfo(ITraining iTraining) {
		iTraining.info();
		iTraining.timing();
	}
	
	public static void main(String[] args) {
		JavaTraining jt = new JavaTraining();
		OpenClosedExample ocp = new OpenClosedExample();
		ocp.showInfo(jt);
		
		DotnetTraining dt = new DotnetTraining();
		ocp.showInfo(dt);
		
		PythonTraining pt = new PythonTraining();
		ocp.showInfo(pt);
	}
}
