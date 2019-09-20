package hello;

public class AnswerOnQuestions {

    // урпажнение 5
    public static void five() {

        int sum = 0; //int sum; // была пропущена инициализация
        for (int i = 0; i < 10; ++i) {
            // объявленная тут переменная имеет область видимости тело текущего цикла for
            sum += i; // sum = sum + i; // отимизированно
        }
        System.out.println("Сумма = " + sum);
    }
}
