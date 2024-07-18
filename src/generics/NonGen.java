package generics;

public class NonGen {
    Object ob;

    NonGen(Object ob) {
        this.ob = ob;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println(ob.getClass().getName() + " ");
    }
}

class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;
        iOb = new NonGen(88);
        iOb.showType();
        int v = (Integer) iOb.getOb();
        System.out.println("value = " + v);
        NonGen strOb = new NonGen("Text without generic type");
        String str = (String) strOb.getOb();
        System.out.println("str value  = " + str);
        strOb = iOb;
        str = (String) strOb.getOb();
        System.out.println(str);
    }
}

