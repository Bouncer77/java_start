import box.BoxWeight;
import cat_family.Cat;
import cat_family.Leon;
import figure.Rect;
import figure.Triangle;

public class Main {

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Leon leon1 = new Leon();
/*
        cat1.showInfo();
        System.out.println();
        leon1.showInfo();*/

        cat1.eat();
        System.out.println();
        leon1.eat();

        System.out.println();
        BoxWeight wbox1 = new BoxWeight(10, 5, 4, 80.5);
        wbox1.showInfo();
        System.out.println();

        Rect rec1 = new Rect(10, 20);
        rec1.square();
        Triangle tr1 = new Triangle(10, 10, 10);
        tr1.square();
    }
}
