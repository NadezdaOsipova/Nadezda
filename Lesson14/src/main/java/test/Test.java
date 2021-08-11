package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

import static constants.ConstantsFile.INPUT_FILE_HW1;

public class Test {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(INPUT_FILE_HW1);
            ObjectInputStream ois = new ObjectInputStream(fis);
            String[] word = (String[]) ois.readObject();
            System.out.println(Arrays.toString(word));
            ois.close();
            //  int count = ois.readInt();
            //String [] words = new String[count];
            // for (int i = 0; i < count; i++) {
            //    words[i] = (String) ois.readObject();
            //   }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
