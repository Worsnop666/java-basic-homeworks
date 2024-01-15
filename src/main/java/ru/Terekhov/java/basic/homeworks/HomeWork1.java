package ru.Terekhov.java.basic.homeworks;

public class HomeWork1 {
    public static void main(String[] args) {
        greetings();
        checkSigh(0, 0, 0);
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(10, 11, false);
    }


    //Задание 1:
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");

    }

    //Задание 2:
    public static void checkSigh(int a, int b, int c) {
        int result = (a + b + c);
        if (result >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательна");
        }
    }

    //Задание 3:
    public static void selectColor() {
        int data = 10;
        {
            if (data < 10) {
                System.out.println("Красный");
            }
            if (data >= 10 && data < 20) {
                System.out.println("Желтый");
            }
            if (data >= 20) {
                System.out.println("Зеленый");
            }
        }
    }

    //Задание 4:
    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }

    }

    //Задание 5:
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment == true) {
            int sum = initValue + delta;
            System.out.println(sum);
        }
        if (increment == false) {
            int sum1 = initValue - delta;
            System.out.println(sum1);
        }


    }

}





