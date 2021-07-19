import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        calculateSumOfDiagonalElements();
    }


        public static void calculateSumOfDiagonalElements() {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Введите число: ");
            int w = scanner.nextInt();         // Совсем не понимаю ошибку, он передает не хочет работать. Грустный смайлик

            int[][] mat1= new int[w][w];
            int summa = 0;

            for (int i = 0; i < mat1.length; i++) {
                for (int j = 0; j < mat1.length; j++) {
                    mat1[i][j] = (int) (Math.random() * (25));
                    System.out.print(mat1[i][j] + "\t");
                    System.out.println();

                    if (i == j) {
                        summa += mat1[i][j];
                   }
               }

            }

            System.out.println("Сумма = " + summa);
        }


    }

