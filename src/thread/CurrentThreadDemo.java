package thread;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current flow of execution: " + thread);
        thread.setName("My Thread");
        System.out.println("Current flow of execution chang name: " + thread);

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The actual thread of execution has been interrupted: ");
            }
        }
    }
}
