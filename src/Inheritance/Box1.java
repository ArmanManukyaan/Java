package Inheritance;

public class Box1 {
    private double width;
    private double height;
    private double depth;

    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = width;
        height = height;
        depth = depth;
    }

    Box1() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box1(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight1 extends Box1 {
    double weight;

    BoxWeight1(BoxWeight1 ob) {
        super(ob);
        weight = ob.weight;
    }

    BoxWeight1(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    BoxWeight1() {
        super();
        weight = -1;
    }

    BoxWeight1(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 myBox1 = new BoxWeight1(10, 20, 15, 34.3);
        BoxWeight1 myBox2 = new BoxWeight1(2, 3, 4, 0.076);
        BoxWeight1 myBox3 = new BoxWeight1();
        BoxWeight1 myCube = new BoxWeight1(3, 2);
        BoxWeight1 myClone = new BoxWeight1(myBox1);
        double volume = myBox1.volume();
        System.out.println("Volume is " + volume);
        System.out.println(myBox1.weight);
        double volume1 = myBox2.volume();
        System.out.println("Volume is " + volume1);
        System.out.println(myBox2.weight);
        double volume2 = myBox3.volume();
        System.out.println("Volume is " + volume2);
        System.out.println(myBox3.weight);
        double volume3 = myCube.volume();
        System.out.println("Volume is " + volume3);
        double volume4 = myClone.volume();
        System.out.println("Volume is " + volume4);
    }
}