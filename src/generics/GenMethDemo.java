package generics;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums)) {
            System.out.println("The number 2 is contained in the nums array");
        }

        if (!isIn(7, nums)) {
            System.out.println("The number 7 is missing from the nums array");
        }
        String[] str = {"one", "two", "three", "four", "five"};

        if (isIn("two", str)) {
            System.out.println("Two is contained in the str array");
        }

        if (!isIn("seven", str)) {
            System.out.println("Seven is not contained in the str array");
        }
    }
}
