package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//1 задание
class StatsServiceSum {
    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(purchases);
        assertEquals(expected, actual);
    }
}
//2 задание
class StatsServiceAverage {
    @Test
    void calculateAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAverage(purchases);
        assertEquals(expected, actual);
    }

}
//3 задание
class StatsServiceMax {
    @Test
    void findMax() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMax(purchases);
        assertEquals(expected, actual);
    }
}
//4 задание
class StatsServiceMin {
    @Test
    void findMin() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMin(purchases);
        assertEquals(expected, actual);
    }
}
//5 задание
class StatsServiceBelowAverage {
    @Test
    void findMonthBelowAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.findMonthBelowAverage(purchases);
        assertEquals(expected, actual);
    }
}
//6 задание
class StatsServiceAboveAverage {
    @Test
    void findMonthAboveAverage() {
        StatsService service = new StatsService();
        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.findMonthAboveAverage(purchases);
        assertEquals(expected, actual);
    }
}


