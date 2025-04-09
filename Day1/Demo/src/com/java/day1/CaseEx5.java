package com.java.day1;

public class CaseEx5 {
	public String show(int dayNo) {
		String result = switch(dayNo) {
		case 1 : {
			yield "Its Sunday...";
		}
		case 2 : {
			yield "Its Monday...";
		}
		case 3 : {
			yield "Its Tuesday...";
		}
		case 4 : {
			yield "Its Wednesday...";
		}
		case 5 : {
			yield "Its Thursday...";
		}
		case 6 : {
			yield "Its Friday...";
		}
		case 7 : {
			yield "Its Saturday...";
		}
		default : {
			yield "Invalid Value...";
		}
		};
		return result;
	}
	public static void main(String[] args) {
		int dayNo = 3;
		CaseEx5 obj = new CaseEx5();
		System.out.println(obj.show(dayNo));
	}
}
