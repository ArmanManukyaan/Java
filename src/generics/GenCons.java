package generics;

public class GenCons {
    private double value;

    <T extends Number> GenCons(T value) {
        this.value = value.doubleValue();
    }

    void showVal() {
        System.out.println("value: " + value);
    }
}

class GenConsDemo {
    public static void main(String[] args) {
        GenCons test1 = new GenCons(100);
        GenCons test2 = new GenCons(123.5f);

        test1.showVal();
        test2.showVal();

    }
}
