import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.pockocmoc.AgeCalculator;

public class AgeEqualsTest {

	@Test
	public void testGetYearsString() {
		AgeCalculator ageCalculator = new AgeCalculator();

		Assertions.assertEquals("год", ageCalculator.getYearsString(1L));
		Assertions.assertEquals("год", ageCalculator.getYearsString(21L));
		Assertions.assertEquals("лет", ageCalculator.getYearsString(14L));
		Assertions.assertEquals("года", ageCalculator.getYearsString(2L));
		Assertions.assertEquals("лет", ageCalculator.getYearsString(22213L));
		Assertions.assertEquals("лет", ageCalculator.getYearsString(5L));
		Assertions.assertEquals("лет", ageCalculator.getYearsString(25L));
	}

	@Test
	public void testGetMonthsString() {
		AgeCalculator ageCalculator = new AgeCalculator();
		assertEquals("месяц", ageCalculator.getMonthsString(1));
		assertEquals("месяца", ageCalculator.getMonthsString(2));
		assertEquals("месяца", ageCalculator.getMonthsString(3));
		assertEquals("месяца", ageCalculator.getMonthsString(4));
		assertEquals("месяцев", ageCalculator.getMonthsString(5));
		assertEquals("месяцев", ageCalculator.getMonthsString(6));
		assertEquals("месяцев", ageCalculator.getMonthsString(7));
		assertEquals("месяцев", ageCalculator.getMonthsString(8));
		assertEquals("месяцев", ageCalculator.getMonthsString(9));
		assertEquals("месяцев", ageCalculator.getMonthsString(10));
		assertEquals("месяцев", ageCalculator.getMonthsString(11));
		assertEquals("месяц", ageCalculator.getMonthsString(31));
		assertEquals("месяца", ageCalculator.getMonthsString(32));
		assertEquals("месяца", ageCalculator.getMonthsString(1002));
	}

	@Test
	public void testGetDayString() {
		AgeCalculator ageCalculator = new AgeCalculator();

		Assertions.assertEquals("день", ageCalculator.getDaysString(1L));
		Assertions.assertEquals("дней", ageCalculator.getDaysString(11L));
		Assertions.assertEquals("дней", ageCalculator.getDaysString(14L));
		Assertions.assertEquals("дней", ageCalculator.getDaysString(16L));
		Assertions.assertEquals("день", ageCalculator.getDaysString(21L));
		Assertions.assertEquals("дня", ageCalculator.getDaysString(2L));
		Assertions.assertEquals("дня", ageCalculator.getDaysString(22L));
		Assertions.assertEquals("дней", ageCalculator.getDaysString(5L));
		Assertions.assertEquals("дней", ageCalculator.getDaysString(25L));
	}

	@Test
	public void testCalculateAgeDifference() {
		AgeCalculator ageCalculator = new AgeCalculator();

		LocalDate date1 = LocalDate.of(1990, 5, 15);
		LocalDate date2 = LocalDate.of(1995, 8, 20);

		int expectedYears = 5;
		int expectedMonths = 3;
		int expectedDays = 5;

		Period ageDifference = ageCalculator.calculateAgeDifference(date1, date2);

		Assertions.assertEquals(expectedYears, ageDifference.getYears());
		Assertions.assertEquals(expectedMonths, ageDifference.getMonths());
		Assertions.assertEquals(expectedDays, ageDifference.getDays());
	}
}