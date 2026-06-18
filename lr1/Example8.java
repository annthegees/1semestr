package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("текущий день недели: ");
        String week = in.nextLine();

        System.out.println("текущий месяц: ");
        String month = in.nextLine();

        System.out.println("какое сегодня число? ");
        int day = in.nextInt();


        System.out.println("дата сегодня: " + week + " " + day + " " + month);
        in.close();

    }

}
