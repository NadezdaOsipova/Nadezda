package hw1;

public class HomeWork1 {
    public static void main(String[] args) {
        reading();

    }

}

// public void write() {//запись файла
//    try {
//      FileOutputStream fos = new FileOutputStream(OUTPUT_FILE_HW1);
//      ObjectOutputStream oos = new ObjectOutputStream(fos);

//     oos.writeInt(массив.lenght);//передаем сюда длину массив из слов-палиндромов
//     for (int i = 0; i < массив.lenght; i++) { //бежим по массиву
//         oos.writeObject(//передаем класс массив);//передаем сюда массив из слов-палиндромов
//    }
//    fos.close();

//  } catch (IOException e) {
//      e.printStackTrace();
//  }
// }


//public void words() {//поиск слов - палиндромов
// System.out.println(str1);//вывожу текст для наглядности
// System.out.println("...");//разделяю текст для наглядности
// String[] str = str1.split(" ");//разделяю строку на слова, записывая в массив
//  for (int i = 0; i < str.length; i++) {//бегу по массиву
//  String reverseString = new StringBuilder(str[i]).reverse().toString();//создается строчка-реверс
// if (reverseString.equalsIgnoreCase(str[i])) {//сравнивание изначальной строки со строкой-реверсом
//      System.out.println(str[i] + " является словом палиндромом");//вывод на консоль
//    }
//   }
//  System.out.println("----------------------");


