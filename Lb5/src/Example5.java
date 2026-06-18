public class Example5 {
    private int value;

    public Example5() {
        setValue();
    }

    public Example5(int initialValue) {
        setValue(initialValue);
    }

    public void setValue() {
        this.value = 0;
    }

    public void setValue(int newValue) {
        if (newValue > 100) {
            this.value = 100;
        } else {
            this.value = newValue;
        }
    }

    public int getValue() {
        return value;
    }
}
