public class Cat extends Animal implements CanRun {

    @Override
    public void eat() {
        System.out.println("Рискас");
    }

    @Override
    public void run() {
        System.out.println("Кот бежит!");
    }
}
