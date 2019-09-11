package hello;

import java.util.Scanner;

public class Storm {
    public static void main(String[] args) {
        System.out.println("Введите время в секундах:");
        Scanner sc = new Scanner(System.in);
        double seconds = sc.nextDouble();
        System.out.println("Расстояние в метрах = " + Sound.metersToSound(seconds) +
                           "\nРасстояние в футах = " + Sound.footsToSound(seconds));
        System.out.println();
        Sound.testIncremment();
        System.out.println();
        Sound.tetsEmoji();

        System.out.println();
        Sound.unicodeTest();
        System.out.println();

        Sound.testCast();
        System.out.println();
        LogicalOpTable.main();
        System.out.println();

        AnswerOnQuestions.five();

    }
}
