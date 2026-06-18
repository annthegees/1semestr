public class Example2 {
    private static int counter = 0;
    private static final int MAX_VALUE = 1000; // Максимальное значение

    public static void displayAndIncrement() {
        System.out.println("Текущее значение: " + counter);

        if (counter < MAX_VALUE) {
            counter++;
        } else {
            System.out.println("Достигнуто максимальное значение!");
        }
    }


    public static void resetCounter() {
        counter = 0;
        System.out.println("Счетчик сброшен");
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        System.out.println("Начальное значение: " + getCounter());

        // Базовое использование
        for (int i = 0; i < 5; i++) {
            displayAndIncrement();
        }


        System.out.println("\nИтоговое значение: " + getCounter());
    }
}
