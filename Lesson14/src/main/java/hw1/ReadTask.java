package hw1;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadTask {
    //  public static final String OUTPUT_FILE = "Lesson14/src/main/resources/output.txt";
    public static final String INPUT_FILE = "Lesson14/src/main/resources/input.txt";

    public static void main(String[] args) {
        FileInputStream fis;
        {
            try {
                fis = new FileInputStream(INPUT_FILE);
                byte[] bytes = new byte[fis.available()];
                fis.read(bytes);
             System.out.println(new String(bytes));


StringBuilder stringBuilder = new StringBuilder();


            } catch (IOException e) {
                e.printStackTrace();
            }


        }
    }
 //for (int i = 0; i < str.length; i++) {//бегу по массиву
       // String reverseString = new StringBuilder(str[i]).reverse().toString();//создается строчка-реверс
       // if (reverseString.equalsIgnoreCase(str[i])) {//сравнивание изначальной строки со строкой-реверсом
          //  System.out.println(str[i] + " является словом палиндромом");//вывод на консоль
      //  }

    //List[] lists = new List[count];
    // try {
    //  FileInputStream fis = new FileInputStream(INPUT_FILE);
    //  ObjectInputStream ois = new ObjectInputStream(fis);
    //  int count = ois.readInt();
    // List[] lists = new List[count];

    //  for (int i = 0; i < count; i++) {
    //      lists[i] = (List) ois.readObject();
    // }
    // System.out.println(Arrays.toString(lists));
    // ois.close();
    // } catch (IOException | ClassNotFoundException e) {
    //     e.printStackTrace();
    // }

    // FileInputStream fis= null;
    // int i = 0;
//        //  try {
    //     fis = new FileInputStream(INPUT_FILE);
    //  } catch (FileNotFoundException e) {
    //  e.printStackTrace();
    //  }

}

