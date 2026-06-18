import java.util.Scanner;

public class Example3 {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите длину последовательности");
        int n = in.nextInt();

        if (n <= 0) {

            System.out.println("число должно быть положительным");
            return;
        }
        if (n == 1) {
            System.out.println("1");
        }
        else if (n==2) {
            System.out.println("1 1");
        }
        else{
            int a = 1;
            int b = 1;

            System.out.print(("1 1 "));

            for (int i = 3; i <= n; i++){

                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
    }
}
