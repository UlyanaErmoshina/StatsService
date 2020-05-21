package ru.netology.stats;

import org.junit.jupiter.api.Test;

import java.net.SocketTimeoutException;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test

    void calculateSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);
        assertEquals(expected, actual);

    }
    @Test
    void averageAmountSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 180;
        int months = 12;
        int averageAmount = sum / months;
        System.out.println(averageAmount);

    }
    @Test
    void MonthMaxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;

        long actual = service.findMonthMaxSale(sales);

        assertEquals(expected,actual);



    }
    @Test
    void MonthMinSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 9;

        long actual = service.findMonthMinSale(sales);

        assertEquals(expected,actual);
    }


    @Test
    void shouldLessThenAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;

        long actual = service.monthLessAverageAmount(sales);

        assertEquals(expected,actual);
    }


}