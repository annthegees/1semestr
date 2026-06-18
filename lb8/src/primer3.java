import java.io.*;

public class primer3 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("E:\\MyFile1.txt");
            BufferedInputStream bis = new BufferedInputStream(fis, 5);

            int data;
            while ((data = bis.read()) != -1) {
                System.out.print((char) data);
            }

            bis.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}