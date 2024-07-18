package generics;

public class Gen<T> {
    T ob;

    Gen(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName() + " ");
    }
}

class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getOb();
        System.out.println("value " + v);
        Gen<String> strOb = new Gen<>("Test generic");
        String str = strOb.getOb();
        System.out.println("value " + str);
    }
}
