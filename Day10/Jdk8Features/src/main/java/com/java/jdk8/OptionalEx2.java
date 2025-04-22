package com.java.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalEx2 {
	
	   static List<Employ> employList;

	    static {
	                employList = new ArrayList<Employ>();
	                employList.add(new Employ(1,"Himanshu",85233));
	                employList.add(new Employ(2,"Harshita",90833));
	                employList.add(new Employ(3,"Ilayarani",91145));
	                employList.add(new Employ(4,"Hari Prasad",78667));
	    }

	    public Employ searchEmp(int empno) {
	        Employ empFound = null;
	        for(Employ e : employList) {
	            if (e.getEmpno()==empno) {
	                empFound=e;
	            }
	        }
	        return empFound;
	    }
	    
	    public static void main(String[] args) {
	    	   int empno;
	           Scanner sc = new Scanner(System.in);
	           System.out.println("Enter Employ No   ");
	           empno = sc.nextInt();
	           OptionalEx2 obj1 = new OptionalEx2();
	           Optional<Employ> empData = 
	        		   Optional.ofNullable(obj1.searchEmp(empno));
	           if (empData.isPresent()) {
	        	   System.out.println(empData);
	           } else {
	        	   System.out.println("*** Record Not Found ***");
	           }
		}
}
