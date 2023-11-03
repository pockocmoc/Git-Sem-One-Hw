package com.pockocmoc;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		AgeEquals ageEquals = new AgeEquals();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Программа возращает разницу в возрасте между людьми.");
		System.out.println("Введите возраст 1 го человека(в формате: дд мм гггг): ");
		String ageOne = scanner.nextLine();
		LocalDate oneUserAge = ageEquals.parserDate(ageOne);
		System.out.println("Введите возраст 2 го человека(в формате: дд мм гггг): ");
		String ageTwo = scanner.nextLine();
		scanner.close();
		LocalDate twoUserAge = ageEquals.parserDate(ageTwo);

		ageEquals.ageDifferencee(oneUserAge, twoUserAge);

	}

}
