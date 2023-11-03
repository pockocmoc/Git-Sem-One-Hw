import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.pockocmoc.AgeCalculator;

public class AgeEqualsTest {

	@Test
	public void testGetYearsString() {
		new AgeCalculator();

		Assertions.assertEquals("год", AgeCalculator.getYearsString(1L));
		Assertions.assertEquals("год", AgeCalculator.getYearsString(21L));
		Assertions.assertEquals("лет", AgeCalculator.getYearsString(14L));
		Assertions.assertEquals("года", AgeCalculator.getYearsString(2L));
		Assertions.assertEquals("лет", AgeCalculator.getYearsString(22213L));
		Assertions.assertEquals("лет", AgeCalculator.getYearsString(5L));
		Assertions.assertEquals("лет", AgeCalculator.getYearsString(25L));
	}

	@Test
	public void testGetMonthsString() {
		new AgeCalculator();
		assertEquals("месяц", AgeCalculator.monthsString(1));
		assertEquals("месяца", AgeCalculator.monthsString(2));
		assertEquals("месяца", AgeCalculator.monthsString(3));
		assertEquals("месяца", AgeCalculator.monthsString(4));
		assertEquals("месяцев", AgeCalculator.monthsString(5));
		assertEquals("месяцев", AgeCalculator.monthsString(6));
		assertEquals("месяцев", AgeCalculator.monthsString(7));
		assertEquals("месяцев", AgeCalculator.monthsString(8));
		assertEquals("месяцев", AgeCalculator.monthsString(9));
		assertEquals("месяцев", AgeCalculator.monthsString(10));
		assertEquals("месяцев", AgeCalculator.monthsString(11));
		assertEquals("месяцев", AgeCalculator.monthsString(12));
	}

	@Test
	public void testGetDayString() {
		new AgeCalculator();

		Assertions.assertEquals("день", AgeCalculator.getDayString(1L));
		Assertions.assertEquals("дней", AgeCalculator.getDayString(11L));
		Assertions.assertEquals("дней", AgeCalculator.getDayString(14L));
		Assertions.assertEquals("дней", AgeCalculator.getDayString(16L));
		Assertions.assertEquals("день", AgeCalculator.getDayString(21L));
		Assertions.assertEquals("дня", AgeCalculator.getDayString(2L));
		Assertions.assertEquals("дня", AgeCalculator.getDayString(22L));
		Assertions.assertEquals("дней", AgeCalculator.getDayString(5L));
		Assertions.assertEquals("дней", AgeCalculator.getDayString(25L));
	}

	@Test
	public void testAgeDifferencee() {
		AgeCalculator ageEquals = new AgeCalculator();

		LocalDate dateOne = LocalDate.of(1990, 3, 1);
		LocalDate dateTwo = LocalDate.of(2020, 1, 1);

		ageEquals.ageDifferencee(dateOne, dateTwo);
	}
}