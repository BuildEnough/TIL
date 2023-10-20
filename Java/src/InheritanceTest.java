class MyPoint {
    int x;
    int y;
}

class Circle {
    MyPoint p = new MyPoint();
    int r;
}


class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
        System.out.println(c.p.x);
        System.out.println(c.p.y);
        System.out.println(c.r);
    }
}
