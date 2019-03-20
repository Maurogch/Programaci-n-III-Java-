package com.company;

import java.util.Objects;

public class TipoGenerico<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoGenerico<?> that = (TipoGenerico<?>) o;
        return Objects.equals(t, that.t);
    }

    @Override
    public int hashCode() {

        return Objects.hash(t);
    }

    public static <T extends Comparable<T>> int compare(T t1, T t2){
        return t1.compareTo(t2);
    }

}
