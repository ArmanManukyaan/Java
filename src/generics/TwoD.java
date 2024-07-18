package generics;

public class TwoD {
    int x, y;

    TwoD(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class ThreeD extends TwoD {
    int z;

    ThreeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

class FourD extends ThreeD {
    int k;

    FourD(int x, int y, int z, int k) {
        super(x, y, z);
        this.k = k;
    }
}

class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] coords) {
        this.coords = coords;
    }
}

class BoundedWildcard {
    static void showXY(Coords<?> c) {
        System.out.println("coordinates XY");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
            System.out.println();
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("coordinates XYZ");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x +
                    " " + c.coords[i].y +
                    " " + c.coords[i].z);
        }
    }

    public static void main(String[] args) {
        TwoD[] td = {
                new TwoD(0, 0),
                new TwoD(7, 9),
                new TwoD(18, 14),
                new TwoD(-1, -23),
        };
        Coords<TwoD> two = new Coords<>(td);
        showXY(two);

        FourD[] fd = {
                new FourD(1, 2, 3, 4),
                new FourD(5, 6, 7, 8),
                new FourD(9, 10, 11, 12),
                new FourD(14, 15, 16, 17),
        };
        Coords<FourD> four = new Coords<>(fd);
                showXY(four);
                showXYZ(four);

    }
}