package OverloadingAndConstructor;

public class Overload {

    void test() {
        System.out.println("Hello World");
    }

    void test(int a) {
        System.out.println("a " + a);
    }

    void test(int a, int b) {
        System.out.println("a " + a + " b " + b);
    }

    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

class OverloadDemo {
    public static void main(String[] args) {
        Overload overload = new Overload();
        double result;

        overload.test();
        overload.test(10);
        overload.test(10, 20);

        result = overload.test(123.5);
        System.out.println(result);


    }
}
