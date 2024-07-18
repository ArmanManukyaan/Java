package classes;

public class Box4 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }

    void setDepth(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo4 {
    public static void main(String[] args) {
        Box4 myBox = new Box4();
        myBox.setDepth(2.0, 3.0, 4.0);
        double volume = myBox.volume();
        System.out.println("Volume is " + volume);
    }
}
