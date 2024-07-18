package Interfaces;

public interface A {
    void meth1();

    void meth2();
}

interface B extends A {
    void meth3();
}

class MyClass implements B {

    @Override
    public void meth3() {
        System.out.println("Implementation of the method()3");
    }

    @Override
    public void meth1() {
        System.out.println("Implementation of the method()1");
    }

    @Override
    public void meth2() {
        System.out.println("Implementation of the method()2");
    }
}

class IFExtend {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
    }
}
