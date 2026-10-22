package org.example;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        boolean isTrue = true;
        //8. Найти индекс максимального элемента.
        //8. Умножить матрицу 5x5 на число (все элементы умножить на X).
        while (isTrue){
            System.out.println("1. Первое задание.\n2. Второе задание.\nЛюбое другое число - выйти из приложения.");
            int temp = sc.nextInt();

            switch (temp){
                case 1:
                    System.out.println("Первое задание: найти максимальное значение.");
                    int[] arr = new int[10];
                    int max = Integer.MIN_VALUE;
                    for (int i = 0; i < arr.length; i++){
                        arr[i] = random.nextInt(35);
                        System.out.print(arr[i]+ "; ");
                    }
                    for(int i = 0; i<arr.length; i++){
                        if (max < arr[i]){
                            max = arr[i];
                        }
                    }
                    System.out.println("Максимальное значение:" + max);
                    break;

                case 2:
                    System.out.println("Второе задание: умножить матрицу на вводимое число.");
                    int[][] matrix = new int[5][5];
                    for (int i = 0; i < 5; i++){
                        for (int j = 0; j< 5; j++){
                            matrix[i][j] = random.nextInt(10);
                            System.out.println(matrix[i][j] + "; ");
                        }
                        System.out.println();
                    }
                    System.out.println("Введите число:");
                    int multi = sc.nextInt();

                    for (int i = 0; i < 5; i++){
                        for (int j = 0; j< 5; j++){
                            matrix[i][j] *= multi;
                        }
                    }
                    System.out.println();
                    for (int i = 0; i < 5; i++){
                        for (int j = 0; j< 5; j++){
                            System.out.println(matrix[i][j] + "; ");
                        }
                        System.out.println();
                    }
                    break;
                default:
                    isTrue = false;
                    break;
            }

        }

        sc.close();
    }
}
