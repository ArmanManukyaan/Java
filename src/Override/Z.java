package Override;

public abstract class Z {
    abstract void call();

    void callTo() {
        System.out.println("This is a specific method.");
    }
}

class X extends Z {
    void call() {
        System.out.println("Implementation of the call() method in class B.");
    }
}


    class AbstractDemo {
        public static void main(String[] args) {
            X x = new X();
            x.callTo();
            x.call();
        }
}
