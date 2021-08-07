package hw1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteTask {
    public static final String OUTPUT_FILE = "Lesson14/src/main/resources/output.txt";
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream(OUTPUT_FILE);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

     //       oos.writeInt( );

        } catch (IOException e) {


        }

    }
}
