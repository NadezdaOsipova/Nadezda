package hw1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextFormatterImpl implements TextFormatter {

    //считываем файл
    @Override
    public List<String> readFilesAsStringList(String path) {
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
    public void createNewFile(String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.flush();//при вызове flush файлы из буфера записываются в файл.
        }
    }

}







