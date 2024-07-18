package LoopStatement;

public class WhileAndDoWhileAndFor {
    public static void main(String[] args) {
        int n = 10;
        while (n > 0) {
            System.out.println("number is " + n);
            n--;
        }
    }
}

class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) {
            System.out.println("The average value is " + i);
        }
    }
}

class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("number is " + n);
            n--;
        } while (n > 0);
    }
}

class ForTick {
    public static void main(String[] args) {
        int n;
        for (n = 10; n > 0; n--) {
            System.out.println("number is " + n);
        }
    }
}

class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;
        num = 14;

        if (num < 2) {
            isPrime = false;
        } else {
            isPrime = true;
        }
        for (int i = 2; i < num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }
    }
}

class ForEach {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int arr : array) {
            System.out.print(arr + " ");
            sum = +arr;
        }
        System.out.println();
        System.out.println(sum);

    }
}

class ForEach2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for (int arr : array) {
            if (arr == 5) {
                sum += arr;
                break;
            }
        }
        System.out.println(sum);
    }
}

class Search {
    public static void main(String[] args) {
        int[] array = {2, 10, 4, 5, 16, 7, 8, 65, 32};
        int val = 5;
        boolean found = false;
        for (int arr : array) {
            if (arr == val) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Value found!");
        } else {
            System.out.println("Value Not found!");
        }
    }
}

class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if ((i % 2) == 0) continue;
            System.out.println(" ");

        }
    }
}