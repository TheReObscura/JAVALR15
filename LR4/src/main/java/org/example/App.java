package org.example;

import javax.management.MBeanRegistration;
import java.util.Random;
import java.util.Scanner;

/*1. Класс “Треугольник” (Triangle): Поля: “sideA”, “sideB”, “sideC”
(double). Конструктор. Метод “isValid()” (проверяет существование
треугольника). Метод “perimeter()”. В “main” создать треугольник и вывести
периметр или сообщение об ошибке.
2. Класс "Квартира" (address: String, rooms: int, price: double). Создать
массив из 6 квартир. Найти квартиру с максимальным количеством комнат и
самую дорогую квартиру.
3. Enum "Gender" (MALE, FEMALE). Класс "Человек" (name: String,
gender: Gender). В “main” создать 3 мужчин и 2 женщин, вывести только
женщин.
*/
public class App {
    public static void main(String[] args) {
        System.out.println("Hello, Имя.");

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("1. Первое задание \n2. Второе задание \n3. Третье задание \nЛюбое другое число - выход");
            int temp = sc.nextInt();
            sc.nextLine();
            switch (temp) {
                case 1:
                    try {
                        System.out.println("Введите сторону А");
                        double A, B, C;
                        do {
                            A = sc.nextDouble();
                            if (A < 0) System.out.println("Введите положительное число");
                        } while (A < 0);
                        System.out.println("Введите сторону В");
                        do {
                            B = sc.nextDouble();
                            if (B < 0) System.out.println("Введите положительное число");
                        } while (B < 0);
                        System.out.println("Введите сторону С");
                        do {
                            C = sc.nextDouble();
                            if (C < 0) System.out.println("Введите положительное число");
                        } while (C < 0);
                        sc.nextLine();
                        Triangle triangle = new Triangle(A, B, C);
                        triangle.print();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Введите адрес");
                        String address = sc.nextLine();
                        System.out.println("Введите количество комнат");
                        int rooms;
                        do {
                            rooms = sc.nextInt();
                            if (rooms < 0) System.out.println("Введите положительное число");
                        }
                        while (rooms < 0);
                        System.out.println("Введите цену");
                        double price;
                        do {
                            price = sc.nextDouble();
                            if (price < 0) System.out.println("Введите положительное число");
                        }
                        while (price < 0);
                        Kvartira[] array = new Kvartira[]{new Kvartira("ул. Ленина, д. 5, кв. 12", random.nextInt(0, 10), random.nextDouble(0, 6000.0)),
                                new Kvartira("пр-т Независимости, д. 40, кв. 8", random.nextInt(0, 10), random.nextDouble(0, 6000.0)),
                                new Kvartira("ул. Максима Богдановича, д. 118, кв. 45", random.nextInt(0, 10), random.nextDouble(0, 6000.0)),
                                new Kvartira("ул. Притыцкого, д. 97, кв. 210", random.nextInt(0, 10), random.nextDouble(0, 6000.0)),
                                new Kvartira("пр-т Победителей, д. 23, корп. 1, кв. 54", random.nextInt(0, 10), random.nextDouble(0, 6000.0)),
                                new Kvartira(address, rooms, price)};
                        Kvartira maxPriced = array[0], maxRoomed = array[0];
                        for (int i = 0; i < array.length; i++) {
                            if (maxPriced.price < array[i].price) {
                                maxPriced = array[i];
                            }
                            if (maxRoomed.rooms < array[i].rooms) {
                                maxRoomed = array[i];
                            }
                            array[i].print();
                        }
                        System.out.println("Самая дорогая квартира:");
                        maxPriced.print();
                        System.out.println("Квартира с наибольшим количеством комнат:");
                        maxRoomed.print();
                    } catch (IllegalArgumentException ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    Human[] humans = new Human[]{
                            new Human("Алексей Лишвтан", Gender.MALE),
                            new Human("Ильюкевич Кирилл", Gender.MALE),
                            new Human("Дубовик Лев", Gender.MALE),
                            new Human("Бусел Ксения", Gender.FEMALE),
                            new Human("Хмелёва Елизавета", Gender.FEMALE),
                    };
                    for (var h : humans) {
                        if (h.gender == Gender.FEMALE) {
                            h.print();
                        }
                    }
                    break;
                default:
                    isTrue = false;
                    break;
            }
        }
    }
}
