package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*
1. Сравнить две строки на полное совпадение (equals()).
2. Подсчитать количество гласных и согласных букв в строке.

3. Создать класс Employee, у которого есть переменные класса - fullname, salary.
Создать массив, содержащий несколько объектов этого типа. Создать класс Report, к
оторый будет содержать статический метод generateReport, в котором выводится информация
о зарплате всех сотрудников. Используйте форматировании строк. Пусть salary будет выровнено
по правому краю, десятичное значение имеет 2 знака после запятой. Выделить под фамилию 15 символов.

4. Дана строка 'aAXa aeffa aGha aza ax23a a3sSa'.
Найти и вывести строки следующего вида: по краям стоят буквы 'a', а между ними - маленькие латинские буквы,
не затронув остальных.
*/
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;

        while (isTrue){
            System.out.println("1. Первое задание\n2. Второе задание\n3. Третье задание\n4. Четвертое задание\nЛюбое иное число - выйти из приложения.");
            int temp = sc.nextInt(); //sc.nextLine(); в следующий раз использовать.

            switch (temp){
                case 1:
                    Scanner sc1 = new Scanner(System.in);
                    System.out.println("Первая строка");
                    String st1 = sc1.nextLine();
                    System.out.println("Вторая строка");
                    String st2 = sc1.nextLine();
                    if(st1.equals(st2)){
                        System.out.println("Они равны");
                    }
                    else {
                        System.out.println("Они не равны");
                    }
                    sc1.close();
                    break;
                case 2:
                    Scanner sc2 = new Scanner(System.in);
                    String vowels = "аАоОеЕёЁяЯиИэЭюЮыЫaAeEiIoOuU";
                    System.out.println("Введите строку");
                    String st3 = sc2.nextLine();
                    int numVowels = 0, numNoneVow = 0;
                    for (char c : st3.toCharArray()) {
                        if (Character.isLetter(c)) {
                            if (vowels.indexOf(c) != -1) {
                                numVowels++;
                            } else {
                                numNoneVow++;
                            }
                        }
                    }
                    if(numVowels == 0 && numNoneVow == 0) {
                        System.out.println("В строке нет букв");
                    }
                    else if(numVowels == 0){
                        System.out.println("В строке нет гласных букв, но есть " + numNoneVow + " согласных.");
                    }
                    else if(numNoneVow ==0 ){
                        System.out.println("В строке нет согласных букв, но есть " + numVowels + " гласных");
                    }
                    else{
                        System.out.println("В строке есть " + numVowels + " гласных и " + numNoneVow + " согласных.");
                    }
                    sc2.close();
                    break;
                case 3:
                    Employee[] employees = { new Employee("Ильюкевич Кирилл", 3700.23), new Employee("Дубовик Лев", 3639.42)};
                    Report.generateReport(employees);
                    break;
                case 4:
                    String st4 = "aAXa aeffa aGha aza ax23a a3sSa";
                    Pattern pattern = Pattern.compile("a[a-z]+a"); // но можно написать "a\p{Lower}+a"
                    Matcher matcher = pattern.matcher(st4);
                    while (matcher.find()) {
                        System.out.println("Все паттерны:" + matcher.group());
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
