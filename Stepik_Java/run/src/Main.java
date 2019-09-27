import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Timer timer = new Timer();
        long time = timer.measureTime(new BigDecimalPower());
        System.out.println(time);

        time = timer.measureTime(new Runnable() {
            @Override
            public void run() {
                new BigDecimal("1234567").pow(10000);
            }
        });

        System.out.println(time);



        // Лэмбда выражения начиная с Java 8
        time = timer.measureTime(() -> {
            new BigDecimal("1234567").pow(10000);
        });

        System.out.println(time);
        // Лэмбда выражения начиная с Java 8     равно предыдущему
        // в скобках указываются параметры без типов ()
        //   () -> {тело лямбда выражения}
        time = timer.measureTime(() -> new BigDecimal("1234567").pow(10000));

        System.out.println(time);


        // Ссылка на метод
        time = timer.measureTime(BigDecimalPower::power);
        System.out.println(time);
    }
}
