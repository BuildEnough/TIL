class MyPoint3 {
    int x;
    int y;

    MyPoint3(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}

class overrideTest2 {
    public static void main(String[] args) {
        MyPoint3 p = new MyPoint3(2, 5);

        System.out.println(p);
    }
}
