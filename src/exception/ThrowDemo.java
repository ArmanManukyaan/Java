package exception;

public class ThrowDemo {
    static void demProc() {
        try {
            throw new NullPointerException("demonstration");
        } catch (NullPointerException e) {
            System.out.println("Exception caught in body " +
                    "method demProc()");
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demProc();
        } catch (NullPointerException e) {
            System.out.println("Re-interception: " + e);
        }
    }

}
