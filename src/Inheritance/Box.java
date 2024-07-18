package Inheritance;

public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.4);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);

        double volume = myBox1.volume();
        System.out.println(volume);
        System.out.println(myBox1.weight);
        double volume1 = myBox2.volume();
        System.out.println(myBox2.weight);
        System.out.println(volume1);
    }
}

class RefDemo {
    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(3, 5, 7, 8.7);
        Box plainBox = new Box();
        double vol;
        vol = myBox1.volume();
        System.out.println(vol);
        System.out.println(myBox1.weight);
        plainBox = myBox1;
        vol = plainBox.volume();
        System.out.println(vol);

    }
}