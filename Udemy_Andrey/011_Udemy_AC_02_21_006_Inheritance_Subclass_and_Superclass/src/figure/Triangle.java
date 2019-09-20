package figure;

public class Triangle extends Figure{

    private double c;

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    // по формуле Герона
    @Override
    public void square() {
        double p = (getA()+getB()+this.c) / 2;
        double s = p * (p - getA()) * (p - getB()) * (p - this.c);
        System.out.println("Площадь триугольника = " + Math.sqrt(s));
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}
