package hw1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

import static constants.ConstantsFile.INPUT_FILE_HW1;

public class TextFormatterImpl implements TextFormatter {

    @Override
    public void reading() {
        try (FileInputStream fileInputStream = new FileInputStream(INPUT_FILE_HW1)) {
            final byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);
            System.out.println(new String(bytes));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        // try {
        //  FileInputStream fis = new FileInputStream(INPUT_FILE_HW1);
        //  ObjectInputStream ois = new ObjectInputStream(fis);
        //  String[] word = (String[]) ois.readObject();
        //  System.out.println(Arrays.toString(word));
        //  ois.close();
            //  int count = ois.readInt();
            //String [] words = new String[count];
            // for (int i = 0; i < count; i++) {
            //    words[i] = (String) ois.readObject();
            //   }
        // } catch (IOException | ClassNotFoundException e) {
        //     e.printStackTrace();
        //  }
    }

    @Override
    public void write() {

    }

    @Override
    public void words() {

    }
}
