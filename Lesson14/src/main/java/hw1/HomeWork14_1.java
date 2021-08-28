package hw1;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static constants.ConstantsFile.INPUT_FILE_HW1;
import static constants.ConstantsFile.INPUT_FILE_HW2;
import static constants.ConstantsFile.OUTPUT_FILE_HW1;
import static constants.ConstantsFile.OUTPUT_FILE_HW2;

@Slf4j
public class HomeWork14_1 {

    static TextFormatter textFormatter;

    public static void main(String[] args) throws IOException {
        textFormatter = new TextFormatterImpl();
        task1();//слова палиндромы
        task2();//количество слов
//        task3();
    }

    private static void task1() {
        System.out.println("Слова палиндромы");
        try {
            List<String> stringList = textFormatter.readFilesAsStringList(INPUT_FILE_HW1);
            textFormatter.createNewFile(OUTPUT_FILE_HW1);
            for (String word : stringList) {
                if (textFormatter.isPolindrome(word)) {
                    textFormatter.addFile(word + "\n", OUTPUT_FILE_HW1);
                }
            }
        } catch (IOException e) {
            log.error(e.getMessage());
        }
    }

    private static void task2() throws IOException {
        System.out.println("Разделение на предложения");
        String text = textFormatter.readFilesAsString(INPUT_FILE_HW2);
        List<String> sentences = textFormatter.divisionIntoSentences(text);
        textFormatter.createNewFile(OUTPUT_FILE_HW2);
        for (String sentence : sentences) {
            String[] words = textFormatter.divisionIntoWords(sentence);
            if (words.length >= 3 && words.length <= 5 || textFormatter.wordRange(words));// почему не срабатывает условие про запись по длине
            textFormatter.addFile(sentence + "\n", OUTPUT_FILE_HW2);
        }
    }
}
