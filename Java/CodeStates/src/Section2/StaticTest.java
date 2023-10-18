package Section2;

public class StaticTest {
    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        System.out.printf("인스턴스 변수: %s%n", staticExample.num1);
        System.out.printf("클래스 변수: %s", StaticExample.num2);
    }
}

class StaticExample {
    int num1 = 10;
    static int num2 = -10;
}
