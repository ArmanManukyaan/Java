package variableLengthArguments;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.println(("vaTest int...v ") + v.length + " Content");
        for (int x : v) {
            System.out.println(x + " ");
            System.out.println();
        }
    }

    static void vaTest(boolean... v) {
        System.out.println(("vaTest boolean...v ") + v.length + " Content");
        for (boolean b : v) {
            System.out.println("b: " + b);
            System.out.println();
        }
    }

    static void vaTest(String msg, int... v) {
        System.out.println(("vaTest String msg , int...v ") + msg + v.length + " Content");
        for (int i : v) {
            System.out.println("i: " + i);
        }
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Examination: ", 10, 20);
        vaTest(true, false, false);
    }
}
