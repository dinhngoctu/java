import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void calculateNextDay() {
        int present_day = 28;
        int max_day = 28;
        int present_month = 03;
        int expected = 01;
        int result = NextDayCalculator.calculateNextDay(present_day, max_day, present_month);
        assertEquals(expected, result);
    }

    @Test
    void calculateMaxDay() {
        int present_month = 0;
        int present_year = 0;
        int result = NextDayCalculator.calculateMaxDay(present_month, present_year);
        int exprected = 0;
        assertEquals(exprected, result);
    }

    @Test
    void isLeapYear() {
        int present_year = 0;
        boolean result = NextDayCalculator.isLeapYear(present_year);
        boolean expected = true;
        assertEquals(expected, result);
    }
}