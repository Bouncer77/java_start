package box;

public class Box {

    private double width;
    private double height;
    private double length;

    public Box() {
        width = height = length = 0;
    }

    public Box(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box(double a) {
        this.width = this.height = this.length = a;
    }

    void setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double showVolume() {
        return width * height * length;
    }

    public Box increase() {
        return  new Box(width * 2, height * 2, length * 2);
    }

    public Box increase(int num) {
        return  new Box(width * num, height * num, length * num);
    }

    public int compare(Box other_box) {
        double thisVolume = this.showVolume();
        double boxVolume = other_box.showVolume();
        int result;

        if (thisVolume > boxVolume) {
            System.out.println("Наша коробка больше!");
            result = 1;
        } else if (thisVolume < boxVolume) {
            System.out.println("Наша коробка меньше!");
            result = -1;
        } else {
            System.out.println("Наши коробки равны!");
            result = 0;
        }

        return result;
    }

    public void showInfo() {
        System.out.println("x,y,z: [" + width + "], [" + height + "], [" + length + "]");
    }

}
