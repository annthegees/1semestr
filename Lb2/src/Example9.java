import java.util.Random;

public class Example9 {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 10;
        int[] array = new int[size];

        System.out.println("Массив случайных чисел:");
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];

        for (int i = 1; i < size; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("\nМинимальное значение: " + min);

        System.out.print("Индексы элементов с минимальным значением: ");

        boolean foundFirst = false;
        for (int i = 0; i < size; i++) {
            if (array[i] == min) {
                if (foundFirst) {
                    System.out.print(", ");
                }
                System.out.print(i);
                foundFirst = true;
            }
        }

        System.out.println();


    }
}
