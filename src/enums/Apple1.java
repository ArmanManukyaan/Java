package enums;

public enum Apple1 {
    Jonathan(10), GoldenDel(9), RedDel(12), Winesap(15), Cortland(8);
    private int price;

    Apple1(int p) {
        price = p;
    }

    int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

class EnumDemo3 {
    public static void main(String[] args) {
        Apple1 ap;
        System.out.println(Apple1.Winesap.getPrice());

        for (Apple1 a : Apple1.values()) {
            System.out.println(a + ": " + a.getPrice());
        }

    }
}