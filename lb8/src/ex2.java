import java.io.*;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        try {
            // Создание исходного файла
            File sourceFile = new File("E:\\Task2\\source.txt");
            sourceFile.getParentFile().mkdirs();

            // Запись данных в исходный файл
            DataOutputStream dos = new DataOutputStream(
                    new FileOutputStream(sourceFile));

            dos.writeUTF("Первая строка в формате UTF-8");
            dos.writeUTF("Вторая строка в формате UTF-8");
            dos.writeDouble(1.5);
            dos.writeDouble(-2.3);
            dos.writeDouble(3.7);
            dos.writeDouble(-4.1);
            dos.writeDouble(5.9);

            dos.flush();
            dos.close();

            // Создание результирующего файла
            File resultFile = new File("E:\\Task2\\result.txt");

            DataInputStream dis = new DataInputStream(
                    new FileInputStream(sourceFile));
            DataOutputStream resultOut = new DataOutputStream(
                    new FileOutputStream(resultFile));

            // Чтение и запись второй строки
            String firstLine = dis.readUTF();  // Пропускаем первую строку
            String secondLine = dis.readUTF(); // Читаем вторую строку
            resultOut.writeUTF(secondLine);
            System.out.println("Вторая строка: " + secondLine);

            // Чтение и запись положительных чисел
            double[] numbers = new double[5];
            for (int i = 0; i < 5; i++) {
                numbers[i] = dis.readDouble();
            }

            System.out.print("Положительные числа: ");
            for (double num : numbers) {
                if (num > 0) {
                    resultOut.writeDouble(num);
                    System.out.print(num + " ");
                }
            }
            System.out.println();

            resultOut.flush();
            resultOut.close();
            dis.close();

            System.out.println("Данные успешно скопированы в: " +
                    resultFile.getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}