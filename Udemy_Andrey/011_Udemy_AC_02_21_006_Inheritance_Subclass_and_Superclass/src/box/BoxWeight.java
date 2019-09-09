package box;

public class BoxWeight extends Box {

    private double weigth;

    public BoxWeight() {
        super();
        weigth = 0;
    }

    public BoxWeight(double width, double height, double length, double weight) {
        super(width, height, length);
        setWeigth(weight);
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        if (weigth >= 0) {
            this.weigth = weigth;
            return;
        }
        System.out.println("Введен некорректный вес");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Weight: " + weigth);
    }
}
