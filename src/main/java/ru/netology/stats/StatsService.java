package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;

        for (long sale : sales) {
            sum += sale;

        }

        return sum;
    }

        public long findMonthMaxSale(long[] sales) {

            long MaxSale = findMaxSale(sales);
            int numberOfMonth = 0;
            int numberOfMonthMaxSale = 0;

            for (long sale : sales) {
                numberOfMonth ++;
                if (sale == MaxSale) {
                    numberOfMonthMaxSale = numberOfMonth;

                }

            }
            return numberOfMonthMaxSale;

        }

        public long findMaxSale(long[] sales) {
            long MaxSale = sales[0];

            for (long sale : sales) {
                if(sale>MaxSale) {
                    MaxSale = sale;
                }
            }
            return MaxSale;
        }

    public long findMonthMinSale(long[] sales) {

        long MinSale = findMinSale(sales);
        int numberOfMonth = 0;
        int numberOfMonthMinSale = 0;

        for (long sale : sales) {
            numberOfMonth ++;
            if (sale == MinSale) {
                numberOfMonthMinSale = numberOfMonth;

            }

        }
        return numberOfMonthMinSale;

    }

    public long findMinSale(long[] sales) {
        long MinSale = sales[0];

        for (long sale : sales) {
            if(sale<MinSale) {
                MinSale = sale;
            }
        }
        return MinSale;
    }

    public long monthLessAverageAmount(long[] sales) {
        long average = average(sales);
        int amount = 0;

        for (long sale: sales) {
            if (sale < average) {
                amount ++;

            }

        }
        return amount;
    }



    }


