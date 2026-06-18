import java.util.Arrays;

public class Example6 {
    public static int[] getHead(int[] array, int n) {
        if (array == null) {
            return null;
        }

        int newSize;
        if (n <= 0) {
            newSize = 0;
        } else if (n >= array.length) {
            newSize = array.length;
        } else {
            newSize = n;
        }

        return Arrays.copyOf(array, newSize);
    }

    public static void testGetHead(int[] array, int n) {
        System.out.print("getHead(" + Arrays.toString(array) + ", " + n + ") = ");
        int[] result = getHead(array, n);
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {

        int[] testArray = {1, 2, 3, 4, 5};

        System.out.println("Исходный массив: " + Arrays.toString(testArray));
        System.out.println();

        testGetHead(testArray, 3);   // Первые 3 элемента
        testGetHead(testArray, 5);   // Полная копия (n равно длине)
        testGetHead(testArray, 7);   // Полная копия (n больше длины)
        testGetHead(testArray, 0);   // Пустой массив
        testGetHead(testArray, -2);  // Пустой массив
        testGetHead(null, 3);        // null


        System.out.println("\nДемонстрация создания нового массива:");
        int[] original = {10, 20, 30};
        int[] head = getHead(original, 2);

        System.out.println("Исходный массив: " + Arrays.toString(original));
        System.out.println("Результат getHead(original, 2): " + Arrays.toString(head));

        head[0] = 999;
        System.out.println("После head[0] = 999:");
        System.out.println("  Результат: " + Arrays.toString(head));
        System.out.println("  Исходный: " + Arrays.toString(original));
        System.out.println("Исходный массив не изменился!");
    }
}
