package com.home.model;

import java.util.Random;
import java.util.Scanner;

public class Computer {

    private String processor; // процессор
    private double randomAccessMemory; //операвтивная память
    private double hardDisk; //жесткий диск
    private int fullCycleLife; // ресурс полных циклов

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getRandomAccessMemory() {
        return randomAccessMemory;
    }

    public void setRandomAccessMemory(double randomAccessMemory) {
        this.randomAccessMemory = randomAccessMemory;
    }

    public double getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(double hardDisk) {
        this.hardDisk = hardDisk;
    }

    public int getFullCycleLife() {
        return fullCycleLife;
    }

    public void setFullCycleLife(int fullCycleLife) {
        this.fullCycleLife = fullCycleLife;
    }

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
                System.out.println("Компьютер включается!");
                off();
            } else {
                System.out.println(" Компьютер сгорел!");
            }
        }
    }

    void off() {
        fullCycleLife--;
        System.out.println("Компьютер выключается!");
    }

    public Computer(String processor, double randomAccessMemory, double hardDisk, int fullCycleLife) {
        this.processor = processor;
        this.randomAccessMemory = randomAccessMemory;
        this.hardDisk = hardDisk;
        this.fullCycleLife = fullCycleLife;
    }
}



