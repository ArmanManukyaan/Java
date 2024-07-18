package variableLengthArguments;

public class VarArgs2 {
    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Content: ");
        for (int x : v) {
            System.out.println("x: " + x);
        }
    }

    public static void main(String[] args) {
        vaTest("One variable length parameter", 10);
        vaTest("Two variable length parameter", 10, 20);
        vaTest("Three variable length parameter", 10, 30, 40);

    }
}
