package org.example;

import java.util.Scanner;

/*1. Класс “Билет” (Ticket): Поля: “event”, “seatNumber”, “price”.
Конструктор. Геттеры. Метод “applyDiscount()”. В “main” создать билет и
применить скидку.*/
public class App {
    public static void main(String[] args) {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        while (isTrue) {
            try {
                Ticket ticket = new Ticket("Концерт And one", 75, 764.42);
                ticket.print();
                System.out.println("Введите процент скидки");
                double percent;
                do {
                    percent = scanner.nextDouble();
                    if (percent < 0.0 || percent > 100.0) {
                        System.out.println("Скида не может быть отрицательна или больше 100");
                    }
                }
                while (percent < 0.0 || percent > 100.0);
                ticket.appyDiscount(percent);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Закончить программу? 1 - да.");
            int temp = scanner.nextInt();
            if (temp == 1) {
                isTrue = false;
            }
        }

    }
}
