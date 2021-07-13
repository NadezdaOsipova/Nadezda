import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {
        //Некоторые тесты для проверки задач. Можно также написать свои тесты.
        printArray();
        System.out.println(operation(1));
        System.out.println(operation(0));
        System.out.println(calculateCountOfOddElementsInMatrix(new int[]{1, 2, 3, 4, 5, 6}));
        calculateSumOfDiagonalElements();
        countDevs(103);
        foobar(6);
        foobar(10);
        foobar(15);
        //     printMatrix();
        //   printPrimeNumbers();
    }


    /**
     * Необходимо прочитать с консоли значение числа типа int,
     * далее создать одноменрый массив типа int размера прочитаного с консоли
     * далее заполнить массив случайными значениями
     * далее вывести массив на консоль
     */

    private static void printArray() {
        int num;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print(" Введите число: ");
            num = in.nextInt();
        }

        int[] printArray = new int[num];
        for (int i = 0; i < printArray.length; i++) {
            printArray[i] = (int) (Math.random() * num);
        }
        for (int i : printArray) {
            System.out.print(i + " ");

        }
        System.out.println(" ");
    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */
    public static int operation(int number) {
        if (number > 0) {
            number++;
        } else if (number < 0) {
            number -= 2;
        } else {
            number = 10;
        }
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */

    public static int calculateCountOfOddElementsInMatrix(int[] ints) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        int k = 0;
        for (int i : array) {
            if (i % 2 != 0) {
                k++;
            }
        }
        return k;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     *
     * @param count - количество программистов
     */
    public static void countDevs(int count) {
        int c100 = count % 100;
        int c10 = c100 % 10;

        if (c100 >= 10 && c100 <= 19) {
            System.out.println(count + "программистов");
        } else if (c10 >= 2 && c10 <= 4) {
            System.out.println(count + " программиста");
        } else if (c10 == 1) {
            System.out.println(count + "программист");
        } else {
            System.out.println(count + " программистов");
        }
    }

    /**
     * Метод должен выводить разные строки в консоли в зависимости от некоторых условий:
     * - если остаток от деления на 3 равен нулю - выведите "foo" (example of number - 6)
     * - если остаток от деления на 5 равен нулю - вывести "bar" (example of number - 10)
     * - если остаток от деления на 3 и 5 равен нулю 0 ,то вывести "foobar" (example of number - 15)
     */

    public static void foobar(int number) {
        if (number % 3 == 0) {
            if (number % 5 != 0) {
                System.out.println("foo");
            } else {
                System.out.println("foobar");
            }
        } else if (number % 5 == 0) {
            System.out.println("bar");
        }
    }


    /**
     * заполнить рандомно 2-х мерный массив и посчитать сумму элементов на диагонали
     */

    public static void calculateSumOfDiagonalElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите число: ");
        int w = scanner.nextInt();

        int[][] mat1 = new int[w][w];
        int summa = 0;

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1.length; j++) {
                mat1[i][j] = (int) (Math.random() * (25));
                System.out.println(mat1[i][j]);
                if (i == j) {
                    summa += mat1[i][j];
                }
            }
        }
        System.out.println("Сумма = " + summa);
    }


    /**
     * Шаги по реализации:
     * - Прочитать два int из консоли
     * - Создайте двумерный массив int (используйте целые числа, которые вы читаете по высоте и ширине консоли)
     * - Заполнить массив случайными значениями (до 100)
     * - Вывести в консоль матрицу заданного размера, но:
     * - Если остаток от деления элемента массива на 3 равен нулю - выведите знак "+" вместо значения элемента массива.
     * - Если остаток от деления элемента массива на 7 равен нулю - выведите знак "-" вместо значения элемента массива.
     * - В противном случае выведите "*"
     * <p>
     * Example:
     * - Значения с консоли - 2 и 3
     * - Массив будет выглядеть так (значения будут разными, потому что он случайный)
     * 6 11 123
     * 1 14 21
     * - Для этого значения вывод в консоли должен быть:
     * <p>
     * + * *
     * * - +
     * <p>
     * Обратите внимание, что 21% 3 == 0 и 21% 7 = 0, но выводить надо не +-, а +
     */

    public static void printMatrix() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число : ");
        int firstNumber = in.nextInt();
        System.out.println("Введите второе число : ");
        int secondNumber = in.nextInt();

        int[][] myArray = new int[firstNumber][secondNumber];
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (Math.random() * 100);

                if (myArray[i][j] % 3 == 0) {
                    if (myArray[i][j] % 7 != 0) {
                        System.out.println("+");
                    } else {
                        System.out.println("*");
                    }
                } else if (myArray[i][j] % 7 == 0) {
                    System.out.println("-");
                }
            }
        }
    }


    /**
     * Задача со звездочкой!
     * Метод должен печатать все простые числа <1000
     * что такое просто число (https://www.webmath.ru/poleznoe/formules_18_5.php)
     */

}


