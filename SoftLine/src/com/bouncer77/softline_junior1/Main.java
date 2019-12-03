package com.bouncer77.softline_junior1;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Type;
import java.util.*;



public class Main {

    enum Type { DEPOSIT, WITHDRAWAL }

    public static void main(String[] args) {
        // write your code here
        // Реализация методов
        // 1
        String string = "Hello world Best Java Books for Beginners and Advanced Programmers";
        System.out.println(countWords(string));
        System.out.println();

        // 2
        //{2,1,4,2,3} -> {2,1,4,3}
        int[] array = {2, 1, 4, 2, 3};

        for (int num : removeDuplicates(array)) {
            System.out.print(num + ", ");
        }
        System.out.println();
        System.out.println();

        // 3
        /*Реализуйте метод, подсчитывающий среднее значение депозитов среди переданных транзакций,
         группирующий их по значению валюты в алфавитном порядке.*/
        Transaction t1 = new Transaction(Type.DEPOSIT, "EUR", (long)100);
        Transaction t2 = new Transaction(Type.DEPOSIT, "EUR", (long)200);
        Transaction t3 = new Transaction(Type.WITHDRAWAL, "USD", (long)1250);
        Transaction t4 = new Transaction(Type.DEPOSIT, "USD", (long)2000);
        Transaction t5 = new Transaction(Type.DEPOSIT, "RUB", (long)15);
        Transaction t6 = new Transaction(Type.DEPOSIT, "RUB", (long)35);
        Transaction t7 = new Transaction(Type.WITHDRAWAL, "RUB", (long)55);
        List<Transaction> transactionList = new LinkedList<>();
        transactionList.add(t1);
        transactionList.add(t2);
        transactionList.add(t3);
        transactionList.add(t4);
        transactionList.add(t5);
        transactionList.add(t6);
        transactionList.add(t7);

        Transaction.getAverageDepositAmountByCurrency(transactionList);







    }

    static class Transaction {

        final Type type;
        final String currency;
        final Long amount;

        Transaction(@NotNull Type type,
                    @NotNull String currency,
                    @NotNull Long amount) {
            this.type = type;
            this.currency = currency;
            this.amount = amount;
        }

        String getCurrency() {
            return currency;
        }

        Long getAmount() {
            return amount;
        }

        Type getType() {
            return type;
        }

        /**
         *
         * @param transactions список транзакций
         * @return мапа, в которой ключи - валюты (хранятся в алфавитном порядке),
         * - среднее значение всех транзакций типа "депозит" в данной валюте
         * Пример входных данных:
         * [
         * Transaction(DEPOSIT, ""EUR"", 100),
         * Transaction(DEPOSIT, "EUR", 200),
         * Transaction(WITHDRAWAL, "USD", 1250),
         * Transaction(DEPOSIT, "USD", 2000),
         * Transaction(DEPOSIT, "RUB", 15),
         * Transaction(DEPOSIT, "RUB", 35),
         * Transaction(WITHDRAWAL, "RUB", 55)
         * ]
         *
         * Ожидаемый результат:
         * ["EUR" -> 150.0, "RUB" -> 25.0, "USD" -> 2000.0 ]
         */
        public static Map<String, Double> getAverageDepositAmountByCurrency(List<Transaction> transactions) {

            Map<String, Long> map = new TreeMap<>();


            for (Transaction t : transactions) {
                // TODO Необходимо сначала ссумировать по каждой валюте, а лишь потом заносить в словарь
                // 1) Использовать стек   2) Использовать n+1 проходов по списку
                // 3) Придумать гениальное решение
                // В данном случае заносится лишь последнее значение из входного списка
                if (t.getType() == Type.DEPOSIT)
                    if (map.containsKey(t.getType())) {

                    } else {
                        map.put(t.getCurrency(), t.getAmount());
                    }

            }
            System.out.println(map);
            return null;
        }


    }







    /**
     * @param s – Строка состоящая из букв латинского алфавита и пробелов
     * @return Количество слов в строке s
     */
    public static int countWords(String s) {
        int numWords = 0;
        Scanner scanner = new Scanner(s);
        while (scanner.hasNext()) {
            scanner.next();
            //String scan = scanner.next();
            //System.out.println(scan);
            ++numWords;
        }
        return numWords;
    }

    /**
     * @param a - оригинальный массив
     * @return массив, который не содержит дубликатов. Порядок элементов оригинального массива должен быть сохранён,
     * из последовательности дубликатов оставлять первый, например, {2,1,4,2,3} -> {2,1,4,3}
     */
    public static int[] removeDuplicates(int[] a) {
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : a) set.add(num);
        //System.out.println(set);

        int[] arr = new int[set.size()];
        int index = 0;
        for( Integer i : set ) {
            arr[index++] = i;
        }

        return arr;
    }





}