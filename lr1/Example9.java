package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("назовите месяц: ");
        String month = in.nextLine();

        System.out.println("сколько дней в этом месяце?: ");
        int days = in.nextInt();

        System.out.println(month + " содержит " + days + " дней");
        in.close();

    }

}
