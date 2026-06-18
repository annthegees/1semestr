package lr1;
import java.util.Scanner;

public class Example6 {
    static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("введите вашу фамилию: ");
        String name = in.nextLine();

        System.out.println("введите ваше имя: ");
        String name_2 = in.nextLine();

        System.out.println("введите ваше отчество: ");
        String fathername = in.nextLine();

        System.out.println("фамилия: " + name);
        System.out.println("имя: " + name_2);
        System.out.println("отчество: " + fathername);
        in.close();


    }

}
