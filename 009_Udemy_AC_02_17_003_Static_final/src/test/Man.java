package test;

public class Man {

    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age > 0? age : -age;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void setAge(int age) {
        if (age != 0)
            this.age = age > 0? age : -age;
        else
            System.out.println("Возраст не может быть равен 0");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
