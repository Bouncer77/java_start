package main;

public class Main {

    public static void main(String[] args) {
        MyArray employess = new MyArray("Ivan", "Igor", "Marina", "Natily");
        employess.add("Nikita"); // index = 4
        employess.add("Artem");

        for (int i = 0; i < 10; ++i) {
            employess.add("Сотрудник " + i);
        }

        employess.remove(4); // remove Nikita


        for (int i = 0; i < employess.getSize(); ++i) {
            System.out.println(employess.get(i));
        }

        employess.remove("Сотрудник 5");
        System.out.println();
        employess.showArray_not_null();




    }
}





























/*        String[] employes = {
                "Никита",
                "Игорь",
                "Ольга",
                "Настя",
        };

//        for (String name :  employes) {
//            System.out.println(name);
//        }

        String[] second = new String[employes.length + 1];

        for (int i = 0; i < employes.length; ++i) {
            second[i] = employes[i];
        }

        second[second.length - 1] = "Иван";

        for (String name :  second) {
            System.out.println(name);
        }

        employes[1] = null;

        String[] thried = new String[employes.length - 1];
        for (int i = 0, j = 0; i < employes.length; ++i) {
            if (employes[i] != null) {
                thried[j++] = employes[i];
            }
        }
        employes = thried;
        System.out.println();
        for (String name :  thried) {
            System.out.println(name);
        }*/
