package com.makarand.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TestDates {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date, time);

		date = date.plus(2, ChronoUnit.DAYS);

		
		for (ChronoUnit chronoUnit : ChronoUnit.values()) {
			System.out.println(chronoUnit);
		}

		ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, ZoneId.systemDefault());
		
		System.out.println(zonedDateTime);
		
		ZonedDateTime.ofStrict(dateTime, ZoneOffset.UTC, ZoneId.systemDefault());
		
		ZonedDateTime newZonedDateTime = zonedDateTime.minusDays(2)
		.minusHours(34)
		.minusMinutes(78)
		.minusWeeks(3)
		.minusYears(2)
		.minusMonths(5)
		.minusNanos(10000000)
		.minusSeconds(23454)
		.minus(23, ChronoUnit.HALF_DAYS);
		
		System.out.println(newZonedDateTime);
	}
}
