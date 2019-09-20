package cat_family;

public class CatFamily {

    private int ears;
    private int legs;
    private boolean bigClaws;

    public CatFamily() {
        ears = 2;
        legs = 4;
        bigClaws = true;
    }

    public void showInfo() {
        System.out.println("Количество ушей: " + ears +
                "\nКоличество лап: " + legs +
                "\nНаличие больших когтей: " + bigClaws);
    }

    public void setBigClaws(boolean bigClaws) {
        this.bigClaws = bigClaws;
    }

    public CatFamily(int ears, int legs, boolean bigClaws) {
        this.ears = ears;
        this.legs = legs;
        this.bigClaws = bigClaws;
    }

    public void eat() {
        System.out.println("Кушаю еду!");
    }
}
