package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.println("1. Первое задание. \n2. Второе задание. \n3. Третье задание. \nЛюбая иная цифра - выход.");
            int temp = sc.nextInt();

            switch (temp) {
                case 1:
                    System.out.println("Введите километры");
                    double kilo = sc.nextInt();
                    while (kilo < 0) {
                        System.out.println("Введите положительное число");
                    }
                    if (kilo == 0) {
                        System.out.println("Это будет 0 метров."+'\n');
                    } else {
                        int meeters = (int) (kilo * 1000);
                        System.out.print(kilo + " километров это " + meeters+ " метров"+'\n');
                    }
                    break;
                case 2:
                    int a, b;
                    System.out.println("Введите число А");
                    a = sc.nextInt();
                    System.out.println("Введите число В");
                    b = sc.nextInt();
                    if (a % b == 0) {
                        System.out.println("Да, делится без остатка"+'\n');
                    } else {
                        System.out.println("Нет, не делится без остатка"+'\n');
                    }
                    break;
                case 3:
                    System.out.println("Вывести все числа, кратные 3... хм.");
                    int c = 3;
                    while (c < 100) {
                        if (c % 3 == 0) {
                            System.out.println(c);
                        }
                        c++;
                    }
                    System.out.println("но можно ведь");
                    for (int i = 3; i < 100; i += 3) {
                        System.out.println(i);
                    }
                    System.out.println("А ещё можно:");
                    c = 3;
                    do {
                        System.out.println(c);
                        c +=3;
                    } while (c<100);
                    break;
                default:
                    isTrue = false;
                    break;
            }

        }

        sc.close();
    }
    
}
