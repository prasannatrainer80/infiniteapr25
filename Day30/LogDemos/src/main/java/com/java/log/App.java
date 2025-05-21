package com.java.log;

import org.apache.log4j.Logger;

public class App {

	private static final Logger log = Logger.getLogger("com.java.log.App");
  public static void main(String[] args) {
    log.debug("Debug   Message");
              log.warn ("Warning Message");
              log.error("Error   Message");
      
//              LogManager.shutdown();
  }

}
