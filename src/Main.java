public class Main {
    public static void main(String[] args) {
        long[] array = {2L, 6L, 9L, 43L, 543L, 54L, 4L, 99L, 543L};
        SalesManager salesManager = new SalesManager(array);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.CalculationAverage());
    }
}
