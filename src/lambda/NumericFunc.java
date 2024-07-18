package lambda;

public interface NumericFunc {
    int func(int a);
}

class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc func = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(func.func(3));
        System.out.println(func.func(5));
    }
}
