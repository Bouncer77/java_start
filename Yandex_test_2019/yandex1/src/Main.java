import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] argv) throws Exception {

        FileReader fr = new FileReader("input.txt");
        Scanner scan = new Scanner(fr);

        int n_numbers = 0;
        if (scan.hasNextInt()) {
            n_numbers = scan.nextInt();
        }

        Set<Integer> uniq = new TreeSet<>();

        ArrayList<Integer> arr = new ArrayList<>();
        int i = 0;
        while (scan.hasNextInt() && i++ < n_numbers) {
            arr.add(scan.nextInt());
        }

        uniq.addAll(arr);
        long sum = 0;
        for(int k : uniq) {
            sum += k;
        }
        System.out.println(sum);

        File output = new File("output.txt");
        FileWriter fw = new FileWriter("output.txt");
        fw.write(Long.toString(sum));
        fw.close();
    }
}
