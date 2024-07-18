package classes;

public class Box6 {
    double width;
    double height;
    double depth;

    Box6(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        Box6 myBox = new Box6(5.0, 5.0, 5.0);
        double volume = myBox.volume();
        System.out.println("Volume is " + volume);
    }
}