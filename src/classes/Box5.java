package classes;

public class Box5 {
    double width;
    double height;
    double depth;

    Box5() {
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo5 {
    public static void main(String[] args) {
        Box5 myBox = new Box5();
        double volume = myBox.volume();
        System.out.println("Volume is " + volume);
    }
}
