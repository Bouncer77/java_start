package main;

import test.Man;
import test.MyMath;

public class Main {

    public static void main(String[] args) {
        System.out.println(MyMath.length_round(10));
        double area = MyMath.area(10);
        System.out.println(area);

        System.out.println(MyMath.sum(10, 20 , 30));
    }
}
