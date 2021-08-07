package hw1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class рк {
    public static final String OUTPUT_FILE = "Lesson14/src/main/resources/output.txt";
    public static final String INPUT_FILE = "Lesson14/src/main/resources/input.txt";

    public static void main(String[] args) {
        try(FileInputStream fis=new FileInputStream(INPUT_FILE);
            FileOutputStream fos=new FileOutputStream(OUTPUT_FILE))
        {
            byte[] buffer = new byte[fis.available()];
            // считываем буфер
            fis.read(buffer);

            String s1 = new String( buffer );
            for (int i = 0; i < s1.length(); i++) {
                String reverseString = new StringBuilder(s1[i]).reverse().toString();
                if (s1.equalsIgnoreCase(reverseString)) {
                    System.out.println(s1[i] + " - слово палиндром");
                }


            }


            // записываем из буфера в файл
            fos.write(buffer);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

}

