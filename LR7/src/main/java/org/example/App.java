package org.example;

import java.util.Scanner;

/*8. Фильмы
Создайте класс “Movie”:
Нестатические: “title”, “director”, “duration” (в минутах)
Статические: “totalMovies”, “totalDuration”
Статический метод “getAverageDuration()”
В “main” создайте 4 фильма и выведите среднюю длительность*/
public class App {
    public static void main(String[] args) {
        boolean isTrue = true;
        Scanner scanner = new Scanner(System.in);
        while (isTrue) {
            Movie[] movies = new Movie[]{
                    new Movie("Мстители война бесконечности", "А кто?", 95),
                    new Movie("Сумерки", "А я не знаю", 104),
                    new Movie("Бэтмен", "И это я не знаю", 134),
                    new Movie("Пятый элемент", "Это тоже", 79)
            };
            for (var k : movies) {
                k.print();
            }
            System.out.println("Средняя длительность " + Movie.getAverageDuration());
            System.out.println("Закончить программу? 1 - да.");
            int temp = scanner.nextInt();
            if (temp == 1) {
                isTrue = false;
            }
        }

    }
}
