package com.cybage.demo;

enum Days{
	SUN("Sunday"),MON(6),TUE("Tuesday",5);
	
	private String dayName;
	private int dayNumber;
	
	private Days(String dayName) {
		this.dayName = dayName;
	}
	
	private Days(int dayNumber) {
 
		this.dayNumber = dayNumber;
	}
	
	private Days(String dayName,int dayNumber) {
		this.dayName = dayName;
		this.dayNumber=dayNumber;
	}

	public String getDayName() {
		return dayName;
	}

	public int getDayNumber() {
		return dayNumber;
	}
	
	
}

public class EnumExample {
	
	public static void main(String[] args) {
		Days[] days = Days.values();
		
		
		for(Days day : days) {
			System.out.printf("%-5s  %-3d  %-8s %-3d \n",day.name(),day.ordinal(),day.getDayName(),day.getDayNumber());
		}

	}
}
