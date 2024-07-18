package classes;

public class Box3 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo3 {
    public static void main(String[] args) {
        Box3 box = new Box3();
        box.width = 10;
        box.height = 10;
        box.depth = 10;

        double volume = box.volume();
        System.out.println(volume);
    }
}
