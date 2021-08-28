package hw1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public String readFilesAsString(String path) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            FileReader fileReader = new FileReader(path);
            int symbol;
            while ((symbol = fileReader.read()) != -1) {
                stringBuilder.append((char) symbol);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return processedString(stringBuilder.toString());
    }

    private String processedString(String text) {
        return text.replaceAll("-*\r\n", "");
    }

    //записываем файл
    @Override
    public void createNewFile(String path) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.flush();//при вызове flush файлы из буфера записываются в файл.
        }
    }

    @Override
    public boolean isPolindrome(String word) {
        String reverseString = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reverseString) && word.length() > 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean wordRange(String[] words) {
        for (String word : words) {
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

    @Override
    public List<String> divisionIntoSentences(String text) {//разделение на предложения
        return List.of(text.split("[.!?]"))
                .stream()
                .map(String::trim)
                .collect(Collectors.toList());
    }

    @Override
    public String[] divisionIntoWords(String text) {// разделение на слова
        String delimeter = " ";//ввожу переменную по которой будет текст разделяться на слова
        return text.split(delimeter);
    }
}






