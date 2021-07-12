package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    String processor; // процессор
    double randomAccessMemory; //операвтивная память
    double hardDisk; //жесткий диск
    int fullCycleLife; // ресурс полных циклов

    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", randomAccessMemory=" + randomAccessMemory +
                ", hardDisk=" + hardDisk +
                ", fullCycleLife=" + fullCycleLife +
                '}';
    }

//описание (вывод полей)
//    void specification() {
//        System.out.println("Процессор:" + processor);
//        System.out.println("Оперативная память:" + randomAccessMemory);
//        System.out.println("Жесткий диск:" + hardDisk);
//        System.out.println("Ресурс полных циклов:" + fullCycleLife);
//    }

    //метод включить (on())
    //    - при включении может произойти сбой, поэтому при вызове метода on() необходимо написать следующую логику:
    //    на консоль вывести сообщение (Внимание! Введите 0 или 1)
    //    создать экземпляр класса Random, который будет генерировать число 0 или 1.
    //    если введенное вами число совпадет с рандомным, то компьютер выключается, вызывается метод off().
    //    если введенное вами число не совпадет с рандомным, то компьютер сгорает.
    //    - при повтороном включении компьютра, если он сгорел необходимо выдать сообщение "Компьютер сгорел!"

    public void on() {

        if (fullCycleLife == 0) {
            System.out.println("Компьютер сгорел");
        } else {
            // подключаем сканер, принимающий число из консоли
            System.out.println("Внимание! Введите 0 или 1");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            // подключаем генерирование рандомных чисел
            Random random = new Random();
            double randomNumber = (int) (Math.random() * 2);

            if (number == randomNumber) {
                off();
            } else {
                System.out.println(" Компьютер сгорел!");
            }
        }
    }

    void off() {
        fullCycleLife--;
    }

}



