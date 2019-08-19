import worker.CanProgramm;
import worker.Programmer;

public class Main {

    public static void main(String[] args) {
        Programmer[] pr1 = {new Programmer("Ivan"),
                            new Programmer("Anton"),
                            new Programmer("Alexander")
        };

        for (Programmer programmer : pr1) {
            programmer.voice();
            programmer.write_code();
            System.out.println();
        }


        for (CanProgramm programmer : pr1) {
            programmer.write_code();
            System.out.println();
        }

    }
}
