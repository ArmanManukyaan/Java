package generics;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }

    public T min() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }
        return v;
    }


    public T max() {
        T v = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

class GenIfDemo {
    public static void main(String[] args) {
        Integer[] iNums = {3, 6, 2, 8, 6};
        Character[] cNums = {'b', 'r', 'p', 'w'};
        MyClass<Integer> iOb = new MyClass<>(iNums);
        MyClass<Character> chr = new MyClass<>(cNums);
        System.out.println("max value: " + iOb.max());
        System.out.println("min value: " + iOb.min());
        System.out.println("min value: " + chr.min());
        System.out.println("max value: " + chr.max());

    }
}