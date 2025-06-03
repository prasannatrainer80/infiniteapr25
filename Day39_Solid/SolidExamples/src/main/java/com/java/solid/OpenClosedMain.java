package com.java.solid;

public class OpenClosedMain {

	public void showInfo(Object ob) {
		if (ob instanceof JavaTraining) {
			JavaTraining obj1 = (JavaTraining)ob;
			obj1.show();
			obj1.timing();
		}
		if (ob instanceof DotnetTraining) {
			DotnetTraining obj2 = (DotnetTraining)ob;
			obj2.show();
			obj2.timing();
		}
		
		if (ob instanceof SapTraining) {
			SapTraining obj3 = (SapTraining)ob;
			obj3.show();
			obj3.timing();
		}
	}
	
	public static void main(String[] args) {
		JavaTraining javaTraining = new JavaTraining();
		OpenClosedMain ocm = new OpenClosedMain();
		ocm.showInfo(javaTraining);
	}
}
