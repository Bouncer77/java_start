package worker;

public class Worker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void voice() {
        System.out.println(this.name);
    }

    /*programmer
        driver
            cook*/
}
