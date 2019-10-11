package com.bouncer77.stepik_basic_java.chapter_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Введите любое дробное число: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        System.out.println ("Вы ввели число " + number);
    }
}
