package com.cybage.jdbc;

import java.time.LocalDate;
import java.util.Date;

public class Demo {

	public static void main(String[] args) {
	 Date date = new Date(1996, 07, 19);
	 System.out.println(date.getYear());
	 
	 LocalDate d = LocalDate.of(1996, 07, 19);
	 
	 System.out.println(d);
	 

	}

}
