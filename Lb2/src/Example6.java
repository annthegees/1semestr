import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int size = 0;
        while (true) {
            System.out.print("Введите размер массива (положительное число): ");
            if (scanner.hasNextInt()) {
                size = scanner.nextInt();
                if (size > 0) {
                    break;
                } else {
                    System.out.println("Ошибка: размер должен быть больше 0!");
                }
            } else {
                System.out.println("Ошибка: введите целое число!");
                scanner.next();
            }
        }


        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = 2 + i * 5;
        }



        System.out.print("\n");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
            if (i < size - 1) {
                System.out.print(", ");
            }
        }

    }
}
