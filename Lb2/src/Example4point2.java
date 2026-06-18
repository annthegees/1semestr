import java.util.Scanner;

public class Example4point2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите первое целое число");
        int a = in.nextInt();
        System.out.println("введите второе целое число");
        int b = in.nextInt();

        if (a == b) {
            System.out.print("a");

        } else if (a > b) {

            System.out.print((b + " "));

            int n = b;

            while (n <= a-1) {
                int c = b + 1;
                System.out.print(c + " ");
                b = c;
                n++;
            }


        } else if (a < b) {

            System.out.print((a + " "));
            int n = a;

            while (n <= b-1) {
                int c = a + 1;
                System.out.print(c + " ");
                a = c;
                n++;
            }
        }
    }
}
