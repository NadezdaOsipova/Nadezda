package hw1;

import java.io.IOException;
import java.util.List;

public interface TextFormatter {

    List<String> readFilesAsStringList(String path) throws IOException;//считываем в массив

    void createNewFile(String path) throws IOException;//записываем в файл

    boolean isPolindrome(String word);// слова - палиндромы

    boolean wordRange(String[] words);//предложение из 3-5 слов

    void addFile(String text, String path) throws IOException;//добавляем

    List<String> divisionIntoSentences(String text);// разделение текста на предложения

    String[] divisionIntoWords(String text);//разделение текста на слова

    String readFilesAsString(String path);
}
