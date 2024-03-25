public class Tester {
    private int x;
    private static int y;
    public static void main(String[] args) {
        Tester t1 = new Tester();
        t1.x = 2;
        Tester.y = 3;
        Tester t2 = new Tester();
        t2.x = 4;
        t2.y = 5;
        System.out.println(t1.x + "," + t1.y);
        System.out.println(t2.x + "," + Tester.y);
        System.out.println(t2.x + "," + t2.y);
    }
}