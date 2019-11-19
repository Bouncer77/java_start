package hello;

/**
 * Упражнение 2.2
 *
 * Вывести таблицы истиности для логических операций в Java
 * 1. с true - false
 * 2. с 1 - 0
 * */
public class LogicalOpTable {
    public static void main() {
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");
        showAllLogOp(false, false);
        showAllLogOp(false, true);
        showAllLogOp(true, false);
        showAllLogOp(true, true);

        System.out.println();
        byte mas[] = AndOrXorNot_p(false, false);
        System.out.println(mas[0] + "\t" + mas[1] + "\t" + mas[2] + "\t" + mas[3]);

        mas = AndOrXorNot_p(false, true);
        System.out.println(mas[0] + "\t" + mas[1] + "\t" + mas[2] + "\t" + mas[3]);

        mas = AndOrXorNot_p(true, false);
        System.out.println(mas[0] + "\t" + mas[1] + "\t" + mas[2] + "\t" + mas[3]);

        mas = AndOrXorNot_p(true, true);
        System.out.println(mas[0] + "\t" + mas[1] + "\t" + mas[2] + "\t" + mas[3]);
    }

    private static void showAllLogOp(boolean p, boolean q) {
        System.out.println((p && q) + "\t" + (p || q) + "\t" +
                (p ^ q) + "\t" + (!p));
    }

    private static byte[] AndOrXorNot_p(boolean p, boolean q) {
        byte[] mas = new byte[4];

        for (int i = 0; i < 4; ++i) {
            mas[i] = 0;
        }

        if (p && q) {
            mas[0] = 1;
        }

        if (p || q) {
            mas[1] = 1;
        }

        if (p ^ q) {
            mas[2] = 1;
        }

        if (!p) {
            mas[3] = 1;
        }

        return mas;
    }
}
