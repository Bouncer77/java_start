import java.io.FileReader;
import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] argv) throws Exception {

        FileReader fr = new FileReader("input.txt");
        Scanner scan = new Scanner(fr);

        String str = "";
        if (scan.hasNextLine()) {
            str = scan.nextLine();
        } else return;

        int sum = 0;
        int num = 1;
        boolean read_num = false;
        for (int i = 0; i < str.length(); ++i) {

            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                if (num != 1) {
                    sum += num;
                }

                if (i == str.length() - 1 || (str.charAt(i+1) >= 'A' && str.charAt(i+1) <= 'Z')) {
                    ++sum;
                }

                num = 0;
                read_num = false;

            } else {

                if (read_num) {
                    num = (num * 10) + (int)(str.charAt(i) - '0');
                    if (i == str.length() - 1) {
                        sum += num;
                    }
                } else {
                    read_num = true;
                    num = (int)(str.charAt(i) - '0');
                    if (i == str.length() - 1) {
                        sum += num;
                    }
                }
            }
        }

        System.out.println(sum);

        File output = new File("output.txt");
        FileWriter fw = new FileWriter("output.txt");
        fw.write(Integer.toString(sum));
        fw.close();
    }
}
