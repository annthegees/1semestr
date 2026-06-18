import java.util.Scanner;

public class Example2point1 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите день недели");

        String day = in.nextLine();
        if (switch (day) {
            case "понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье" -> true;
            default -> false;
        }) {
            switch (day) {

                case "понедельник":
                    System.out.println("понедельник это 1");
                    break;
                case "вторник":
                    System.out.println("вторник это 2");
                    break;
                case "среда":
                    System.out.println("среда это 3");
                    break;
                case "четверг":
                    System.out.println("четверг это 4");
                    break;
                case "пятница":
                    System.out.println("пятница это 5");
                    break;
                case "суббота":
                    System.out.println("суббота это 6");
                    break;
                case "воскреенье":
                    System.out.println("воскресенье это 7");
                    break;
            }
        } else{
                System.out.println("некорректное значение");
            }

        }
    }





