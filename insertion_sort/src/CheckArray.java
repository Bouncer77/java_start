public class CheckArray {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static boolean array_up_sorting_check(int[] arr) {

        int err = 0;
        for (int i = 0; i < arr.length - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                ++err;
                System.out.print(ANSI_RED + arr[i] + ANSI_RESET + " ");
                continue;
            }
            System.out.print(ANSI_GREEN + arr[i] + ANSI_RESET + " ");
            if (i == arr.length - 2)
                System.out.print(ANSI_GREEN + arr[i + 1] + ANSI_RESET + " ");
        }
        if (err > 0) {
            System.out.println("\nNumber error = " + ANSI_RED + err + ANSI_RESET);
            return false;
        } else
            return true;

    }
}
