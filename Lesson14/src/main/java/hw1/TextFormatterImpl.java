package hw1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import static constants.ConstantsFile.INPUT_FILE_HW1;
import static constants.ConstantsFile.OUTPUT_FILE_HW1;

public class TextFormatterImpl implements TextFormatter {

    @Override
    public void reading() {//считывание файла
        try {
            FileInputStream fis = new FileInputStream(INPUT_FILE_HW1);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void write() {//запись файла
        try {
            FileOutputStream fos = new FileOutputStream(OUTPUT_FILE_HW1);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void words() {//поиск слов - палиндромов

    }
}
