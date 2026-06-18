import java.util.Arrays;

public class Example9 {

    public static char[] swapPairs(char[] array) {
        if (array == null) {
            return null;
        }

        char[] result = array.clone();

       for (int i = 0; i < result.length / 2; i++) {
            int oppositeIndex = result.length - 1 - i;

            char temp = result[i];
            result[i] = result[oppositeIndex];
            result[oppositeIndex] = temp;
        }

        return result;
    }

    public static void testSwap(char[] array) {
        System.out.print("swapPairs(");
        if (array == null) {
            System.out.print("null");
        } else {
            System.out.print(Arrays.toString(array));
        }
        System.out.print(") = ");

        char[] result = swapPairs(array);

        if (result == null) {
            System.out.print("null");
        } else {
            System.out.print(Arrays.toString(result));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("=== Попарный обмен элементов символьного массива ===\n");

        testSwap(new char[]{'A', 'B', 'C', 'D', 'E'});      // ['E', 'D', 'C', 'B', 'A']
        testSwap(new char[]{'1', '2', '3', '4'});           // ['4', '3', '2', '1']
        testSwap(new char[]{'X', 'Y', 'Z'});                // ['Z', 'Y', 'X']
        testSwap(new char[]{'A', 'B'});                     // ['B', 'A']
        testSwap(new char[]{'X'});                          // ['X']
        testSwap(new char[]{});                             // []
        testSwap(null);                                     // null

        System.out.println("\nДемонстрация алгоритма для массива ['A', 'B', 'C', 'D', 'E', 'F']:");
        char[] array = {'A', 'B', 'C', 'D', 'E', 'F'};
        System.out.println("Исходный массив: " + Arrays.toString(array));

        char[] result = swapPairs(array);
        System.out.println("Результат: " + Arrays.toString(result));

        System.out.println("\nПроверка обратного преобразования:");
        char[] back = swapPairs(result);
        System.out.println("swapPairs(результат) = " + Arrays.toString(back));
        System.out.println("Получили исходный массив: " + Arrays.equals(array, back));


        System.out.println("\nПошаговая визуализация для ['1', '2', '3', '4']:");
        char[] demo = {'1', '2', '3', '4'};
        System.out.println("Исходный: " + Arrays.toString(demo));

        char[] step = demo.clone();
        for (int i = 0; i < step.length / 2; i++) {
            int j = step.length - 1 - i;
            System.out.printf("Шаг %d: меняем [%d]='%c' и [%d]='%c'\n",
                    i + 1, i, step[i], j, step[j]);

            char temp = step[i];
            step[i] = step[j];
            step[j] = temp;

            System.out.println("Текущее состояние: " + Arrays.toString(step));
        }
    }
}
