public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1L;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = 9_223_372_036_854_775_807L;
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int CalculationAverage() {
        int sum = 0;
        if (sales.length == 0) {
            return 0;
        } else if (sales.length < 3) {
            for (long sale : sales) {
                sum += sale;
            }
            return sum / sales.length;
        } else {
            long min = min();
            long max = max();
            int count = 0;
            for (long sale : sales) {
                if (sale != min && sale != max) {
                    sum += sale;
                    count ++;
                }
            }
            return sum / count;
        }
    }

}
