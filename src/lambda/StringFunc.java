package lambda;

public interface StringFunc {
    String func(String s);
}

class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";
            int i;
            for (i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Lambda turns to " + reverse.func("adbmal"));
        System.out.println("The expression refers to " + reverse.func("esrever"));
    }
}
