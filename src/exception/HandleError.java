package exception;

import java.util.Random;

public class HandleError {
    public static void main(String[] args) {
        Random random = new Random();
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < 3200; i++) {
            try {
                b = random.nextInt();
                c = random.nextInt();
                a = 12345 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Division by zero.");
                a = 0;
            }
            System.out.println("a: " + a);
        }
    }
}
