package ru.netology.stats;

public class StatsService {
    // Первое задание (Найти сумму продаж)
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    // Второе задание (Найти среднее значение от всех продаж)
    public long calculateAverage(long[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }

    // Третье задание (Найти месяц с максимальными продажами)
    public long findMax(long[] purchases) {
        long max = purchases[0];
        long month = 0;
        long counter = 0;
        for (long maximum : purchases) {
            counter += 1;
            if (max <= maximum){
                month = counter;
                max = maximum;
            }
        }
        return month;
    }
    // Четвертое задание (Найти месяц с минимальными продажами)
    public long findMin(long[] purchases) {
        long min = purchases[0];
        long month = 0;
        long counter = 0;
        for (long minimum : purchases) {
            counter += 1;
            if (min >= minimum){
                month = counter;
                min = minimum;
            }
        }
        return month;
    }
    // Пятое задание (Найти количество месяцев с продажами ниже среднего)
    public long findMonthBelowAverage(long[] purchases) {
        long month = 0;
        long avg = calculateAverage(purchases);
        for (long belowAverage : purchases) {
            if (belowAverage < avg){
                month++;
            }
        }
        return month;
    }
    // Шестое задание (Найти количество месяцев с продажами выше среднего)
    public long findMonthAboveAverage(long[] purchases) {
        long month = 0;
        long avg = calculateAverage(purchases);
        for (long aboveAverage : purchases) {
            if (aboveAverage > avg){
                month++;
            }
        }
        return month;
    }
}

