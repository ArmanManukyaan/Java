package thread;

public class NewThread2 implements Runnable {
    String name;
    Thread t;


    NewThread2(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New Thread: " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(name + " interrupted");
            }
            System.out.println(name + " completed");
        }
    }
}

class DemoJoin {
    public static void main(String[] args) {
        NewThread2 thread1 = new NewThread2("One");
        NewThread2 thread2 = new NewThread2("Two");
        NewThread2 thread3 = new NewThread2("Three");

        System.out.println("Thread One is running: " + thread1.t.isAlive());
        System.out.println("Thread Two is running: " + thread2.t.isAlive());
        System.out.println("Thread Three is running: " + thread3.t.isAlive());

        try {
            System.out.println("Waiting for threads to complete");
            thread1.t.join();
            thread2.t.join();
            thread3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Thread One is running: " + thread1.t.isAlive());
        System.out.println("Thread Two is running: " + thread2.t.isAlive());
        System.out.println("Thread Three is running: " + thread3.t.isAlive());
    }
}
