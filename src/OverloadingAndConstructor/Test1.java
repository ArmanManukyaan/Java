package OverloadingAndConstructor;

public class Test1 {
    int a;

    Test1(int i) {
        a = i;
    }

    Test1 incrByTen() {
        Test1 temp = new Test1(a + 10);
        return temp;
    }
}

class RetObj {
    public static void main(String[] args) {
        Test1 obj1 = new Test1(2);
        Test1 obj2;

        obj2 = obj1.incrByTen();
        System.out.println("ob1.a : " + obj1.a);
        System.out.println("ob2.a : " + obj2.a);

        obj2 = obj2.incrByTen();
        System.out.println("ob2.a : " + obj2.a);
    }
}