import java.util.Scanner;

public class Example4point1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите первое целое число");
        int a = in.nextInt();
        System.out.println("введите второе целое число");
        int b = in.nextInt();

        if (a == b) {
            System.out.print("a");

        } else if (a > b) {

            System.out.print((b + " " ));

            for (int i = b+1; i <= a; i++) {

                int c = b + 1;
                System.out.print(c + " ");
                b = c;
            }


        }
        else if (a < b) {

            System.out.print((a + " " ));

            for (int i = a+1; i <= b; i++) {

                int c = a + 1;
                System.out.print(c + " ");
                a = c;
            }


        }
    }
}