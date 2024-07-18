package lambda;

public interface SomeFunc<T> {
    T func(T t);
}

class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reveres = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println(reveres.func("Lambda"));
        System.out.println(reveres.func("reverse"));

        SomeFunc<Integer> factorial = (fac) -> {
            int result = 1;
            for (int i = 1; i < fac; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println(factorial.func(5));
        System.out.println(factorial.func(2));
    }
}
