package thread;

public class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this, "Demo stream");
        System.out.println("Child thread created: " + t);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Child thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("The actual thread of execution has been interrupted: ");
            }
        }
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread();

        for (int i = 5; i > 0; i--) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main thread interrupted:");
            }
            System.out.println("Main thread is finished");
        }
    }

}
