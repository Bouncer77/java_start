package com.bouncer77.logger;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int sum = IntStream.iterate(1, n -> n + 1)
                .filter(n -> n % 5 == 0 && n % 2 != 0)
                .limit(10)
                .map(n -> n * n)
                .sum();
        System.out.println(sum);

        IntStream stream = IntStream.of(1, 1, 5, 7, 9, 12, 44, 55, 101);
        stream.filter(n -> n < 100)
                .mapToObj(Integer::toString)
                .flatMapToInt(s -> s.chars())
                .distinct()
                .sorted()
                .skip(3)
                .limit(2);

        List<String> stringList = new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("3");
        stringList.add("4");
        stringList.add("5");
        Stream<String> stream1 = stringList.stream();
        //System.out.println(stringList);


        System.out.println();
        System.out.println();

        System.out.println(factorial(4));

        System.out.println();
        String string = "a123321a";
        System.out.println(isPalindrome(string));
        String string2 = "a123321abb";
        System.out.println(isPalindrome(string2));

        System.out.println("***************************");
        System.out.println("************* String **********");
        MyOptional<String> myOptional = new MyOptional<>("Hello, World!");
        System.out.println(myOptional.get());
        System.out.println("************* Integer **********");
        MyOptional<Integer> myOptional1 = new MyOptional<>(100);
        System.out.println(myOptional1.get());
        System.out.println("***************************");

        String[] arrStr = {"1", "2", "3"};
        Integer num = 100;
        SuperMyOptional<String, Integer> superMyOptional = new SuperMyOptional<>(arrStr, num);
        System.out.println(superMyOptional.toString());

    }

    public static BigInteger factorial(int n) {
        return IntStream.rangeClosed(1, n)
                .mapToObj(i -> BigInteger.valueOf(i))
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    public static boolean isPalindrome(String s) {
        StringBuilder leftToRight = new StringBuilder();

        s.chars().filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .forEach(leftToRight::appendCodePoint); // сохранить в StringBuilder

        StringBuilder rightToLeft = new StringBuilder(leftToRight).reverse();

        return leftToRight.toString().equals(rightToLeft.toString());
    }
}
