package lr1;

import java.util.Scanner;
import java.util.Calendar;

public class Example10 {
    static void main(String[] args) {

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Scanner in = new Scanner(System.in);

        System.out.println("введите свой год рождения ");
        int year = in.nextInt();

        System.out.println("ваш возраст: " + (currentYear - year) + " лет");
        in.close();




    }
}
