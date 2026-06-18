public class Example2 {
    private String text;

    public Example2(String text) {
        this.text = text;
    }

    public void setValue(String text) {
        this.text = text;
    }

    public int getTextLength() {
        return (text == null) ? 0 : text.length();
    }

    public String getText() {
        return text;
    }
}

// Подкласс
class Sub extends Example2 {
    public int number;

    public Sub(int number, String text) {
        super(text);
        this.number = number;
    }

    // Метод без параметров
    public void setValue() {
        super.setValue("default");
        this.number = 0;
    }

    // Метод с текстовым параметром (переопределение)
    @Override
    public void setValue(String text) {
        super.setValue(text);
    }

    // Метод с целочисленным параметром (перегрузка)
    public void setValue(int number) {
        this.number = number;
    }

    // Метод с текстовым и целочисленным параметром (перегрузка)
    public void setValue(String text, int number) {
        super.setValue(text);
        this.number = number;
    }
}
