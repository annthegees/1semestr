public class Example7 {

    public static void main(String[] args) {
        int Size = 10;

        char[] charArray = new char[Size];

        char currentChar = 'a';
        for (int i = 0; i < Size; i++) {
            charArray[i] = currentChar;
            currentChar += 2;
        }

        // Вывод массива в прямом порядке
        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < Size; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();

        // Вывод массива в обратном порядке
        System.out.println("\nМассив в обратном порядке:");
        for (int i = Size - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();

    }
}
