import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        int array[] = {30, 20, 40, 15, 4};

        /*System.out.println(Arrays.toString(array));
        bubble_sort(array);
        System.out.println(Arrays.toString(array));
        revers_array(array);
        System.out.println(Arrays.toString(array));*/

        System.out.println(Arrays.toString(array));
        swap(array, 0, 4);
        System.out.println(Arrays.toString(array));

        String str1 = "Hello World!";
        System.out.println(str1);
        String str2 = revers_array(str1.toCharArray());
        System.out.println(str2);

    }

    // START CHAR ARRAY
    private static void swap(char[] array, int first, int second) {

        // Ver 3.0 short XOR version
        if (first == second) // Check if the two addresses are same: array[first] == array[second] if first = second
            return;
        array[second] ^= array[first];
        array[first] ^= array[second];
        array[second] ^= array[first];
    }

    private static String revers_array(char[] char_array) {

        for (int i = 0; i < char_array.length / 2; ++i) {
            swap(char_array, i, char_array.length - 1 - i);
        }

        String str_res = new String(char_array);
        return str_res;
    }
    // END CHAR ARRAY


    private static void revers_array(int[] array) {

        for (int i = 0; i < array.length / 2; ++i) {
            swap(array, i, array.length - 1 - i);
        }
    }

    private static void bubble_sort(int[] array) {

        for (int j = array.length - 1; j != 0; --j) {
            for (int i = 0; i < j; ++i) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }

    }

    private static void swap(int[] array, int first, int second) {

        // Ver 3.0 short XOR version
        if (first == second) // Check if the two addresses are same: array[first] == array[second] if first = second
            return;
        array[second] ^= array[first];
        array[first] ^= array[second];
        array[second] ^= array[first];

        // Ver 2.0 swap-two-numbers-without-using-temporary-variable
        /*array[second] = array[first] ^ array[second];
        array[first] = array[second] ^ array[first];
        array[second] = array[second] ^ array[first];*/

        // Ver 1.0  swap-two-numbers-with-using-temporary-variable
        /*int tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;*/
    }
}
