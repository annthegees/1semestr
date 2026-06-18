import java.util.Scanner;

public class Example1 {

    static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("введите число от 1 до 7");

        int day = in.nextInt();
        if (day < 7 && day > 1)
        {
            switch ( day ) {

                case 1:
                    System.out.println("сегодня понедельник");
                    break;
                case 2:
                    System.out.println("сегодня вторник");
                    break;
                case 3:
                    System.out.println("сегодня среда");
                    break;
                case 4:
                    System.out.println("сегодня четверг");
                    break;
                case 5:
                    System.out.println("сегодня пятница");
                    break;
                case 6:
                    System.out.println("сегодня суббота");
                    break;
                case 7:
                    System.out.println("сегодня воскресенье");
                    break;
            }
        }
        else{
                System.out.println("некорректное значение");
            }

        }

    }

