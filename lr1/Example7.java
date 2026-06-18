package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("введите имя и возраст:");
        String text = in.nextLine();

        System.out.println("ваше имя и возраст:" + text);
        in.close();
    }


}
