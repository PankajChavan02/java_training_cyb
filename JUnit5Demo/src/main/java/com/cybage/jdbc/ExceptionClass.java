package com.cybage.jdbc;

import javax.management.RuntimeErrorException;

public class ExceptionClass {
	
	public int getException() {
		if(5<10) {
			throw new RuntimeException("Exception");
		}	
		else return 5;
		
	}

}
