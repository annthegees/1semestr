public class Example5 {
    public static long sumOfSquares(int n) {
        if (n < 0) {
            System.out.println("Ошибка: n должно быть натуральным числом!");
            return -1;
        }

        return (long) n * (n + 1) * (2L * n + 1) / 6;
    }

    public static long sumOfSquaresCheck(int n) {
        if (n < 0) return -1;

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void printSumOfSquares(int n) {
        long formulaResult = sumOfSquares(n);
        long checkResult = sumOfSquaresCheck(n);

        System.out.print("1² + 2² + ... + " + n + "² = ");
        System.out.println(formulaResult);

        System.out.print("Проверка циклом: ");
        System.out.println(checkResult);

        System.out.println("Результаты совпадают: " + (formulaResult == checkResult));
    }
}
