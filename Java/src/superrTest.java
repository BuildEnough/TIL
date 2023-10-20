class superPoint {
    int x;
    int y;

    superPoint(int x, int y) {
        super();
        this.x = x;
        this.y = y;
    }
    String getLocation() {
        return "x: " + x + ", y: " + y;
    }
}

class superPoint3D extends superPoint {
    int z;

    superPoint3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    String getLocation() {
        return "x: " + x + ", y: " + y + ", z: " + z;
    }
}

class superrTest {
    public static void main(String[] args) {
        superPoint3D p = new superPoint3D(1, 2, 3);
        System.out.println(p.x);
        System.out.println(p.y);
        System.out.println(p.z);
    }
}
