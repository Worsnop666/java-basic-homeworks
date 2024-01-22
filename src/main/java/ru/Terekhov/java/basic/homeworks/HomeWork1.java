package ru.Terekhov.java.basic.homeworks;

import java.rmi.MarshalException;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Введите номер метода:");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = scanner.nextInt();
            if (a == 1) {
                greetings();
            } else if (a == 2) {
                checkSigh(1, 1, 1);
            } else if (a == 3) {
                selectColor();
            } else if (a == 4) {
                compareNumbers();
            } else if (a == 5) {
                addOrSubtractAndPrint(1, 1, true);
            } else {
                do {
                    System.out.println("Введенного метода не существует, введите корректный метод (1 - 5)");
                } while (a > 0 && a <= 5);
            }
        }
    }

    //Задание 1:
    public static void greetings() {
        System.out.println("Hello\nWorld\nFrom\nJava");
    }

    //Задание 2:
    public static void checkSigh(int a, int b, int c) {
        a = (int) (Math.random() * 9) - (int) (Math.random() * 9);
        b = (int) (Math.random() * 9) - (int) (Math.random() * 9);
        c = (int) (Math.random() * 9) - (int) (Math.random() * 9);
        int result = (a + b + c);
        if (result >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    //Задание 3:
    public static void selectColor() {
        int data = (int) (Math.random() * 30);
        {
            if (data < 10) {
                System.out.println("Красный");
            } else if (data >= 10 && data < 20) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
        }
    }

    //Задание 4:
    public static void compareNumbers() {
        int a = (int) (Math.random() * 9) + 1;
        int b = (int) (Math.random() * 9) + 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //Задание 5:
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        delta = (int) (Math.random() * 9);
        initValue = (int) (Math.random() * 9);
        int sumbool = delta - initValue;
        if (sumbool > 0) {
            increment = true;
            int sum = initValue + delta;
            System.out.println(sum);
        } else {
            increment = false;
            int sum1 = initValue - delta;
            System.out.println(sum1);
        }
    }
}





