import test.Empty;

public class Main {

    public static void main(String[] args) {

        int a = 1;

        try {
            // действая выполняются последовательно, до первого выброса исключения
            int b = 7 / a;
        } catch (Exception e) {

        } finally { // выполняется все равно (закрытие потока)
            System.out.println("Мы в блоке finally");
        }


        /*catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль!");
        } catch (NumberFormatException e1) {
            System.out.println("Ошибка: Преобразования типа!");
        }*/
        System.out.println("Hello World!");

        try {
            int[] mas = {1, 2, 3};
            mas[4] = 10;
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива!");
        }

        Empty empty = new Empty();
        //System.out.println(empty.toString());
        System.out.println(empty);
        System.out.println();

        // число от 1 до 6
        int res = (int) (Math.random() * 6 + 1);
        System.out.println(res);

    }
}
