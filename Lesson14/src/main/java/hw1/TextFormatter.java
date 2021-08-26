package hw1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface TextFormatter {

    List<String> readFilesAsStringList(String path) throws IOException;//считываем в массив

    void createNewFile(String path) throws IOException;//записываем в файл
}
