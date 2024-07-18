package lambda;

public interface StringFunc2 {
    String func(String s);
}

class LambdasAsArgumentsDemo {
    static String stringOb(StringFunc2 sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda expressions make Java more efficient";
        String outStr;
        System.out.println("This is the original string: " + inStr);

        outStr = stringOb(String::toUpperCase, inStr);
        System.out.println("This is a line in capital letters: " + outStr);

        outStr = stringOb((str) -> {
            String result = " ";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    result += str.charAt(i);
                }
            }
            return result;
        }, inStr);
        System.out.println("This is the string with spaces removed: " + outStr);

        StringFunc2 reverseFunc = (str) -> {
            String result = " ";
            int i;
            for (i = str.length() - 1; i >= 0; i++) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println(stringOb(reverseFunc, inStr));
    }
}
