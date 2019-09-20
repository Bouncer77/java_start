package figure;

public class Rect extends Figure {

    public Rect(double a, double b) {
        super(a, b);
    }

    @Override
    public void square() {
        System.out.println("Площадь прямоугольника = " + (getA()*getB()));
    }
}
