import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HomeWork1 {
    public static final String OUTPUT_FILE = "Lesson14/src/main/resources/output.txt";
    public static final String INPUT_FILE = "Lesson14/src/main/resources/input.txt";

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream(INPUT_FILE)) {
            final byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes));

            for (int i = 0; i < bytes.length; i++) {//бегу по массиву
                String reverseString = new StringBuilder(bytes[i]).reverse().toString();//создается строчка-реверс
                if (reverseString.equalsIgnoreCase(String.valueOf(bytes[i]))) {//сравнивание изначальной строки со строкой-реверсом
                    System.out.println(bytes[i] + " является словом палиндромом");//вывод на консоль
                }
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
