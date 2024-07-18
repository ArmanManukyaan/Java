package lambda;

public interface NumericTest2 {
    boolean test(int a, int b);
}

class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 isFactor = (a, b) -> (a % b) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("The number 2 is a " + " factor of the number 10");
        }

        if (!isFactor.test(5, 2)) {
            System.out.println("The number 3 is not " + "+ multiplier of the number 10");
        }
    }
}