import java.util.Arrays;

public class Example10 {
    public static int[] findMinMax(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return new int[]{0, 0};
        }

        int min = numbers[0];
        int max = numbers[0];


        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return new int[]{min, max};
    }


    public static void testFindMinMax(int... numbers) {
        System.out.print("findMinMax(");
        if (numbers == null) {
            System.out.print("null");
        } else if (numbers.length == 0) {
            System.out.print("нет аргументов");
        } else {
            System.out.print(Arrays.toString(numbers));
        }
        System.out.print(") = ");

        int[] result = findMinMax(numbers);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

    public static void main(String[] args) {
        System.out.println("=== Поиск минимального и максимального значений ===\n");
        System.out.println("\nДемонстрация алгоритма для [45, 23, 67, 12, 89]:");
        int[] array = {45, 23, 67, 12, 89};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        int min = array[0];
        int max = array[0];
        System.out.println("Начальные значения: min = " + min + ", max = " + max);

        for (int i = 1; i < array.length; i++) {
            System.out.print("Элемент [" + i + "] = " + array[i]);

            if (array[i] < min) {
                min = array[i];
                System.out.println(" -> новый min = " + min);
            } else if (array[i] > max) {
                max = array[i];
                System.out.println(" -> новый max = " + max);
            } else {
                System.out.println(" -> без изменений");
            }
        }

        System.out.println("Итог: min = " + min + ", max = " + max);
        System.out.println("Массив результата: [" + min + ", " + max + "]");

        int[] result = findMinMax(array);
        System.out.println("\nПроверка методом findMinMax: " + Arrays.toString(result));
    }
}
