public class Example1 {
    private char charField;
    private String textField;

    public Example1() {
        charField = ' ';
        textField = "";
    }

    public void setValue(char ch) {
        charField = ch;
        textField = "";
    }

    public void setValue(String text) {
        charField = ' ';
        textField = text;
    }

    public void setValue(char[] charArray) {
        if (charArray == null || charArray.length == 0) {
            charField = ' ';
            textField = "";
        } else if (charArray.length == 1) {
            charField = charArray[0];
            textField = "";
        } else {
            charField = ' ';
            textField = new String(charArray);
        }
    }

    public void display() {
        System.out.println("Символьное поле: '" + charField + "'");
        System.out.println("Текстовое поле: \"" + textField + "\"");
    }
}
