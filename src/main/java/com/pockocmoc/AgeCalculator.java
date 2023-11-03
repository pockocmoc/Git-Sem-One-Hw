package com.pockocmoc;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class AgeCalculator {

    public Period calculateAgeDifference(LocalDate dateOne, LocalDate dateTwo) {
        return Period.between(dateOne, dateTwo);
    }

    public long calculateDaysDifference(LocalDate dateOne, LocalDate dateTwo) {
        return Math.abs(ChronoUnit.DAYS.between(dateOne, dateTwo));
    }

    public String getYearsString(long years) {
        long twoDigitYear = getTwoDigitRemainder(years);
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
    public String getMonthsString(long months) {
        long twoDigitMonths = getTwoDigitRemainder(months);
        if (twoDigitMonths == 1) {
            return "месяц";
        } else if (twoDigitMonths % 10 == 1 && (twoDigitMonths < 10 || twoDigitMonths > 20)) {
            return "месяц";
        } else if ((twoDigitMonths % 10 >= 2 && twoDigitMonths % 10 <= 4) && (twoDigitMonths < 10 || twoDigitMonths > 20)) {
            return "месяца";
        } else {
            return "месяцев";
        }
    }

    public String getDaysString(long days) {
        long twoDigitDays = getTwoDigitRemainder(days);
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

    private long getTwoDigitRemainder(long number) {
        if (number > 99) {
            return number % 100;
        } else {
            return number;
        }
    }

    public LocalDate parseDate(String input) {
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
