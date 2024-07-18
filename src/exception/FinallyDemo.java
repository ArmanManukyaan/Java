package exception;

public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("In the body of the procA() method:");
            throw new RuntimeException("demonstration");
        } finally {
            System.out.println("finally statement block in procA method:");
        }
    }

    static void procB() {
        try {
            System.out.println("In the body of the procB() method:");
            return;
        } finally {
            System.out.println("finally statement block in procB method:");
        }
    }

    static void procC() {
        try {
            System.out.println("In the body of the procC() method:");
        } finally {
            System.out.println("finally statement block in procC method:");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Exception caught:");
        }

        procB();
        procC();
    }
}
