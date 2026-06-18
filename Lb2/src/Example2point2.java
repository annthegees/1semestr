import java.util.Scanner;

public class Example2point2 {

    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите день недели");
        String day = in.nextLine();

        if (day.equals("понедельник")){
            System.out.println("понедельник это 1");
        }
        else if (day.equals("вторник")){
            System.out.println("вторник это 2");
        }
        else if (day.equals("среда")){
            System.out.println("среда это 3");
        }
        else if (day.equals("четверг")){
            System.out.println("четверг это 4");
        }
        else if (day.equals("пятница")){
            System.out.println("пятница это 5");
        }
        else if (day.equals("суббота")){
            System.out.println("суббота это 6");
        }
        else if (day.equals("воскресенье")){
            System.out.println("воскресенье это 7");
        }
        else {
            System.out.println("некорректное значение");
        }

    }
}