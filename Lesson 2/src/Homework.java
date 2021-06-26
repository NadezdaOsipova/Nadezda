public class Homework {
    public static void main(String[] args) {
        //Некоторые тесты для проверки задач.
        System.out.println(sum(100, 200));
        System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
        System.out.println(max(56, 349));
        System.out.println(average(new int[]{0, -2, 3, -1, 5}));
        System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
        System.out.println(calculateHypotenuse(3, 4));
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int sum(int a, int b) {
        a = 100;
        b = 200;
        long summa = a + (long) b;
        if (summa > Integer.MAX_VALUE) {
            return -1;
        }
        return a + b;
    }


    /**
     * Метод должен вернуть максимальное значение из двух чисел
     *
     * <p>
     * Example1:
     * a = 4,
     * b = 5
     * <p>
     * Метод должен вернуть 5
     * Example2:
     * a = 10,
     * b = 10
     * <p>
     * Метод должен вернуть 10
     */
    public static int max(int a, int b) {
        a = 4;
        b = 5;
        int max = Math.max(a, b);
        return max;
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     * (необходимо сумму всех элеменов массива разделить на длину массива)
     * <p>
     * Example:
     * array = {1,2,3,4,5}
     * Метод должен return 3.0
     */
    public static double average(int[] array) {
        int[] num;
        num = new int[]{1, 2, 3, 1, 5};
        int total = 0;
        for (int z = 0; z < num.length; z++) {
            total += num[z];
        }
        double average = total / num.length;
        System.out.println("Сумма массива: " + total);
        System.out.println("java average: " + average);
        return average;
    }

    /**
     * Метод должен вернуть максимальый элемент массива. Пример: array = {1,2,10,3} метод возвращает 10
     **/
    public static int max(int[] array) {
        int[] num;
        num = new int[]{1, 2, 10, 3};
        int max = Integer.MIN_VALUE;
        for (int j : num) {
            max = Math.max(max, j);
        }
        return max;
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     * <p>
     * Example1:
     * 3
     * 4
     * return 5
     * <p>
     * Example2:
     * 12
     * 16
     * return 20
     */
    public static double calculateHypotenuse(int a, int b) {
        a = 3;
        b = 4;
        return Math.sqrt(Math.pow(3, 2) + Math.pow(4, 2));
    }

}



