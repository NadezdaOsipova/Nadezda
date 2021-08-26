package hw1;

import java.io.IOException;
import java.util.List;

public interface TextFormatter {

    List<String> readFilesAsStringList(String path) throws IOException;//считываем в массив

    List<String> createNewFile(String path) throws IOException;//записываем в файл

    boolean isPolindrome(String word);

    boolean arrayPolindrome(String[] words);
    void addFile(String text, String path) throws IOException;
}
