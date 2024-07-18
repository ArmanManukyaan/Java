package generics;

public class Stats<T extends Number> {
    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }

    double average() {
        double sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }
}

class BoundsDemo {
    public static void main(String[] args) {
        Integer[] iNums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(iNums);
        double v = iOb.average();
        System.out.println("Average is " + v);
        Double[] dNums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(dNums);
        double v2 = dOb.average();
        System.out.println("Average is " + v2);

    }
}