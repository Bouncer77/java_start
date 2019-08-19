import java.io.FileReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
/*        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(fish);
        animals.add(bird);

        // Полиморфизм - Один интерфейс - множество реализаций
        for (Animal animal : animals) {
            animal.eat();
        }

        //Animal animal = new Dog(); // Абкаст - приведение типа к родительскому
        dog.run();
        Animal animal = dog;
        dog = (Dog) animal; // Даункаст автоматически не делается

        */

        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        ArrayList<CanRun> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);
        animals.add(bird);

        for (CanRun animal : animals) {
            animal.run();
        }

        Dog dog1 = new Dog();
        CanRun canRun = dog;
        dog1 = (Dog) canRun;

        Bird bird1 = new Bird();
        bird1.fly();

    }
}
