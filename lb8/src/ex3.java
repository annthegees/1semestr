import java.io.*;

public class ex3 {
    public static void main(String[] args) {
        String sourcePath = "E:\\Task3\\source.txt";
        String resultPath = "E:\\Task3\\result.txt";

        try {
            // Создаем исходный файл с текстом
            createSourceFile(sourcePath);

            // Обрабатываем файл
            processFile(sourcePath, resultPath);

            System.out.println("Обработка завершена. Результат в: " + resultPath);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    private static void createSourceFile(String path) throws IOException {
        File file = new File(path);
        file.getParentFile().mkdirs();

        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream(file), "cp1251"))) {

            writer.write("Вот море, вот Пермь дремучая,");
            writer.newLine();
            writer.write("Вот белый свет, а вот и тьма.");
            writer.newLine();
            writer.write("Вот за морем, за лесами");
            writer.newLine();
            writer.write("Есть далекие края.");
            writer.newLine();
            writer.write("Там моря, там горы, там леса,");
            writer.newLine();
            writer.write("Там белые медведи и чудеса.");
            writer.newLine();
        }
    }

    private static void processFile(String sourcePath, String resultPath) throws IOException {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(sourcePath), "cp1251"));
             PrintWriter writer = new PrintWriter(
                     new OutputStreamWriter(
                             new FileOutputStream(resultPath), "cp1251"))) {

            String line;
            int lineNumber = 0;

            while ((line = reader.readLine()) != null) {
                lineNumber++;

                // Разбиваем строку на слова
                String[] words = line.split("[\\s.,!?;:]+");

                // Собираем слова, начинающиеся с согласных
                StringBuilder selectedWords = new StringBuilder();
                int count = 0;

                for (String word : words) {
                    if (!word.isEmpty() && startsWithConsonant(word)) {
                        if (selectedWords.length() > 0) {
                            selectedWords.append(" ");
                        }
                        selectedWords.append(word);
                        count++;
                    }
                }

                // Записываем результат для строки
                writer.println("Строка " + lineNumber +
                        " (количество слов: " + count + "): " + selectedWords);
            }
        }
    }

    private static boolean startsWithConsonant(String word) {
        if (word.isEmpty()) return false;

        String firstLetter = word.substring(0, 1).toLowerCase();

        // Согласные буквы русского алфавита
        String consonants = "бвгджзйклмнпрстфхцчшщ";

        return consonants.contains(firstLetter);
    }
}