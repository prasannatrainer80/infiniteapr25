package com.java.ejb;

import javax.naming.NamingException;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(RemoteHelper.lookupRemoteStatelessEmploy());
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
