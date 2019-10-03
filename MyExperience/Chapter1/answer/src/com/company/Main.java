package com.company;

import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Арифметические выражения
        task_1_1();
        task_1_2();
        // task_1_3();
        // task_1_4();
        task_1_5();
        task_1_6();
        task_1_7(12.4 , 5, 7.05);
        
        task_1_8(12, 43, 56, 34);
        task_1_9();
        task_1_10(5, 10, 21);
        task_1_11(12, 10, 4.5, 5);
        // task_1_12();
        // task_1_13();
        task_1_14();
        task_1_15();

        // Вычисления по известным формулам
        task_1_22(2, 2);
        task_1_25(5);
        task_1_26(5.0);
        task_1_27(1.75);
        task_1_28(2.0);
        task_1_29(2.0);
        //task_1_31(2, 3);
        task_1_31_mod(2, 3, 4);

        // Часто используемые эффективные алгоритмы
        task_1_59();

        // Глава 2
        task_2_1(234);




    }

    private static void task_2_1(int days) {
        printCurMethod();
        System.out.println("days = " + days);
        int weaks = days / 7;
        days = days % weaks;
        System.out.println("Weaks: " + weaks + " , Days = " + days);
        System.out.println();
    }

    /**1.59. Составить программу обмена значениями двух переменных величин.*/
    private static void task_1_59() {
        printCurMethod();
        int a = 5,  b = 10;
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }

    /**1.31. Даны два целых числа. Найти:
     а) их среднее арифметическое;
     б) их среднее геометрическое
     */
    private static void task_1_31(double n1, double n2) {
        printCurMethod();
        System.out.println(n1 + "     " + n2);
        double a = (n1 + n2) / 2;
        double b = Math.sqrt(n1 * n2);
        System.out.println("Среднее арифм = " + a + "\nСреднее геом = " + b);
        System.out.println();
    }

    private static void task_1_31_mod(double... arr) {
        printCurMethod();
        double a = 0, b = 1;
        for (double n : arr) {
            a += n;
            b *= n;
        }
        a /= arr.length;
        System.out.println(b);
        b = Math.pow(b, ((double) 1 / arr.length));
        System.out.println("Average = " + a);
        System.out.println("Geometric mean = " + b);
        System.out.println();
    }

    /**1.29. Дан радиус окружности. Найти длину окружности и площадь круга.*/
    private static void task_1_29(double r) {
        printCurMethod();
        double p = 2 * Math.PI * r;
        double s = Math.PI * r * r;
        System.out.println("Circle (with r = " + r + "):");
        System.out.printf("P = %.2f, S = %.2f\n", p, s);
        System.out.println();
    }

    /**1.28. Дана длина ребра куба. Найти объем куба и площадь его боковой поверхности.
     */
    private static void task_1_28(double r) {
        printCurMethod();
        System.out.println("Cube (with r = " + r + "): ");
        double v = r * r * r;
        double s = r * r;
        System.out.printf("V = %.2f, S = %.2f\n", v, s);
        System.out.println();
    }

    /**1.27. Считая, что Земля — идеальная сфера с радиусом R 6350 км, определить
     расстояние до линии горизонта от точки с заданной высотой над Землей.*/
    private static void task_1_27(double h) {
        printCurMethod();
        double r = 6_450_000; // в км
        /*1,75 м	4,7 км	стоя на земле
            25 м	17,9 км	8-этажный дом*/
        System.out.println("расстояние до линии горизонта от точки с заданной высотой над Землей:");
        double res = Math.sqrt(Math.pow(r + h, 2) - r * r);
        System.out.printf("%.2f м = %.3f км", res, res / 1000);
        System.out.println();
    }

    /**1.26. Дан радиус окружности. Найти ее диаметр.*/
    private static void task_1_26(double r) {
        printCurMethod();
        System.out.printf("r = %.2f, D = %.2f\n", r, r * 2);
        System.out.println();
    }

    /**1.25. Дана сторона квадрата. Найти его периметр*/
    private static void task_1_25(double a) {
        printCurMethod();
        System.out.printf("Square perimeter = %.2f, при a = %.2f\n", a * 4, a);
        System.out.println();
    }

    /**Вычисления по известным формулам
     * Составить программу:
     * а) вычисления значения функции y = 7x^2- 3x + 6 при любом значении x;
     * б) вычисления значения функции x = 12a^2 + 7a - 16 при любом значении а.
     * */
    private static void task_1_22(double x, double a) {
        printCurMethod();
        System.out.println("y = " + task_1_22_y(x) + "\nx = " + task_1_22_x(a));
        System.out.println();
    }

    private static double task_1_22_y(double x) {
        return 7 * Math.pow(x, 2) - 3 * x + 6;
    }

    private static double task_1_22_x(double a) {
        return 12 * Math.pow(a, 2) + 7 * a - 16;
    }



    /**1.15. Получить линейную запись следующих выражений: (г, к, и)*/
    private static void task_1_15() {
        printCurMethod();
        double a, b, m, n;
        a = 5;
        b= 4;
        System.out.printf("г) (a + b) / 2 , при a = %.2f, при b = %.2f,  = %.2f\n", a, b, (a + b) / 2);

        n = 2;
        m = 3;
        System.out.printf("к) 2^(m^(n)) , при m = %.2f, при n = %.2f,  = %.2f\n", m, n,
                (Math.pow(2, Math.pow(m, n))));

        System.out.printf("и)= %.2f\n", 1 / (1 + (1 / 2 + (2 + ((double)3 / 5)))));

        System.out.println();
    }



    /**1.14. Записать по правилам изучаемого языка программирования следующие выражения:
     * ... самодокументирующийся пример
     * */
    private static void task_1_14() {
        printCurMethod();

        double a, b, n, x, y, degree_a, degree_b;

        x = 4.5;
        System.out.printf("а) 2x : 2 * x , при x = %.2f, 2 * %.2f = %.2f\n", x, x, (2 * x));

        degree_a = 30;
        x = Math.toRadians(degree_a);
        //System.out.println("sin(x) = " + Math.sin(x));
        System.out.printf("б) sin(x), при x = Math.toRadians(degree_a), degree_a = %.2f, Math.sin(%.2f) = %.2f\n",
                degree_a, x, Math.sin(x));

        a = 5;
        System.out.printf("в) a ^ 2 : Math.pow(a, 2), при a = %.2f, Math.pow(%.2f, 2) = %.2f\n", a, a, Math.pow(a, 2));

        x = 9;
        System.out.printf("г) sqrt(x), при x = %.2f, Math.sqrt(%.2f) = %.2f\n", x, x, Math.sqrt(x));

        n = -5.2;
        System.out.printf("д) |n| : Math.abs(n) , при n = %.2f, |%.2f| = %.2f\n", n, n, Math.abs(n));

        degree_a = 60;
        y = Math.toRadians(degree_a);
        // System.out.println("cos(y) = " + Math.cos(y));
        System.out.printf("e) 5cosy : 5 * Math.cos(y), при y = Math.toRadians(degree_a), degree_a = %.2f, 5 * cos(%.2f) = %.2f\n",
                degree_a, y, (5 * Math.cos(y)));

        a = 3;
        System.out.printf("ж) -7.5a^2 : -7.5 * Math.pow(a, 2) , при a = %.2f, -7.5 * Math.pow(%.2f, 2)  = %.2f\n",
                a, a, (-7.5 * Math.pow(a, 2)));

        x = 16;
        System.out.printf("з) 3 * Math.sqrt(x), при x = %.2f, 3 * Math.sqrt(%.2f) = %.2f\n", x, x, 3 * Math.sqrt(x));

        degree_a = 60;
        degree_b = 30;
        a = Math.toRadians(degree_a);
        b = Math.toRadians(degree_a);
        // System.out.println("cos(a) = " + Math.cos(a) + "   sin(a) = " + Math.sin(a));
        // System.out.println("sin(b) = " + Math.cos(b) + "   sin(b) = " + Math.sin(b));
        System.out.print("и) sin(a)cos(b) + cos(a)sin(b), ");
        // System.out.print("при a = Math.toRadians(degree_a), b = Math.toRadians(degree_a),");
        System.out.printf("degree_a = 60, degree_b = 30, " +
                "Math.sin(a) * Math.cos(b) + Math.cos(a) * Math.sin(b) = %.2f\n", a, b,
                (Math.sin(a) * Math.cos(b) + Math.cos(a) * Math.sin(b)));

        a = 2;
        b = 4.5;
        System.out.printf("к) a * Math.sqrt(2 * b), при a = %.2f, при b = %.2f,  a * Math.sqrt(2 * b) = %.2f\n",
                a, b, a * Math.sqrt(2 * b));

        degree_a = 60;
        degree_b = 45;
        a = degree_a * (Math.PI / 180); //a = Math.toRadians(degree_a);
        b = Math.toRadians(degree_a);

        System.out.printf("л) 3 * sin(2a)cos(3b), degree_a = 60, degree_b = 30, 3 * sin(2a)cos(3b) = %.2f\n",
                degree_a, degree_b, 3 * Math.sin(2 * a) * Math.cos(3 * b));
        x = 6;
        y = 9;
        System.out.printf("м) -5 * sqrt(x + sqrt(y)), при x = %.2f, при y = %.2f, = %.2f\n", x, y,
                -5 * Math.sqrt(x + Math.sqrt(y)));

        System.out.println();
    }


    /** 1.13. Составить программу вывода на экран следующей информации:
     *а)  2 кг     б) а 1      в)  x y
     *    13 17       19 b         5 y
     * Примечание
     * a, b, x и y — переменные величины целого типа, значения которых вводятся с клавиа-туры
     * и должны быть выведены вместо имен величин.
     * */
    private static void task_1_13() {
        printCurMethod();
        System.out.println("Input a numbers a, b, x, y:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("а)  2 кг\tб)  %d 1\tв)  %d %d\n", a, x, y);
        System.out.printf("    13 17\t    1949 %d\t    5 %d\n", b, x, y);
        sc.close();
        System.out.println();
    }


    /** 1.12 Составить программу вывода на экран следующей информации:
     *
     *а)  5 10    б)  100 t     в)  x 25
     *    7 см        1949 v        x y
     *
     * Примечание
     * t, v, x и y — переменные величины целого типа, значения которых
     * вводятся с клавиа-туры и должны быть выведены вместо имен величин.
     * */
    private static void task_1_12() {
        printCurMethod();
        System.out.println("Input a numbers t, v, x, y:");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int v = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("а)  5 10\tб)  100 %d\tв)  %d 25\n", t, x);
        System.out.printf("    7 см\t    1949 %d\t    %d %d\n", v, x, y);
        sc.close();
        System.out.println();
    }


    /**1.11. Составить программу вывода на экран "столбиком" четырех любых чисел.*/
    private static void task_1_11(double a, double b, double c, double d) {
        printCurMethod();
        double[] arr = {a, b, c, d};
        // System.out.println(Arrays.toString(arr));
        System.out.print("|---> ");
        task_1_10(arr);
    }

    /**1.10. Вывести на экран числа 5, 10 и 21 одно под другим.*/
    private static void task_1_10(double... arr) {
        printCurMethod();
        for (double a : arr) {
            System.out.println(a);
        }
        System.out.println();
    }

    /**1.9. Вывести на экран числа 50 и 10 одно под другим.*/
    private static void task_1_9() {
        printCurMethod();
        System.out.println(5 + "\n" + 10);
        System.out.println();
    }

    /**1.8. Составить программу вывода на экран в одну строку четырех любых чисел с одним пробелом между ними.*/
    private static void task_1_8(double... arr) {
        printCurMethod();
        for (double a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
    }

    /**1.7. Составить программу вывода на экран в одну строку трех любых чисел с дву-мя пробелами между ними.*/
    private static void task_1_7(double a, double b, double c) {
        printCurMethod();
        System.out.println(a + "  " + b + "  " + c);
        System.out.println();
    }

    /**1.6. Вывести на одной строке числа 7, 15 и 100 с двумя пробелами между ними.*/
    private static void task_1_6() {
        printCurMethod();
        System.out.println("7  15  100");
        System.out.println();
    }


    /**1.5. Вывести на одной строке числа 1, 13 и 49 с одним пробелом между ними.*/
    private static void task_1_5() {
        printCurMethod();
        System.out.println("1 13 49");
        System.out.println();
    }


    /**1.4. Составить программу вывода на экран числа, вводимого с клавиатуры.
     *  По-сле выводимого числа должно следовать сообщение " - вот какое число Вы ввели".*/
    private static void task_1_4() {
        printCurMethod();
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Input a number:");
            int num = sc.nextInt();
            System.out.printf("Your number is: %d \n", num);
        }
        System.out.println();
    }


    /**1.3. Составить программу вывода на экран числа, вводимого с клавиатуры.
     * Выво-димому числу должно предшествовать сообщение "Вы ввели число".*/
    private static void task_1_3() {
        printCurMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number:");
        int num = sc.nextInt();
        //System.out.printf("Your number is: %d \n", num);
        sc.close();
        System.out.println();
    }

    /**1.2. Вывести на экран число e (основание натурального логарифма) с точностью до десятых.*/
    private static void task_1_2() {
        printCurMethod();
        System.out.printf("%.1f\n", Math.E);
        System.out.println();
    }

    /**1.1. Вывести на экран число с точностью до сотых.*/
    private static void task_1_1() {
        printCurMethod();
        System.out.println(Math.PI);
        System.out.println();
    }

    private static void printCurMethod() {
        String nameofCurrMethod = new Throwable().getStackTrace()[1].getMethodName();
        System.out.println("Name of current method: "
                + nameofCurrMethod);
    }

}



