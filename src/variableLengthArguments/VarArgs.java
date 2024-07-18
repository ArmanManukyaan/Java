package variableLengthArguments;

public class VarArgs {
    static void vaTest(int... v) {
        System.out.println("Number of arguments: " + (v.length) + " Content");
        for (int x : v) {
            System.out.println("x: " + x);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        vaTest(10, 25, 30);
        vaTest(1, 2, 3);
        vaTest(2, 3, 4);
    }
}
