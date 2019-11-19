package main;

public class MyArray {
    private final static int START_LENGTH = 10;
    private final static int MULTI = 2;

    private String[] array = new String[START_LENGTH];
    private int size = 0;

    public MyArray(String... args) {
        for (String str : args) {
            add(str);
        }
    }

    public void showArray() {
        int count = 0;
        for (String str : array) {
            System.out.printf("%3d : %s\n", ++count, str);
        }
    }

    public void showArray_not_null() {
        int count = 0;
        for (String str : array) {
            if (str != null) {
                System.out.printf("%3d : %s\n", ++count, str);
            }
        }
    }

    public void add(String str) {
        array[size++] = str;
        if (size == array.length) {
            String[] newArray = new String[array.length * MULTI];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < size) {
            System.arraycopy(array, index + 1, array, index, size - 1 - index);
            array[--size] = null;
        }
    }

    public void remove(String str) {
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (str.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            remove(index);
        }
    }



    public int getSize() {
        return size;
    }

    public String get(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            return "Элемент не найден";
        }
    }
}
