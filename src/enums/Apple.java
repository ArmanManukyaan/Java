package enums;

public enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;
        System.out.println("Apple Value " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        if (ap == Apple.GoldenDel) {
            System.out.println("Golden Del");
        }

        switch (ap) {
            case Jonathan:
                System.out.println("Jonathan");
                break;
            case GoldenDel:
                System.out.println("Golden Del");
                break;
            case RedDel:
                System.out.println("RedDel");
                break;
            case Winesap:
                System.out.println("Winesap");
                break;
        }
    }
}

class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;

        Apple[] values = Apple.values();
        for (Apple value : values) {
            System.out.println(value + "  ");
        }

        Apple redDel = Apple.valueOf("RedDel");
        System.out.println("Value ap = " + redDel);
    }
}