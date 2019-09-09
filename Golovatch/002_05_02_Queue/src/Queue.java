public class Queue {

    private int[] q;
    private int putloc, getloc;

    public int getQlength() {
        return q.length;
    }

    public int getPutloc() {
        return putloc;
    }

    public int getGetloc() {
        return getloc;
    }

    public Queue() {
        q = new int[10];
        putloc = getloc = 0;
    }

    public Queue(int size) {
        q = new int[size];
        putloc = getloc = 0;
    }

    public void put(int a) {
        if (q.length == putloc) {
            if (getloc != 0) {
                putloc = 0;
                q[putloc++] = a;
                return;
            }
            System.out.println("Очередь заполнена!");
            return;

        }

        q[putloc++] = a;
    }

    public int get() {
        if (getloc == putloc) {
            System.out.println("Очередь пуста! GetLoc = " + getloc + "   PutLoc = " + putloc);
            return 0;
        }

        return q[getloc++];
    }

    public void print_q() {

        for (int i : q) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
}
