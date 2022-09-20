package com.cybage.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


/**
 * Hello world!
 *
 */
public class App 
{
	public static  Logger l = Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {      
    	
       l.setLevel(Level.ERROR);
       l.debug("This is debug message");
       l.info("This is info message");
       l.error("This is error message");
       l.fatal("This is fatal message");
    }
}
