public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // Одномерный массив
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        for(int i:arr1)
            System.out.print(i + " ");
        System.out.println("\n");
        //(end) Одномерный массив

        // Двумерный массив
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for(int[] i:arr2) {

            for(int j: i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        //(end) Двумерный массив

        // Трехмерный массив
        int[][][] arr3 = {
                {{1, 2, 3}},
                {{4, 5, 6}},
                {{7, 8, 9, 10}}
        };

        for(int[][] a:arr3){
            for(int[] b:a){
                for(int c:b){
                    System.out.print(c + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        //(end) Трехмерный массив

        int[][] mas1 = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9}
        };

        for(int a = 0; a < mas1.length; ++a){
            for(int b = 0; b < mas1[a].length; ++b){
                System.out.println("mas1[" + a + "][" + b + "] = " + mas1[a][b]);
            }
        }
        System.out.println();
    }
}
