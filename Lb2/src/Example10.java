import java.util.Random;

public class Example10 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 10;
        int[] array = new int[size];

        System.out.println("Исходный массив:");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(101);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\nМассив после сортировки:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }
}

