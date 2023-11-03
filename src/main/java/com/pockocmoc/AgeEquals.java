package com.pockocmoc;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class AgeEquals {

	public void ageDifferencee(LocalDate dateOne, LocalDate dateTwo) {

		Period p = Period.between(dateOne, dateTwo);
		long p2 = Math.abs(ChronoUnit.DAYS.between(dateOne, dateTwo));

		int years = Math.abs(p.getYears());
		int months = Math.abs(p.getMonths());
		int days = Math.abs(p.getDays());

		String yearsString = getYearsString((long) years);
		String monthsString = monthsString(months);
		String daysString = getDayString((long) days);
		String onlyDayString = getDayString(p2);

		if (p2 != 0) {
			printAge(p2, years, months, days, yearsString, monthsString, daysString, onlyDayString);

		} else {
			System.out.println("Вы одного возраста");
		}

	}

	public static String monthsString(int months) {
		String monthsString = (months == 1) ? "месяц" : ((months >= 2 && months <= 4) ? "месяца" : "месяцев");
		return monthsString;
	}

	private void printAge(long p2, int years, int months, int days, String yearsString, String monthsString,
			String daysString, String onlyDayString) {
		System.out.println("Разница в возрасте составляет: " + years + " " + yearsString + " " + months + " "
				+ monthsString + " " + days + " " + daysString + " (" + p2 + " " + onlyDayString + ")");
	}

	public static String getYearsString(Long years) {
		AgeEquals ageEquals = new AgeEquals();

		Long twoDigitYear = ageEquals.getTwoDigitRemainder(years);
		if (twoDigitYear == 1) {
			return "год";
		} else if (twoDigitYear % 10 == 1 && (twoDigitYear < 10 || twoDigitYear > 20)) {
			return "год";
		} else if ((twoDigitYear % 10 >= 2 && twoDigitYear % 10 <= 4) && (twoDigitYear < 10 || twoDigitYear > 20)) {
			return "года";
		} else {
			return "лет";
		}
	}

	public static String getDayString(Long days) {
		AgeEquals ageEquals = new AgeEquals();

		Long twoDigitDays = ageEquals.getTwoDigitRemainder(days);
		if (twoDigitDays == 1) {
			return "день";
		} else if (twoDigitDays % 10 == 1 && (twoDigitDays < 10 || twoDigitDays > 20)) {
			return "день";
		} else if ((twoDigitDays % 10 >= 2 && twoDigitDays % 10 <= 4) && (twoDigitDays < 10 || twoDigitDays > 20)) {
			return "дня";
		} else {
			return "дней";
		}
	}

	public Long getTwoDigitRemainder(Long number) {
		if (number > 99) {
			return number % 100;
		} else {
			return number;
		}
	}

	LocalDate parserDate(String input) {

		LocalDate date;
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
			date = LocalDate.parse(input, formatter);
		} catch (DateTimeParseException exc) {
			System.out.printf("%s is not parsable!%n", input);
			throw exc;
		}

		return date;

	}
}
