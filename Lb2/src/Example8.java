public class Example8 {
    public static void main(String[] args) {
        char[] array = new char[10];

        char ch = 'A';
        int i = 0;

        while (i < 10) {

            if (ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                array[i] = ch;
                i++;
            }
            ch++;
        }

        for (char c : array) {
            System.out.print(c + " ");
        }
    }

}
