public class Main {
    public static void main(String[] args) {
        int[] array = {2, 6, 9, 43, 543, 54, 4, 99};
        SalesManager salesManager = new SalesManager(array);
        System.out.println(salesManager.max());
        System.out.println(salesManager.min());
        System.out.println(salesManager.CalculationAverage());
    }
}
