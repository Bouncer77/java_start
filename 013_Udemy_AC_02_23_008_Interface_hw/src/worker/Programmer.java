package worker;

public class Programmer extends Worker implements CanProgramm {

    public Programmer(String name) {
        super(name);
    }

    @Override
    public void write_code() {
        System.out.println("Пишет код");
    }
}
