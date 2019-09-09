import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) throws Exception {

        int len_rand_mass = 10000;
        int max_Num = 1000;
        int min_Num = 5;

        FileWriter fw = new FileWriter("MyFile.txt");
        fw.write("Hello, World!\nIt's my first use FileWriter");
        fw.close();

        fw = new FileWriter("File.txt");
        for (int i = 0; i < len_rand_mass; ++i) {
            //fw.write(i + "\n");
            int current_num = (int) (Math.random() * (max_Num - min_Num));
            fw.write(current_num + "\n"); // [a, b) - диапозон
        }
        fw.close();


/*        FileReader fr = new FileReader("MyFile.txt");
        Scanner scan = new Scanner(fr); // new Scanner(System in)
        *//*.nextLine()   - это метод, который считывает строку (до ENTER), и возвращает это значение
          .hasNextLine() - метод, который возвращает boolean - true или false, показывая, есть ли следующая строка.*//*
        int i = 1;
        while (scan.hasNextLine()) {
            System.out.println(i++ + " : " + scan.nextLine());
        }
        fr.close();*/

        FileReader fr = new FileReader("File.txt");
        Scanner scan = new Scanner(fr);
        int index = 0;
        int[] start_arr = new int[len_rand_mass];
        while (scan.hasNextInt()) {
            start_arr[index++] = scan.nextInt();
        }

        for (int i = 0; i < 20; ++i) {
            System.out.print(start_arr[i] + " ");
        }
        System.out.println();

        int[] arr_test1 = new int[start_arr.length];
        System.arraycopy(start_arr, 0, arr_test1, 0, start_arr.length);
        if (Arrays.equals(start_arr, arr_test1)) {
            System.out.println("Arrays start_arr and arr_test1 is Equals");
        }

        int[] arr_test2 = new int[start_arr.length];
        System.arraycopy(start_arr, 0, arr_test2, 0, start_arr.length);
        if (Arrays.equals(start_arr, arr_test2)) {
            System.out.println("Arrays start_arr and arr_test2 is Equals");
        }

        long startTime = System.currentTimeMillis();
        SelectionSorter_q.selection_sort(arr_test1);
        long stopTime = System.currentTimeMillis();
        long resTime1 = startTime - stopTime;
        System.out.println("\u001B[35m Sort time (selection_sort)is " + resTime1 + "\u001B[0m");


        startTime = System.currentTimeMillis();
        SelectionSorter_q.selection_sort_optimized_1(start_arr);
        stopTime = System.currentTimeMillis();
        long resTime2 = startTime - stopTime;
        System.out.println("\u001B[35m Sort time (selection_sort_optimized_1) is " + (stopTime - startTime) + "\u001B[0m");

        startTime = System.currentTimeMillis();
        SelectionSorter_q.selection_sort_optimized_2(arr_test2);
        stopTime = System.currentTimeMillis();
        long resTime3 = startTime - stopTime;
        System.out.println("\u001B[35m Sort time (selection_sort_optimized_2) is " + (stopTime - startTime) + "\u001B[0m");

        double procent = (double) resTime3 / (double) resTime1 * 100;
        System.out.format("Procent = %.2f \n", procent);

        startTime = System.currentTimeMillis();
        int[] test_arr = {5, 2, 9, 1, 22};
        System.out.println(Arrays.toString(test_arr));
        CheckArray.array_up_sorting_check(test_arr);
        SelectionSorter_q.selection_sort_optimized_2(test_arr);
        System.out.println(Arrays.toString(test_arr));
        CheckArray.array_up_sorting_check(test_arr);
        System.out.println();



        stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println(elapsedTime);
    }
}
