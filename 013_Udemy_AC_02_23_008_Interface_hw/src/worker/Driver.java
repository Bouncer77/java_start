package worker;

public class Driver extends Worker implements CanDrive {

    public Driver(String name) {
        super(name);
    }

    @Override
    public void drive() {
        System.out.println("Водит машину");
    }
}
