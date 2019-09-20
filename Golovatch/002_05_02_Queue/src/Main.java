public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        Queue q1 = new Queue(5);


        for (int i = 1; i <= q1.getQlength() + 1; ++i) {

            q1.put(i);
            System.out.println(i + " : " + q1.getGetloc() + " " + q1.getPutloc());
            q1.print_q();
            System.out.println();
        }

        q1.get();
        q1.put(77);
        q1.print_q();

        System.out.println(q1.get());
        q1.print_q();

        System.out.println(q1.get());
        q1.print_q();

        System.out.println(q1.get());q1.get();
        q1.print_q();

        System.out.println(q1.get());
        q1.print_q();

        System.out.println(q1.get());
        q1.print_q();

        /*for (int i = 1; i <= q1.getQlength() + 1; ++i) {
            System.out.println(q1.get());
            q1.print_q();
            System.out.println("putloc = " + q1.getPutloc());
            System.out.println("getloc = " + q1.getGetloc());
        }*/
    }
}
