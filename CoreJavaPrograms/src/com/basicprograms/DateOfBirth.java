package com.basicprograms;

import java.time.LocalDate;
import java.time.Period;

public class DateOfBirth {
public static void main(String[] args) {
	LocalDate today=LocalDate.now();
	LocalDate DOB=LocalDate.of(1999, 07, 07);
	int year=Period.between(DOB,today).getYears();
	System.out.println(today);
	System.out.println(DOB);
	System.out.println(year);
}
}
