package lr1;

import java.util.Scanner;
import java.util.Calendar;

public class Example11 {
    static void main(String[] args) {

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Scanner in = new Scanner(System.in);

        System.out.println("введите свое имя и год рождения ");
        String input = in.nextLine();

        String[] parts = input.split(" ");
        String name = parts[0];
        int year = Integer.parseInt(parts[1]);

        System.out.println("ваше имя и  возраст: " + name + " " + (currentYear - year));
        in.close();

    }
}
