package classes;

public class Box2 {
    double width;
    double height;
    double depth;

    void volume() {
        System.out.println("Volume is " + width * height * depth);
    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box2 myBox = new Box2();
        myBox.width = 15;
        myBox.height = 20;
        myBox.depth = 25;
        myBox.volume();
    }
}
