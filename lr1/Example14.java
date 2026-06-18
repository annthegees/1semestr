package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("введите число");
        int x1 = in.nextInt();
        int x2 = x1 + 1;
        int x3= x1-1;
        double x4 = Math.pow(x1, 2);

        System.out.println(x3 + " " + x1 + " " + x2 + " " + x4);
        in.close();

    }
}
