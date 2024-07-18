package thread;

public class Call {
   synchronized void  call(String msg) {
        System.out.println("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
        System.out.print("]");
    }
}

class Caller implements Runnable {
    String msg;
    Call target;
    Thread t;

    public Caller(Call tar, String s) {
        target = tar;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        target.call(msg);
    }
}

class Sync {
    public static void main(String[] args) {
        Call target = new Call();
        Caller obj1 = new Caller(target, "Welcome");
        Caller obj2 = new Caller(target, "in synchronized");
        Caller obj3 = new Caller(target, "world");



        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }



    }
}