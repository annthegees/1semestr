public class Example3 {
    public int intValue;

    public Example3(int intValue) {
        this.intValue = intValue;
    }

    public void setValue(int intValue) {
        this.intValue = intValue;
    }

    @Override
    public String toString() {
        return "FirstClass{intValue=" + intValue + "}";
    }
}

// Второй класс
class SecondClass extends Example3 {
    public char charValue;

    public SecondClass(int intValue, char charValue) {
        super(intValue);
        this.charValue = charValue;
    }

    // Перегрузка метода setValue
    public void setValue(int intValue, char charValue) {
        super.setValue(intValue);
        this.charValue = charValue;
    }

    @Override
    public String toString() {
        return "SecondClass{intValue=" + intValue + ", charValue='" + charValue + "'}";
    }
}

// Третий класс
class ThirdClass extends SecondClass {
    public String textValue;

    public ThirdClass(int intValue, char charValue, String textValue) {
        super(intValue, charValue);
        this.textValue = textValue;
    }

    // Перегрузка метода setValue
    public void setValue(int intValue, char charValue, String textValue) {
        super.setValue(intValue, charValue);
        this.textValue = textValue;
    }

    @Override
    public String toString() {
        return "ThirdClass{intValue=" + intValue + ", charValue='" + charValue +
                "', textValue=\"" + textValue + "\"}";
    }
}

