import java.util.Arrays;

public class Example8 {
    public static double calculateAverage(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }

        if (array.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        return (double) sum / array.length;
    }

    public static void testAverage(int[] array) {
        System.out.print("calculateAverage(" + Arrays.toString(array) + ") = ");
        try {
            double result = calculateAverage(array);
            System.out.printf("%.2f", result);

            if (array != null && array.length > 0) {
                int sum = 0;
                for (int value : array) sum += value;
                System.out.printf(" (сумма: %d, количество: %d)", sum, array.length);
            }
        } catch (IllegalArgumentException e) {
            System.out.print("Ошибка: " + e.getMessage());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Вычисление среднего значения элементов массива ===\n");

        testAverage(new int[]{1, 2, 3, 4, 5});           // 3.0
        testAverage(new int[]{10, 20, 30});              // 20.0
        testAverage(new int[]{5, 5, 5, 5});              // 5.0
        testAverage(new int[]{100});                     // 100.0
        testAverage(new int[]{});                        // 0.0 (пустой массив)
        testAverage(new int[]{-5, 0, 5});                // 0.0
        testAverage(new int[]{-10, -20, -30});           // -20.0

        System.out.println("\nПример с нечетным делением:");
        int[] test = {1, 2, 3};
        double avg = calculateAverage(test);
        System.out.println("Массив: " + Arrays.toString(test));
        System.out.println("Сумма: 1 + 2 + 3 = 6");
        System.out.println("Количество: 3");
        System.out.println("6 / 3 = " + (6.0 / 3.0));
        System.out.printf("calculateAverage результат: %.10f\n", avg);

        System.out.println("\nПроверка с null массивом:");
        testAverage(null);
    }
}
