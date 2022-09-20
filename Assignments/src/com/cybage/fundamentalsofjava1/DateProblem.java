package com.cybage.fundamentalsofjava1;
/*Write a class Date.  Overload constructor to initialize attributes.
Create Date objects using non-parameterized & parameterized constructors both.
Print values of day, month & year for every object.
*/

class Date {
	private int day;
	private int month;
	private int year;
	
	//default constructor
	public Date() {
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}


	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}

public class DateProblem {

	public static void main(String[] args) {
		Date date1 = new Date();
		date1.setDay(26);
		date1.setMonth(9);
		date1.setYear(2021);
		System.out.println(date1.toString());
		
		
		Date date = new Date(26,9,2020);
		System.out.println(date1.toString());

	}

}
