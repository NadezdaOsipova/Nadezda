package hw1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFormatterImpl implements TextFormatter {

    //считываем файл
    @Override
    public List<String> readFilesAsStringList(String path)  {
        List<String> stringList = new ArrayList<>();//выделяем память под список
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr); // построчно читаем с файла с помощью BufferedReader
            String line;//создаем пременную
            while ((line = br.readLine()) != null) {//записываем в переменную line считанный файл и проверяем уловие,
                // что файл не пустой
                stringList.add(line.trim());//в список сохраняем stringList копии строк без пробелов(trim())
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;//возращаем список
    }

    //записываем файл
    @Override
    public List<String> createNewFile(String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.flush();//при вызове flush файлы из буфера записываются в файл.
        }
        return null;
    }

    @Override
    public boolean isPolindrome(String word) {
        String reverseString = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reverseString) && word.length()>1) {
            return  true;
        }
        return false;
    }

    @Override
    public boolean arrayPolindrome(String[] words) {
        for (String word:words) {
            if (isPolindrome(word)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addFile(String text, String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.write(text);
            bw.flush();//при вызове flush файлы из буфера записываются в файл.
        }
    }


}







