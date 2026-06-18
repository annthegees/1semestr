import java.util.Arrays;

public class Example7 {
    public static int[] charArrayToCodeArray(char[] charArray) {
        if (charArray == null) {
            return null;
        }

        int[] codeArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            codeArray[i] = charArray[i];  // Автоматическое преобразование char -> int
        }

        return codeArray;
    }

    public static void testConversion(char[] charArray) {
        System.out.print("charArrayToCodeArray(" + Arrays.toString(charArray) + ") = ");
        int[] result = charArrayToCodeArray(charArray);
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        System.out.println("=== Преобразование символьного массива в массив кодов ===\n");

        char[] test1 = {'A', 'B', 'C'};
        char[] test2 = {'1', '2', '3'};
        char[] test3 = {'!', '@', '#'};
        char[] test4 = {'Я', 'ю', 'Ъ'};
        char[] test5 = {};  // пустой массив
        char[] test6 = null;  // null

        testConversion(test1);
        testConversion(test2);
        testConversion(test3);
        testConversion(test4);
        testConversion(test5);
        testConversion(test6);

        System.out.println("\nПримеры кодов символов:");
        char[] examples = {'A', 'a', '0', ' ', 'Я', 'Ω', '你'};
        for (char ch : examples) {
            int code = ch;  // Автоматическое преобразование
            System.out.printf("  '%c' -> %d (0x%04X)\n", ch, code, code);
        }

        System.out.println("\nПроверка обратного преобразования:");
        char[] original = {'H', 'e', 'l', 'l', 'o'};
        int[] codes = charArrayToCodeArray(original);
        char[] restored = new char[codes.length];

        for (int i = 0; i < codes.length; i++) {
            restored[i] = (char) codes[i];  // Явное преобразование int -> char
        }

        System.out.println("Исходный: " + Arrays.toString(original));
        System.out.println("Коды: " + Arrays.toString(codes));
        System.out.println("Восстановленный: " + Arrays.toString(restored));
        System.out.println("Совпадают: " + Arrays.equals(original, restored));
    }
}
