import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        amountAmeba();
        summa(2, 4);
        summa(-2, 4);
        summa(-2, -4);
        System.out.println(summa(2, 4));
        System.out.println(summa(-2, 4));
        System.out.println(summa(-2, -4));
        triangle();
        reverseOrder();
        maxIndex();
        positiveNumber();
        replacingTheIndexWithZero(new int[]{});
        zeroElement(new int[]{});
        repeatingElements();
        transpositionMatrix(new int[][]{});

    }

//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа

    public static void amountAmeba() {
        int ameba = 1;
        for (int i = 0; i <= 24; i += 3) {
            ameba *= 2;
            System.out.print(ameba + " ");
        }
        System.out.println();
        System.out.println("-----");

    }

    //        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static int summa(int a, int b) {

        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int sum = 0;
        int total = 0;

        while (sum < absB) {
            total += absA;
            sum++;
        }
        return total;
    }

//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

//        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *


    public static void triangle() { // не могу понять как зеркально отразить эти 2 треугольника

        int[][] triangle = new int[4][4];
        int i, j;

        for (i = triangle.length; i >= 0; i--) {
            for (j = i; j < triangle.length; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (i = 0; i < triangle.length; i++) {
            for (j = i; j < triangle.length; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


//        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"

    public static void positiveNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число: ");
        int size = scanner.nextInt();
        int f = Math.abs(size);
        String str = Integer.toString(f);

        int len = str.length();

        if (size > 0) {
            if (size != 0) {
                System.out.println(size + " - число положительное");
            } else {
                System.out.println(size + " - не является не положительным, не отрицательным числом");
            }
        } else if (size < 0) {
            System.out.println(size + " - число отрицательное");
        }

        System.out.println("Количество цифр = " + len);

        System.out.println();
        System.out.println("-----");
        System.out.println();

    }

    //   5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).

    public static void reverseOrder() {
        int a = 0;
        for (int b = 0; b < 100; b++) {
            if (b % 2 != 0) {
                a++;
            }
        }
        int[] oddNumbers = new int[a];
        for (int i = 0; i < oddNumbers.length; i++) {
            oddNumbers[i] = 2 * i + 1;
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println(" "); //выводит обратный массив без 1, только 49 элементов и мне это не нравится иначе пишет ошибку. что длина только 50
        for (int b = oddNumbers.length - 1; b >= 0; b--) {
            System.out.print(oddNumbers[b] + " ");
        }
        System.out.println();
        System.out.println("-----");
        System.out.println();
    }

    //     6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10

    public static void maxIndex() {
        Random random = new Random();

        int[] matrix = new int[12];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(15);
            System.out.print(matrix[i] + " ");
        }
        int maxNumber = matrix[0];
        int maxIndex = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] >= maxNumber) {
                maxNumber = matrix[i];
                maxIndex = i;
            }
        }
        System.out.println(" Максимальный элемент масcива: " + maxNumber + " и индекс его последнего вхождения " + maxIndex);
        System.out.println();
        System.out.println("-----");
        System.out.println();
    }

// 7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.

    public static void replacingTheIndexWithZero(int[] matrix) {
        Random random = new Random();

        matrix = new int[20];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(20);
            //     System.out.println(Arrays.toString(matrix);
            System.out.print(matrix[i] + " "); //пробовала вывести через Аrrays.to String  но выдает 20 массивов с 20 элементами
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            if (0 != matrix[i] % 2) {
                matrix[i] = 0;
            }
            System.out.print(matrix[i] + " ");
        }
        System.out.println();
        System.out.println("-----");
        System.out.println();
    }

    //        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом
    public static void zeroElement(int[] mas) {
        mas = new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2};
        int temp1 = 0;
        int maxNumber = mas[0];
        int maxIndex = 0;
        System.out.println(Arrays.toString(mas));

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] >= maxNumber) {
                maxNumber = mas[i];
                maxIndex = i;
            }
        }
        System.out.println(" Максимальный элемент масcива: " + maxNumber + " и индекс его последнего вхождения " + maxIndex);

        temp1 = mas[maxIndex];
        mas[maxIndex] = mas[0];
        mas[0] = temp1;
        System.out.println(Arrays.toString(mas));

        System.out.println();
        System.out.println("-----");
        System.out.println();
    }


//        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов

    public static void repeatingElements() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число: ");
        int size = scanner.nextInt();
        int[] repeatingElements = new int[size];
        int count = 0;
        int numb = 0;
        int maxNumb = 0;

        for (int i = 0; i < repeatingElements.length; i++) {
            repeatingElements[i] = random.nextInt(20);
            System.out.print(repeatingElements[i] + " ");
        }


        for (int i = 0; i < repeatingElements.length; i++) {
            count = 1; //обнуление подсчета
            for (int j = i + 1; j < repeatingElements.length; j++) {
                numb = repeatingElements[i];  //совпадение по числу
                if (repeatingElements[i] == repeatingElements[j] && (j != i)) {
                    count++;
                }
            }
            if ((maxNumb <= count) && (count != 1)) {
                maxNumb = count; //присваиваем максимальное
                System.out.println("Число: " + numb + ", встречается: " + maxNumb);
            }
            if (maxNumb == 0) {
                System.out.println("Число не повторяются!");
            }
        }
    }

    //        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void transpositionMatrix(int[][] squareArray) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите число: ");
        int size = scanner.nextInt();

// созаем матрицу, заполняем и выводи на экран
        squareArray = new int[size][size];
        for (int i = 0; i < squareArray.length; i++) {
            System.out.println();
            for (int j = 0; j < squareArray.length; j++) {
                squareArray[i][j] = random.nextInt(50);
                System.out.print(squareArray[i][j] + " ");
            }
        }
        // транспонирование матрицы
        for (int i = 0; i < squareArray.length; i++) {
            for (int j = 0; j < squareArray.length; j++) {
                int temp = squareArray[i][j];
                squareArray[i][j] = squareArray[j][i];
                squareArray[j][i] = temp;
            }
        }
// вывод транспонированной матрицы
        System.out.println();
        for (int i = 0; i < squareArray.length; i++) {
            System.out.println();
            for (int j = 0; j < squareArray.length; j++) {
                System.out.print(squareArray[j][i] + " ");
            }
        }
    }

}



