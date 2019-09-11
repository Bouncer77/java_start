package hello;


import org.w3c.dom.ls.LSOutput;

public class Sound {
    private static final double VELOCITY_OF_SOUND = 330; // м/с
    private static final double METER_TO_FOOT = 3.28;


    /**
     * Упражнение 2.1
     * Вычисление расстояния до места вспышки молнии, звук от которого доходит до
     * наблюдателя за переданное количество секунд
     */
    public static double metersToSound(double time_in_seconds) {
        return (VELOCITY_OF_SOUND * time_in_seconds);
    }

    public static double footsToSound(double time_in_seconds) {
        return (VELOCITY_OF_SOUND * time_in_seconds * METER_TO_FOOT);
    }

    /**
     * Видоизмените рассмотренную выше программу, используя при вычислении
     * значение промежутка времени до прихода эха.
     * */
    public static double metersToEcho(double time_in_seconds) {
        return (metersToSound(time_in_seconds) / 2);
    }

    public static double footsToEcho(double time_in_seconds) {
        return (footsToSound(time_in_seconds) / 2);
    }

    public static void testIncremment() {
        /*
        * Все предельно просто, переменная объявлена перед началом цикла со значением 0,
        *  при каждом входе в цикл значение буде равно нулю, а значение, которое она получает в результате
        * инкрементирования в постфиксной форме будет теряться по окончанию каждого прохода цикла!
        * */
        int s = 0;
        for (int i = 0; i < 10; ++i) {
            s = s++ + s;
            System.out.println(i + " : " + s);
        }

        s = 0;
        System.out.println();
        for (int i = 0; i < 10; ++i) {
            s = s + s++;
            System.out.println(i + " : " + s);
        }

        System.out.println();
        s = 0;
        for (int i = 0; i < 10; ++i) {
            s = s + ++s;
            System.out.println(i + " : " + s);
        }
    }

    public static void unicodeTest() {
        char ch = 6505;
        System.out.println("\u6505");
        System.out.println(ch);
    }

    public static void tetsEmoji() {
        char ch = 0XF631;
        System.out.println(ch);
        System.out.println("\uF631");
        System.out.println("😰");
        // ch = '😰';
        // char mas_ch = "😰";
        String str = "😰";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        ch = '?';
        for (int i = 0; i < 65000; ++i) {
            if (ch == i) {
                System.out.println("? = " + i);
                break;
            }
        }
        System.out.println("\u6363");
    }

    public static void testCast() {

        // явное приведение типов
        byte a, b, c;
        a = 100;
        b = 20;
        // c = a / b; // ошибка, так как Java работает с типом int по умолчанию
        c = (byte) (a / b);

        short i, j, k;
        i = j = 20;
        //k = i / j; // то же самое

        int integer = 10;
        char ch = (char) integer;
        ch = 11;

        integer = 257;
        // 100 = **1100100
        b = (byte) integer; // диапозон значений -128 - 127 для типа byte
        // 257 = 100000001
        // 256 = 100000000
        // 127 = **1111111
        System.out.println("B = " + b + "   INT = " + integer);


    }
}
