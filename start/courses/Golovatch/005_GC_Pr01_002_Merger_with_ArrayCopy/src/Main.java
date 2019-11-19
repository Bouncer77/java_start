import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int[] data = {10, 20, 30, 40 ,50};
        System.out.println(Arrays.toString(data));
        System.arraycopy(data, 1, data, 2, 2);
        System.out.println(Arrays.toString(data));

        // Лаб 2. Слияние сортированных массивов
        /* Два отсортированных массива
        * 1 1 7 9
        * 2 3 4 4
        * */
        int[] data1 = {1, 1, 7, 9};
        int[] data2 = {2, 3, 4, 4};

        System.out.println(Arrays.toString(data1));
        System.out.println(Arrays.toString(data2));
        int[] res = Merger.merge_int_array(data1, data2);
        System.out.println(Arrays.toString(res));

    }



}
