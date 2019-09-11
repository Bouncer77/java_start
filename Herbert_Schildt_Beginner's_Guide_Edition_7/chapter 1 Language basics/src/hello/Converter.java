package hello;

import java.util.Locale;

public class Converter {
    private static final double liters_in_gallon = 3.7854;
    private static final double force_gravity_moon_div_erth = 0.17;
    private static final double inches_in_metr = 39.37;
    private static final int inches_in_foot = 12;

    // Упражнение 1.1
    /* Переводит галоны в литры */
    public static double getLiters(double gallons) {
        return gallons * liters_in_gallon;
    }

    // Упражнение 1.2
    /* Выводит таблицу перевода от 1 до 100 галонов в литры */
    public static void showTable100GalToLiters() {
        for (int gallons = 1; gallons <= 100; ++gallons) {
            System.out.println(gallons + " галон соответствует " +
                               gallons * liters_in_gallon + " литрам");
            if (gallons % 10 == 0) {
                System.out.println(); // разделяет каждые 10 строк таблицы
            }
        }
    }

    // Вопросы для самопроверки упражнение 9
    public static double MoonWeight(double erth_weight) {
        return erth_weight * force_gravity_moon_div_erth;
    }

    // Вопросы для самопроверки упражнение 10
    public static void showTable100InchesToMeters() {
        // вывести значения до 12 футов через каждый дюйм
        for (int inches = 0; inches < (int) footToInch(12); ++inches) {
            /*System.out.println(inches + " дюймов соответствует " +
                               Converter.inchesToMetrs(inches) + " метрам");*/

            System.out.format(Locale.FRANCE, "%d дюймов соответствует %-5.3f метрам (%.0f миллиметрам)\n",
                              inches, Converter.inchesToMetrs(inches), Converter.inchesToMetrs(inches) * 1000);

            // После каждых 12 дюймов выведите пустую строку
            if (inches % 12 == 0) {
                System.out.println();
            }
        }

    }

    // Переводит дюймы в метры
    public static double inchesToMetrs(double inches) {
        return inches / inches_in_metr;
    }

    // Переводит дюймы в футы
    public static double footToInch(double foots) {
        return foots * inches_in_foot;
    }
}
