package generics;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void showType() {
        System.out.println("ob1: " + ob1.getClass().getName());
        System.out.println("ob2: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> twoGen = new TwoGen<>(88, "generic");
        twoGen.showType();
        int i = twoGen.getOb1();
        String s = twoGen.getOb2();
        System.out.println("i value: " + i);
        System.out.println("s value:  " + s);

    }
}
