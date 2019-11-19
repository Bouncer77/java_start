import java.math.BigDecimal;

public class BigDecimalPower implements Runnable {

    @Override
    public  void run() {
        new BigDecimal("1234567").pow(100000);
    }


    public static void power() {
        new BigDecimal("1234567").pow(100000);
    }
}
