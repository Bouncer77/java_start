package test;

public class MyMath {
    private final static double PI = 3.14;

    public static int square(int num) {
        return num * num;
    }

    public static double length_round(double radius) {
        return 2 * PI * radius;
    }

    public static double area(double radius) {
        return PI * radius * radius;
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }
}
