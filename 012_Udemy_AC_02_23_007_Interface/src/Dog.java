public class Dog extends Animal implements CanRun {

    @Override
    public void eat() {
        System.out.println("Собачий корм");
    }

    public void run() {
        System.out.println("Собака бежит!");
    }
}
