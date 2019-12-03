package com.bouncer77.logger;

import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Optional;

public final class MyOptional<T> {

    private final T value;

    public MyOptional(T value) {
        this.value = Objects.requireNonNull(value);
    }

    public static <T> MyOptional<T> of(T value) {
        return new MyOptional<>(value);
    }

    public T get() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }
}
