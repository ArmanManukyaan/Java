package Override;

public class Q {
    void call() {
        System.out.println("method call() from Q");
    }
}

class W extends Q {
    void call() {
        System.out.println("method call() from W");
    }
}

class C extends Q {
    void call() {
        System.out.println("method call() from C");
    }
}

class Dispatch {
    public static void main(String[] args) {
        Q q = new Q();
        W w = new W();
        C c = new C();
        Q r;
        r = q;
        r.call();
        r = w;
        r.call();
        r = c;
        r.call();
    }


}