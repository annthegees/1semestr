public class Example5 {
    private String text;

    public Example5(String text) {
        this.text = text;
    }

    public void displayInfo() {
        System.out.println("Класс: SuperClass, текстовое поле: \"" + text + "\"");
    }

    public String getText() {
        return text;
    }
}

// Первый подкласс
class FirstSubClass extends Example5 {
    protected int number;

    public FirstSubClass(String text, int number) {
        super(text);
        this.number = number;
    }

    @Override
    public void displayInfo() {
        System.out.println("Класс: FirstSubClass, текстовое поле: \"" + getText() +
                "\", целочисленное поле: " + number);
    }
}


class SecondSubClass extends Example5 {
    protected char symbol;

    public SecondSubClass(String text, char symbol) {
        super(text);
        this.symbol = symbol;
    }

    @Override
    public void displayInfo() {
        System.out.println("Класс: SecondSubClass, текстовое поле: \"" + getText() +
                "\", символьное поле: '" + symbol + "'");
    }
}


