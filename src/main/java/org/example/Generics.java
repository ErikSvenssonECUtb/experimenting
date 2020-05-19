package org.example;

public class Generics<T> {
    private T t;

    public T get() {
        return t;
    }

    public void setObj(T t) {
        this.t = t;
    }
}
