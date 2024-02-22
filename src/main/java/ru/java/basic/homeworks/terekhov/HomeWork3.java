package ru.java.basic.homeworks.terekhov;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {



    }

    public static int sumSecondElements(int[][] arr) {
        if (arr == null) {
            return -1;
        }
        if (arr.length <= 1 || arr[1] == null) {
            return -1;
        }
        int sum = 0;
        int index = 1;
        for (int i = 0; i < arr[index].length; i++) {
            sum += arr[index][i];
        }
        return sum;
    }

    public static int findMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max <= arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        return max;
    }

    public static int zeroFill(int[][] arr) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sum;
                if (arr[i] == arr[j]) {
                    arr[i][j] = 0;
                }
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
        return sum;
    }

    private static void zeroFill2(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    arr[i][j] = 0;
                }
                if (i == (j - arr.length + 1) * -1) {
                    arr[i][j] = 0;
                }
                System.out.print(" " + arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void size(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + "*" + " ");
            }
            System.out.println();
        }
    }

    public static int sumOfPositiveElements(int[][] arr) {
        int positiveElements = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0) {
                    positiveElements += arr[i][j];
                }
            }
        }
        return positiveElements;
    }
}
