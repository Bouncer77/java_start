public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Animal a = new Animal();
        Object b = a.test();

        Dog dog1 = new Dog();
        Dog dog2 = dog1.test();

        Animal dog = new Dog();
        System.out.println(dog.toString());
        System.out.println(dog.test().toString());

        //Animal[] arr = {a, b, dog1, }
    }
}
