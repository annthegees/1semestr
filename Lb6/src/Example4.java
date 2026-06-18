public class Example4 {
    public static long doubleFactorial(int n) {

        if (n < 0) {
            System.out.println("Ошибка: двойной факториал не определен для отрицательных чисел!");
            return -1;
        }


        if (n == 0 || n == 1) {
            return 1;
        }


        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }

        return result;
    }
    public static void printDoubleFactorial(int n) {
        if (n < 0) {
            System.out.println("Ошибка: двойной факториал не определен для отрицательных чисел!");
            return;
        }

        System.out.print(n + "!! = ");

        if (n == 0 || n == 1) {
            System.out.println("1");
            return;
        }

        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            System.out.print(i);
            result *= i;

            if (i > 2) {
                System.out.print(" × ");
            } else {
                System.out.print(" = ");
            }
        }

    }
}
