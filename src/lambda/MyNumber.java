package lambda;
public interface MyNumber {
    double getValue();
}

class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber;
        myNumber = () -> 100.7;
        System.out.println(myNumber.getValue());
        myNumber = () -> Math.random() * 100;
        System.out.println(myNumber.getValue());
//      myNumber = () -> "World";  error type string
    }
}
