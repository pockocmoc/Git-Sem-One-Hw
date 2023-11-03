package com.pockocmoc;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		AgeCalculator ageCalculator = new AgeCalculator();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Программа возращает разницу в возрасте между людьми.");
		System.out.println("Введите возраст 1 го человека(в формате: дд мм гггг): ");
		String ageOne = scanner.nextLine();
		LocalDate oneUserAge = ageCalculator.parseDate(ageOne);
		System.out.println("Введите возраст 2 го человека(в формате: дд мм гггг): ");
		String ageTwo = scanner.nextLine();
		scanner.close();
		LocalDate twoUserAge = ageCalculator.parseDate(ageTwo);

		Period ageDifference = ageCalculator.calculateAgeDifference(oneUserAge, twoUserAge);
		long daysDifference = ageCalculator.calculateDaysDifference(oneUserAge, twoUserAge);

		if (daysDifference != 0) {
			String yearsString = ageCalculator.getYearsString(Math.abs(ageDifference.getYears()));
			String monthsString = ageCalculator.getMonthsString(Math.abs(ageDifference.getMonths()));
			String daysString = ageCalculator.getDaysString(Math.abs(ageDifference.getDays()));

			System.out.println("Разница в возрасте составляет: " + Math.abs(ageDifference.getYears()) + " "
					+ yearsString + " " + Math.abs(ageDifference.getMonths()) + " " + monthsString + " "
					+ Math.abs(ageDifference.getDays()) + " " + daysString + " (" + daysDifference + " "
					+ ageCalculator.getDaysString(daysDifference) + ")");
		} else {
			System.out.println("Вы одного возраста");
		}
	}
}