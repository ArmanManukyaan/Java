package lambda;

public interface StringFun {
    String fun(String n);
}

class MyStringOps {
    static String strReverse(String str) {
        String result = "";
        int i;
        for (i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo {
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }
    
    public static void main(String[] args) {
        String inStr = "Lambda expressions increase Java";
        String outStr;
        outStr = stringOp(MyStringOps :: strReverse, inStr);
        System.out.println(inStr);
        System.out.println(outStr);
    }
}
