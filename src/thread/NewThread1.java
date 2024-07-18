package thread;

public class NewThread1 extends Thread {

    NewThread1() {
        super("Demo stream: ");
        System.out.println("Child Thread: " + this);
        start();
    }

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

class ExtendThread {
    public static void main(String[] args) {
        new NewThread1();

        for (int i = 5; i > 0; i--) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The actual thread of execution has been interrupted: ");
            }
            System.out.println("The main thread is finished.");
        }
    }
}
