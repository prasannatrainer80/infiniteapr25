package com.java.ejb.beans;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class RemoteStatefulHelper {



	private static Context createInitialContext() throws NamingException {
        Properties jndiProperties = new Properties();
        jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, 
          "org.jboss.naming.remote.client.InitialContextFactory");
        jndiProperties.put(Context.URL_PKG_PREFIXES, 
          "org.jboss.ejb.client.naming");
        jndiProperties.put(Context.PROVIDER_URL, 
           "http-remoting://localhost:8080");
        jndiProperties.put("jboss.naming.client.ejb.context", true);
        return new InitialContext(jndiProperties);
    }
	   public static EmployStatefulBeanRemote lookupRemoteStatefulEmploy() throws NamingException {
		   Context ctx = createInitialContext();
		   EmployStatefulBeanRemote bean = (EmployStatefulBeanRemote) ctx.lookup(
				    "ejb:/EjbSessionBeans/EmployStatefulBean!com.java.ejb.beans.EmployStatefulBeanRemote?stateful"
				);
		   return bean;
	      
	    }


}
