package com.bouncer77.logger;

import java.util.Collections;

public final class SuperMyOptional<T, N> {
    private final T[] arr;
    private final N num;


    public SuperMyOptional(T[] arr, N num) {
        this.arr = arr;
        this.num = num;
    }

    public T[] getArr() {
        return arr;
    }

    public N getNum() {
        return num;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (T elem : arr) {
            res.append(elem.toString());
            res.append("\n");
        }
        return res.toString();
    }
}
