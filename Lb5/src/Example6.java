public class Example6 {
    private int max;
    private int min;

    public Example6() {
        this.max = 0;
        this.min = 0;
    }

    public Example6(int value) {
        this.max = value;
        this.min = value;
    }

    public Example6(int value1, int value2) {
        this.max = Math.max(value1, value2);
        this.min = Math.min(value1, value2);
    }

    public void setValues(int value) {
        int newMax = Math.max(this.max, value);
        newMax = Math.max(newMax, this.min);

        int newMin = Math.min(this.max, value);
        newMin = Math.min(newMin, this.min);

        this.max = newMax;
        this.min = newMin;
    }

    public void setValues(int value1, int value2) {

        int newMax = Math.max(this.max, value1);
        newMax = Math.max(newMax, value2);
        newMax = Math.max(newMax, this.min);

        int newMin = Math.min(this.max, value1);
        newMin = Math.min(newMin, value2);
        newMin = Math.min(newMin, this.min);

        this.max = newMax;
        this.min = newMin;
    }

    public void showValues() {
        System.out.println("max = " + max + ", min = " + min);
    }
}
