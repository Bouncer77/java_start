package hello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Глава 1");
        Scanner sc = new Scanner(System.in);
        boolean bool_repeat = true;
        while (bool_repeat) {
            Main.showChooseMenu();
            System.out.println("Введите номер упражнения в главе");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Введите количество галонов: ");
                    double gallons = sc.nextDouble();
                    System.out.println(gallons + " галонам соответствует: " +
                            Converter.getLiters(gallons) + " литров.");
                    break;
                case 2:
                    Converter.showTable100GalToLiters();
                    break;

                case 3:
                    System.out.println("Введите вес на Земле: ");
                    double earth_weight = sc.nextDouble();
                    System.out.println("Вес на Луне: " + Converter.MoonWeight(earth_weight));
                    break;

                case 4:
                    Converter.showTable100InchesToMeters();
                    break;

                case 5:
                    bool_repeat = false;
                    break;
                default:
                    System.out.println("Введен неверный номер упражнения!");
            }
            System.out.println();
        }
        System.out.println("До скорой встречи! =)");
    }

    public static void showChooseMenu() {
        System.out.println("1. Упражнение 1.1 Перевод галонов в литры\n" +
                           "2. Упражнение 1.2 Вывод таблицы перевода галонов в литры из 100 строк\n" +
                           "3. Задача для самопроверки 9 Сила тяжести на Луне\n" +
                           "4. Задача для самопроверки 10 Таблица переводов дюймов в метры\n" +
                           "5. Выход из программы\n");
    }
}
