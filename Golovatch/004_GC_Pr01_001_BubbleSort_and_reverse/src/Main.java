import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Start Programm!");
        int array[] = {30, 20, 40, 15, 4};

        System.out.println("Bubble_sort and revers int array");
        System.out.println(Arrays.toString(array));
        bubble_sort(array);
        System.out.println(Arrays.toString(array));
        revers_array(array);
        System.out.println(Arrays.toString(array));
        System.out.println();

        System.out.println("Reverse String (String -> char array : reverse -> new String");
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

        // Ver 2.0 Есть гипотеза, что декремент цикла до 0 работает быстрее,
        // чем инкремент цикла до определенного не равного значения.
        // Так как есть Assembler операции сравнения с нулем
        int sign_even_number = (array.length % 2) == 0? 0 : 1;
        for (int i = array.length / 2 - 1, j = array.length / 2 + sign_even_number; i >= 0; --i, ++j) {
            swap(array, i, j);
        }
        // Ver 1.0
        /*for (int i = 0; i < array.length / 2; ++i) {
            swap(array, i, array.length - 1 - i);
        }*/
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
