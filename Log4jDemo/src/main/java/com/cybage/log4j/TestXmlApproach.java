package com.cybage.log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 * Hello world!
 *
 */
public class TestXmlApproach 
{
	public static  Logger l = Logger.getLogger(TestXmlApproach.class.getName());
    public static void main( String[] args )
    {      
    	DOMConfigurator.configure("log4j.xml");
       l.setLevel(Level.ERROR);
       l.debug("This is debug message");
       l.info("This is info message");
       l.error("This is error message");
       l.fatal("This is fatal message");
    }
}
