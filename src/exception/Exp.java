package exception;

public class Exp {
    public static void main(String[] args) {
        int a, b = 0;

        try {
            a = 42 / b;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero.");
        }
        System.out.println("After the catch operator.");
    }
}
