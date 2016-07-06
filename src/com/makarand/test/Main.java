package com.makarand.test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds().stream()
		.filter(x -> x.contains("NewZealand"))
		.sorted().forEach(System.out::println);
		
		LocalDate date = LocalDate.of(2016, Month.MARCH, 13);
		LocalTime time = LocalTime.of(2, 30);
		ZoneId zone = ZoneId.of("US/Eastern");
		ZonedDateTime dateTime = ZonedDateTime.of(date, time, zone);
		System.out.println(dateTime);
		
		Locale locale = Locale.getDefault();
		
		Locale locate = new Locale("en","NZ");
		System.out.println(locate);
		System.out.println(locale);
	}

}
