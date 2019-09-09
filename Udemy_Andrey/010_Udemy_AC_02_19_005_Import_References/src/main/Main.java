package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.add("Сергей");
        employees.add("Кристина");
        employees.add("Елена");
        employees.add("Виктор");
        employees.remove(2);

        for (String name : employees) {
            System.out.println(name);
        }

        System.out.println();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            numbers.add(i);
        }
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println();
        HashSet<String> full_names = new HashSet<>(); // коллеккция без повторений
        full_names.add("Иван");
        full_names.add("Игорь");
        full_names.add("Антон");
        full_names.add("Иван"); // не будет второй раз добавлена
        // порядок в коллекции может отличаться
        for (String s : full_names) {
            System.out.println(s);
        }

        System.out.println();
        TreeSet<String> tree_full_names = new TreeSet<>();
        tree_full_names.add("Иван");
        tree_full_names.add("Игорь");
        tree_full_names.add("Антон");
        tree_full_names.add("Иван"); // не будет второй раз добавлена
        for (String s : tree_full_names) { // в алфавитном порядке, если Integer то по возрастанию
            System.out.println(s);
        }

    }
}
/*
    String s = "Это Игорь. Он программист";
    String name = s.substring(4, 9); // последний индекс в строку не включается
    System.out.println(name);

    */
/*
    String s1 = "false"; // любое значение, кроме true
    boolean b = Boolean.parseBoolean(s1);
        */

/*        String s1 = "1000";
        String s2 = "2000";
        System.out.println(s1 + s2);

        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        System.out.println(a + b);*/

/*        byte c;
        Byte c1;

        short s;
        Short s1;

        int a = 5;
        Integer a1 = 5; // Сылочный тип - Оболочка типа

        long l;
        Long l1;

        char ch;
        Character ch1;

        float f;
        Float f1;

        double d;
        Double d1;

        boolean b;
        Boolean b1;*/
