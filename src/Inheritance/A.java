package Inheritance;

public class A {
    int i, j;


    void showIj() {
        System.out.println("i = " + i + ", j = " + j);
    }
}

class B extends A {
    int k;

    void showK() {
        System.out.println("k = " + k);
    }

    void sum() {
        System.out.println("i  +  j  +  k = " + (i + j + k));
    }
}

class SimpleInheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        subOb.i = 8;
        subOb.j = 9;
        subOb.k = 10;

        subOb.showK();
        subOb.showIj();

        System.out.println();
        subOb.sum();
    }
}


