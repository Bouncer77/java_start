import java.util.Arrays;

public class MergerTest {

    // Test-driven development (TDD)
    // Разработка через тестирование
    /* Когда к каждому методу пишется тестирующий метод*/
    public static void main(String[] args) {

        int[][][] data = {
                {{}, {}},
                {{0}, {}},
                {{}, {0}},
                {{0, 2}, {1, 3}},
                {{0, 2, 7, 123}, {1, 3, 4, 5, 7, 6, 6}}
        };

        for (int[][] origin : data) {
            int[] left = origin[0];
            int[] right = origin[1];
            int[] merged = Merger.merge_int_array(left, right);
            System.out.println(
                   Arrays.toString(left) +
                   " + " +
                   Arrays.toString(right) +
                   " -> " +
                   Arrays.toString(merged)
            );
        }
    }
}
