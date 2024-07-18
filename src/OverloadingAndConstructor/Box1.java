package OverloadingAndConstructor;

public class Box1 {
    double width;
    double height;
    double depth;

    Box1(Box1 ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
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

class OverloadingConstructor2 {
    public static void main(String[] args) {
        Box1 myBox1 = new Box1(10, 20, 15);
        Box1 myBox2 = new Box1();
        Box1 myCube = new Box1(7);
        Box1 myClone = new Box1(myBox1);

        double volume = myBox1.volume();
        System.out.println("Volume is " + volume);
        double volume1 = myBox2.volume();
        System.out.println("Volume is " + volume1);
        double volume2 = myCube.volume();
        System.out.println("Volume is " + volume2);
        double volume3 = myClone.volume();
        System.out.println("Volume is " + volume3);
    }
}
