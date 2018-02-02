package thisseasx.december2017.experiments.CustomListTest;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Iterator;

class Box<T> implements Iterable<T> {

    private T[] array;
    @SuppressWarnings("WeakerAccess")
    int size = 0;

    @SafeVarargs
    Box(T... t) {
        array = t;
        size = array.length;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index >= 0 && index < size;
            }

            @Override
            public T next() {
                return array[index++];
            }
        };
    }

    T get(int i) {
        return array[i];
    }

    void add(T t) {
        array = Arrays.copyOf(array, size + 1);
        array[size++] = t;
    }

    void remove(int i) {
        int length = size - i - 1;
        System.arraycopy(array, i + 1, array, i, length);
        array[--size] = null;
        array = Arrays.copyOf(array, size);
    }

    void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
        array = Arrays.copyOf(array, size);
    }
}
