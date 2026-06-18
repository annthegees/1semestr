public class Example4 {
    public char charField;

    public Example4(char charField) {
        this.charField = charField;
    }

    public Example4(Example4 original) {
        this.charField = original.charField;
    }

    @Override
    public String toString() {
        return "FirstClass{charField='" + charField + "'}";
    }
}

class Second extends Example4 {
    public String textField;

    public Second(char charField, String textField) {
        super(charField);
        this.textField = textField;
    }


    public Second(Second original) {
        super(original);
        this.textField = original.textField;
    }

    @Override
    public String toString() {
        return "SecondClass{charField='" + charField + "', textField=\"" + textField + "\"}";
    }
}


class Third extends Second {
    public int intField;

    public Third(char charField, String textField, int intField) {
        super(charField, textField);
        this.intField = intField;
    }


    public Third(Third original) {
        super(original);
        this.intField = original.intField;
    }

    @Override
    public String toString() {
        return "ThirdClass{charField='" + charField + "', textField=\"" + textField +
                "\", intField=" + intField + "}";
    }
}
