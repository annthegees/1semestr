public class Example1 {
    private String textField;

    public Example1(String textField) {
        this.textField = textField;
    }

    @Override
    public String toString() {
        return "SuperClass{textField='" + textField + "'}";
    }

    public String getTextField() {
        return textField;
    }
}

class SubClass extends Example1 {
    private String subTextField;

    public SubClass(String subTextField) {
        super("");
        this.subTextField = subTextField;
    }

    public SubClass(String superTextField, String subTextField) {
        super(superTextField);
        this.subTextField = subTextField;
    }

    @Override
    public String toString() {
        return "SubClass{superTextField='" + getTextField() + "', subTextField='" + subTextField + "'}";
    }

    public String getSubTextField() {
        return subTextField;
    }
}

