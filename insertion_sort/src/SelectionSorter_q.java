public class SelectionSorter_q {

    // Алгоритм сортировки выборками
    public static void selection_sort(int[] arr) {

        for (int barrier = 0; barrier < arr.length - 1; ++barrier) {
            for (int index = barrier + 1; index < arr.length; ++index) {
                if (arr[barrier] > arr[index]) {
                    swap(arr, barrier, index);
                }
            }
        }
    }

    public static void selection_sort_optimized_1(int[] arr) {

        for (int barrier = 0; barrier < arr.length - 1; ++barrier) {
            int elem = arr[barrier]; // В Java к локальная переменной быстрее обращение (Заявление от Головача,
            // пруф в CheckArray : данная сортировка
            /* Когда есть обращение к элементу массива, JVM делает проверку что индекс массива не
            отрицательный и не превышает длину массива*/
            for (int index = barrier + 1; index < arr.length; ++index) {
                if (elem > arr[index]) {
                    swap(arr, barrier, index);
                }
            }
        }
    }

    public static void selection_sort_optimized_2(int[] arr) {

        for (int barrier = 0; barrier < arr.length - 1; ++barrier) {
            int min_elem = arr[barrier];
            int index_min_elem = barrier;
            for (int index = barrier + 1; index < arr.length; ++index) {
                if (min_elem > arr[index]) {
                    min_elem = arr[index];
                    index_min_elem = index;
                }
            }
            if (barrier != index_min_elem)
                swap(arr, barrier, index_min_elem);
        }
    }




    public static void swap(int[] arr, int i, int j) {
        arr[i] ^= arr[j];
        arr[j] ^= arr[i];
        arr[i] ^= arr[j];
    }
}
