public class TimeTest1 {
    public static void main(String[] args) {

        /*Гранулярность времени

        Гранулярность метода System.currentTimeMillis() больше 1 миллисекунды.
        Если вы вызовете этот метод несколько раз, вы увидите, что вы получите одно
        и то же значение на некоторое время, затем он внезапно
        переходит на 10-20-30 миллисекунд или более.*/

        long startTime = System.currentTimeMillis(); // возвращает время с 1 января 1970 года в миллисекундах.

        long total = 0;
        for (int i = 0; i < 10000000; i++) {
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }
}

/*public class TimeTest2 {
    public static void main(String[] args) {

        // Spring Framework имеет отличный StopWatch класс:
        Stopwatch timer = new Stopwatch().start();

        long total = 0;
        for (int i = 0; i < 10000000; i++) {
            total += i;
        }

        timer.stop();
        System.out.println(timer.getElapsedTime());
    }
}*/
