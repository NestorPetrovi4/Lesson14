public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = 2_147_483_647;
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int CalculationAverage() {
        int sum = 0;
        if (sales.length == 0) {
            return sum;
        } else if (sales.length < 3) {
            for (int sale : sales) {
                sum += sale;
            }
            return sum / sales.length;
        } else {
            int min = min();
            int max = max();
            int count = 0;
            for (int sale : sales) {
                if (sale != min && sale != max) {
                    sum += sale;
                    count ++;
                }
            }
            return sum / count;
        }
    }

}
