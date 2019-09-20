public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int a = 5;
        int res = 0;
        res = Overload.multiple(a);
        System.out.println(res);


        Box box1 = new Box();
        Box box2 = new Box(12, 5, 4);
        Box box3 = new Box(12);

        System.out.println(box1.showVolume() + "\n" + box2.showVolume() + "\n" + box3.showVolume());
    }
}
