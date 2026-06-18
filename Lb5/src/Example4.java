public class Example4 {
    private char ch;
    private int num;

    public Example4(int number, char character) {
        this.num = number;
        this.ch = character;
    }

    public Example4(double value) {
        int intPart = (int) value;
        this.ch = (char) intPart;

        double fraction = value - intPart;

        this.num = (int) (fraction * 100 + 0.00001) % 100;
    }

    public void show() {
        System.out.println("Символ: '" + ch + "' (код " + (int) ch +
                "), Число: " + num);
    }
}