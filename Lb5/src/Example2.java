public class Example2 {
    private char startChar;
    private char endChar;

    public Example2(char start, char end) {
        this.startChar = start;
        this.endChar = end;
    }


    public void printCharactersBetween() {
        char minChar = (char) Math.min(startChar, endChar);
        char maxChar = (char) Math.max(startChar, endChar);

        System.out.print("Символы от '" + minChar + "' до '" + maxChar + "': ");

        for (char ch = minChar; ch <= maxChar; ch++) {
            System.out.print(ch + " ");
        }

        System.out.println(); // Переход на новую строку
    }

}
