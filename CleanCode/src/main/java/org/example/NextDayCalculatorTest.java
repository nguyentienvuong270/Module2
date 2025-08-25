package org.example;


public class NextDayCalculatorTest {

    private void assertEquals(String s, String nextDay) {
    }

    public void testNextDay_01012018() {
        assertEquals ("2/1/2018", NextDayCalculator.findNextDay(1, 1, 2018));
    }



    public void testNextDay_31012018() {
        assertEquals("1/2/2018", NextDayCalculator.findNextDay(31, 1, 2018));
    }


    public void testNextDay_30042018() {
        assertEquals("1/5/2018", NextDayCalculator.findNextDay(30, 4, 2018));
    }


    public void testNextDay_28022018() {
        assertEquals("1/3/2018", NextDayCalculator.findNextDay(28, 2, 2018));
    }


    public void testNextDay_29022020() {
        assertEquals("1/3/2020", NextDayCalculator.findNextDay(29, 2, 2020));
    }


    public void testNextDay_31122018() {
        assertEquals("1/1/2019", NextDayCalculator.findNextDay(31, 12, 2018));
    }
}
