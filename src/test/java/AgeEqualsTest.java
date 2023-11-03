import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.pockocmoc.AgeEquals;

public class AgeEqualsTest {

	@Test
	public void testGetYearsString() {
		new AgeEquals();

		Assertions.assertEquals("год", AgeEquals.getYearsString(1L));
		Assertions.assertEquals("год", AgeEquals.getYearsString(21L));
		Assertions.assertEquals("лет", AgeEquals.getYearsString(14L));
		Assertions.assertEquals("года", AgeEquals.getYearsString(2L));
		Assertions.assertEquals("лет", AgeEquals.getYearsString(22213L));
		Assertions.assertEquals("лет", AgeEquals.getYearsString(5L));
		Assertions.assertEquals("лет", AgeEquals.getYearsString(25L));
	}

	@Test
	public void testGetMonthsString() {
		new AgeEquals();
		assertEquals("месяц", AgeEquals.monthsString(1));
		assertEquals("месяца", AgeEquals.monthsString(2));
		assertEquals("месяца", AgeEquals.monthsString(3));
		assertEquals("месяца", AgeEquals.monthsString(4));
		assertEquals("месяцев", AgeEquals.monthsString(5));
		assertEquals("месяцев", AgeEquals.monthsString(6));
		assertEquals("месяцев", AgeEquals.monthsString(7));
		assertEquals("месяцев", AgeEquals.monthsString(8));
		assertEquals("месяцев", AgeEquals.monthsString(9));
		assertEquals("месяцев", AgeEquals.monthsString(10));
		assertEquals("месяцев", AgeEquals.monthsString(11));
		assertEquals("месяцев", AgeEquals.monthsString(12));
	}

	@Test
	public void testGetDayString() {
		new AgeEquals();

		Assertions.assertEquals("день", AgeEquals.getDayString(1L));
		Assertions.assertEquals("дней", AgeEquals.getDayString(11L));
		Assertions.assertEquals("дней", AgeEquals.getDayString(14L));
		Assertions.assertEquals("дней", AgeEquals.getDayString(16L));
		Assertions.assertEquals("день", AgeEquals.getDayString(21L));
		Assertions.assertEquals("дня", AgeEquals.getDayString(2L));
		Assertions.assertEquals("дня", AgeEquals.getDayString(22L));
		Assertions.assertEquals("дней", AgeEquals.getDayString(5L));
		Assertions.assertEquals("дней", AgeEquals.getDayString(25L));
	}

	@Test
	public void testAgeDifferencee() {
		AgeEquals ageEquals = new AgeEquals();

		LocalDate dateOne = LocalDate.of(1990, 3, 1);
		LocalDate dateTwo = LocalDate.of(2020, 1, 1);

		ageEquals.ageDifferencee(dateOne, dateTwo);
	}
}