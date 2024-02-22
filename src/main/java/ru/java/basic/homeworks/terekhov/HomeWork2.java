package ru.java.basic.homeworks.terekhov;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {


    }

    // Задание 5:
    private static void task5() {
        int[] arr = {5, 7, 3, 3, 6, 10, 3, 4, 1, 2};
        int sumHalf1 = 0;
        int sumHalf2 = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sumHalf1 += arr[i];
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            sumHalf2 += arr[i];
        }
        if (sumHalf1 < sumHalf2) {
            System.out.println(sumHalf2 + "Вторая часть массива больше");
        } else {
            System.out.println(sumHalf1 + "Первая часть массива больше");
        }
    }

    // Задание 4:
    private static void task4() {
        int[] arr = new int[5];
        int targetNumber = 4;
        for (int i = 0; i < arr.length; i++) {
            arr[i] += targetNumber;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Задание 3:
    public static void task3(int a, int... arr) {
        System.out.println(arr[0]);
        System.out.println(arr.length - 1);
    }


    // Задание 2:
    private static void task2() {
        int[] arr = {2, 3, 4, 5, 3, 5, 6, 4, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    // Задание 1:
    private static void task1() {
        for (int i = 0; i < 100; i += 10) {
            System.out.println("******");
        }
    }
}
