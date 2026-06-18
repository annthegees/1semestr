import java.util.Scanner;

public class Example5point1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в сумме: ");
        int count = scanner.nextInt();

        int sum = 0;
        int number = 1;
        int foundCount = 0;

        System.out.println("Числа, удовлетворяющие условиям:");

        for (; foundCount < count; number++) {
            if (number % 5 == 2 || number % 3 == 1) {
                System.out.println("Число: " + number);
                sum += number;
                foundCount++;
            }
        }

        System.out.println("Сумма чисел: " + sum);

    }


}
