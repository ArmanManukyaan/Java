package lambda;

public interface NumericTest {
    boolean test(int n);
}

class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven = (n) -> n % 2 == 0;

        if (isEven.test(10)) {
            System.out.println("Number is even");
        }

        if (!isEven.test(3)) {
            System.out.println("Number is odd");
        }

        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(10)) {
            System.out.println("Number is non-negative");
        }

        if (!isNonNeg.test(-1)) {
            System.out.println("Number is negative");
        }

    }
}
