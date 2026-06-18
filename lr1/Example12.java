package lr1;

import java.util.Scanner;
import java.util.Calendar;

public class Example12 {
    static void main(String[] args) {

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Scanner in = new Scanner(System.in);

        System.out.println("введите свой возраст ");
        int age = in.nextInt();

        System.out.println("ваш год раждения: " + (currentYear - age));
        in.close();





    }
}
