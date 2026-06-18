public class Example3 {
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
}
