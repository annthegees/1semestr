public class Example3 {
    private int number1;
    private int number2;

    public Example3() {
        this.number1 = 0;
        this.number2 = 0;
        System.out.println("Вызван конструктор без аргументов. Значения: number1 = " +
                number1 + ", number2 = " + number2);
    }

    public Example3(int num) {
        this.number1 = num;
        this.number2 = num;
        System.out.println("Вызван конструктор с одним аргументом. Значения: number1 = " +
                number1 + ", number2 = " + number2);
    }

    public Example3(int num1, int num2) {
        this.number1 = num1;
        this.number2 = num2;
        System.out.println("Вызван конструктор с двумя аргументами. Значения: number1 = " +
                number1 + ", number2 = " + number2);
    }

}
