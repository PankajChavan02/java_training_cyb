package com.cybage.api;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTimeAPI {

	public static void main(String[] args) {
		// duration period zonedatetime
		LocalDate.now().minus(1, ChronoUnit.MONTHS);
		
		
		LocalDate tomorrow = LocalDate.now().plusDays(1);
		System.out.println(tomorrow);
		LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
		DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek(); int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
		boolean leapYear = LocalDate.now().isLeapYear();
		boolean notBefore = LocalDate.parse("2016-06-12")
		.isBefore(LocalDate.parse("2016-06-11")); boolean isAfter = LocalDate.parse("2016-06-12")
		.isAfter(LocalDate.parse("2016-06-11"));
		
		ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.now().plus(Period.ofDays(30)));
		System.out.println(ZoneId.getAvailableZoneIds());
		
//		duration for time
//		period for days



	}

}
