package figure;

public abstract class Figure {
    private double a, b;

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract void square();

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public final void setA(double a) {
        this.a = a;
    }

    public final void setB(double b) {
        this.b = b;
    }
}
